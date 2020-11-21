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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yonathanpr
 */
@Entity
@Table(name = "Sales Totals by Amount")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesTotalsbyAmount.findAll", query = "SELECT s FROM SalesTotalsbyAmount s")
    , @NamedQuery(name = "SalesTotalsbyAmount.findBySaleAmount", query = "SELECT s FROM SalesTotalsbyAmount s WHERE s.saleAmount = :saleAmount")
    , @NamedQuery(name = "SalesTotalsbyAmount.findByOrderID", query = "SELECT s FROM SalesTotalsbyAmount s WHERE s.orderID = :orderID")
    , @NamedQuery(name = "SalesTotalsbyAmount.findByCompanyName", query = "SELECT s FROM SalesTotalsbyAmount s WHERE s.companyName = :companyName")
    , @NamedQuery(name = "SalesTotalsbyAmount.findByShippedDate", query = "SELECT s FROM SalesTotalsbyAmount s WHERE s.shippedDate = :shippedDate")})
public class SalesTotalsbyAmount implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SaleAmount")
    @Id
    private Double saleAmount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderID")
    private int orderID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CompanyName")
    private String companyName;
    @Column(name = "ShippedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date shippedDate;

    public SalesTotalsbyAmount() {
    }

    public Double getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(Double saleAmount) {
        this.saleAmount = saleAmount;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }
    
}
