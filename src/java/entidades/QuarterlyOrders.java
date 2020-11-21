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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yonathanpr
 */
@Entity
@Table(name = "Quarterly Orders")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "QuarterlyOrders.findAll", query = "SELECT q FROM QuarterlyOrders q")
    , @NamedQuery(name = "QuarterlyOrders.findByCustomerID", query = "SELECT q FROM QuarterlyOrders q WHERE q.customerID = :customerID")
    , @NamedQuery(name = "QuarterlyOrders.findByCompanyName", query = "SELECT q FROM QuarterlyOrders q WHERE q.companyName = :companyName")
    , @NamedQuery(name = "QuarterlyOrders.findByCity", query = "SELECT q FROM QuarterlyOrders q WHERE q.city = :city")
    , @NamedQuery(name = "QuarterlyOrders.findByCountry", query = "SELECT q FROM QuarterlyOrders q WHERE q.country = :country")})
public class QuarterlyOrders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "CustomerID")
    @Id
    private String customerID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CompanyName")
    private String companyName;
    @Size(max = 15)
    @Column(name = "City")
    private String city;
    @Size(max = 15)
    @Column(name = "Country")
    private String country;

    public QuarterlyOrders() {
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
