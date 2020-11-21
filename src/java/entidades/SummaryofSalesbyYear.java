/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yonathanpr
 */
@Entity
@Table(name = "Summary of Sales by Year")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SummaryofSalesbyYear.findAll", query = "SELECT s FROM SummaryofSalesbyYear s")
    , @NamedQuery(name = "SummaryofSalesbyYear.findByShippedDate", query = "SELECT s FROM SummaryofSalesbyYear s WHERE s.shippedDate = :shippedDate")
    , @NamedQuery(name = "SummaryofSalesbyYear.findByOrderID", query = "SELECT s FROM SummaryofSalesbyYear s WHERE s.orderID = :orderID")
    , @NamedQuery(name = "SummaryofSalesbyYear.findBySubtotal", query = "SELECT s FROM SummaryofSalesbyYear s WHERE s.subtotal = :subtotal")})
public class SummaryofSalesbyYear implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "ShippedDate")
    @Temporal(TemporalType.TIMESTAMP)
    @Id
    private Date shippedDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderID")
    private int orderID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Subtotal")
    private Double subtotal;

    public SummaryofSalesbyYear() {
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
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
