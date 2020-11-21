/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yonathanpr
 */
@Entity
@Table(name = "Order Subtotals")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderSubtotals.findAll", query = "SELECT o FROM OrderSubtotals o")
    , @NamedQuery(name = "OrderSubtotals.findByOrderID", query = "SELECT o FROM OrderSubtotals o WHERE o.orderID = :orderID")
    , @NamedQuery(name = "OrderSubtotals.findBySubtotal", query = "SELECT o FROM OrderSubtotals o WHERE o.subtotal = :subtotal")})
public class OrderSubtotals implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderID")
    @Id
    private int orderID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Subtotal")
    private Double subtotal;

    public OrderSubtotals() {
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
    
}
