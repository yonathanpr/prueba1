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
@Table(name = "Customer and Suppliers by City")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerandSuppliersbyCity.findAll", query = "SELECT c FROM CustomerandSuppliersbyCity c")
    , @NamedQuery(name = "CustomerandSuppliersbyCity.findByCity", query = "SELECT c FROM CustomerandSuppliersbyCity c WHERE c.city = :city")
    , @NamedQuery(name = "CustomerandSuppliersbyCity.findByCompanyName", query = "SELECT c FROM CustomerandSuppliersbyCity c WHERE c.companyName = :companyName")
    , @NamedQuery(name = "CustomerandSuppliersbyCity.findByContactName", query = "SELECT c FROM CustomerandSuppliersbyCity c WHERE c.contactName = :contactName")
    , @NamedQuery(name = "CustomerandSuppliersbyCity.findByRelationship", query = "SELECT c FROM CustomerandSuppliersbyCity c WHERE c.relationship = :relationship")})
public class CustomerandSuppliersbyCity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 15)
    @Column(name = "City")
    @Id
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CompanyName")
    private String companyName;
    @Size(max = 30)
    @Column(name = "ContactName")
    private String contactName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "Relationship")
    private String relationship;

    public CustomerandSuppliersbyCity() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
    
}
