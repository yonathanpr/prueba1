package jsfpk;

import entidades.OrderDetails;
import jsfpk.util.JsfUtil;
import jsfpk.util.JsfUtil.PersistAction;
import sessionbeanpk.OrderDetailsFacade;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("orderDetailsController")
@SessionScoped
public class OrderDetailsController implements Serializable {

    @EJB
    private sessionbeanpk.OrderDetailsFacade ejbFacade;
    private List<OrderDetails> items = null;
    private OrderDetails selected;

    public OrderDetailsController() {
    }

    public OrderDetails getSelected() {
        return selected;
    }

    public void setSelected(OrderDetails selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
        selected.getOrderDetailsPK().setProductID(selected.getProducts().getProductID());
        selected.getOrderDetailsPK().setOrderID(selected.getOrders().getOrderID());
    }

    protected void initializeEmbeddableKey() {
        selected.setOrderDetailsPK(new entidades.OrderDetailsPK());
    }

    private OrderDetailsFacade getFacade() {
        return ejbFacade;
    }

    public OrderDetails prepareCreate() {
        selected = new OrderDetails();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("OrderDetailsCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("OrderDetailsUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("OrderDetailsDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<OrderDetails> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public OrderDetails getOrderDetails(entidades.OrderDetailsPK id) {
        return getFacade().find(id);
    }

    public List<OrderDetails> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<OrderDetails> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = OrderDetails.class)
    public static class OrderDetailsControllerConverter implements Converter {

        private static final String SEPARATOR = "#";
        private static final String SEPARATOR_ESCAPED = "\\#";

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            OrderDetailsController controller = (OrderDetailsController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "orderDetailsController");
            return controller.getOrderDetails(getKey(value));
        }

        entidades.OrderDetailsPK getKey(String value) {
            entidades.OrderDetailsPK key;
            String values[] = value.split(SEPARATOR_ESCAPED);
            key = new entidades.OrderDetailsPK();
            key.setOrderID(Integer.parseInt(values[0]));
            key.setProductID(Integer.parseInt(values[1]));
            return key;
        }

        String getStringKey(entidades.OrderDetailsPK value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value.getOrderID());
            sb.append(SEPARATOR);
            sb.append(value.getProductID());
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof OrderDetails) {
                OrderDetails o = (OrderDetails) object;
                return getStringKey(o.getOrderDetailsPK());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), OrderDetails.class.getName()});
                return null;
            }
        }

    }

}
