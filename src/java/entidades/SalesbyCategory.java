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
@Table(name = "Sales by Category")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SalesbyCategory.findAll", query = "SELECT s FROM SalesbyCategory s")
    , @NamedQuery(name = "SalesbyCategory.findByCategoryID", query = "SELECT s FROM SalesbyCategory s WHERE s.categoryID = :categoryID")
    , @NamedQuery(name = "SalesbyCategory.findByCategoryName", query = "SELECT s FROM SalesbyCategory s WHERE s.categoryName = :categoryName")
    , @NamedQuery(name = "SalesbyCategory.findByProductName", query = "SELECT s FROM SalesbyCategory s WHERE s.productName = :productName")
    , @NamedQuery(name = "SalesbyCategory.findByProductSales", query = "SELECT s FROM SalesbyCategory s WHERE s.productSales = :productSales")})
public class SalesbyCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CategoryID")
    @Id
    private int categoryID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "CategoryName")
    private String categoryName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ProductName")
    private String productName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ProductSales")
    private Double productSales;

    public SalesbyCategory() {
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductSales() {
        return productSales;
    }

    public void setProductSales(Double productSales) {
        this.productSales = productSales;
    }
    
}
