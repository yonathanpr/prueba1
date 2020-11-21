/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yonathanpr
 */
@Entity
@Table(name = "Order Details Extended")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrderDetailsExtended.findAll", query = "SELECT o FROM OrderDetailsExtended o")
    , @NamedQuery(name = "OrderDetailsExtended.findByOrderID", query = "SELECT o FROM OrderDetailsExtended o WHERE o.orderID = :orderID")
    , @NamedQuery(name = "OrderDetailsExtended.findByProductID", query = "SELECT o FROM OrderDetailsExtended o WHERE o.productID = :productID")
    , @NamedQuery(name = "OrderDetailsExtended.findByProductName", query = "SELECT o FROM OrderDetailsExtended o WHERE o.productName = :productName")
    , @NamedQuery(name = "OrderDetailsExtended.findByUnitPrice", query = "SELECT o FROM OrderDetailsExtended o WHERE o.unitPrice = :unitPrice")
    , @NamedQuery(name = "OrderDetailsExtended.findByQuantity", query = "SELECT o FROM OrderDetailsExtended o WHERE o.quantity = :quantity")
    , @NamedQuery(name = "OrderDetailsExtended.findByDiscount", query = "SELECT o FROM OrderDetailsExtended o WHERE o.discount = :discount")
    , @NamedQuery(name = "OrderDetailsExtended.findByExtendedPrice", query = "SELECT o FROM OrderDetailsExtended o WHERE o.extendedPrice = :extendedPrice")})
public class OrderDetailsExtended implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderID")
    @Id
    private int orderID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    private int productID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ProductName")
    private String productName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "UnitPrice")
    private BigDecimal unitPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantity")
    private short quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Discount")
    private double discount;
    @Column(name = "ExtendedPrice")
    private Double extendedPrice;

    public OrderDetailsExtended() {
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Double getExtendedPrice() {
        return extendedPrice;
    }

    public void setExtendedPrice(Double extendedPrice) {
        this.extendedPrice = extendedPrice;
    }
    
}
