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
@Table(name = "Current Product List")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CurrentProductList.findAll", query = "SELECT c FROM CurrentProductList c")
    , @NamedQuery(name = "CurrentProductList.findByProductID", query = "SELECT c FROM CurrentProductList c WHERE c.productID = :productID")
    , @NamedQuery(name = "CurrentProductList.findByProductName", query = "SELECT c FROM CurrentProductList c WHERE c.productName = :productName")})
public class CurrentProductList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    @Id
    private int productID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ProductName")
    private String productName;

    public CurrentProductList() {
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
    
}
