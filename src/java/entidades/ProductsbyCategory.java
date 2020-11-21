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
@Table(name = "Products by Category")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductsbyCategory.findAll", query = "SELECT p FROM ProductsbyCategory p")
    , @NamedQuery(name = "ProductsbyCategory.findByCategoryName", query = "SELECT p FROM ProductsbyCategory p WHERE p.categoryName = :categoryName")
    , @NamedQuery(name = "ProductsbyCategory.findByProductName", query = "SELECT p FROM ProductsbyCategory p WHERE p.productName = :productName")
    , @NamedQuery(name = "ProductsbyCategory.findByQuantityPerUnit", query = "SELECT p FROM ProductsbyCategory p WHERE p.quantityPerUnit = :quantityPerUnit")
    , @NamedQuery(name = "ProductsbyCategory.findByUnitsInStock", query = "SELECT p FROM ProductsbyCategory p WHERE p.unitsInStock = :unitsInStock")
    , @NamedQuery(name = "ProductsbyCategory.findByDiscontinued", query = "SELECT p FROM ProductsbyCategory p WHERE p.discontinued = :discontinued")})
public class ProductsbyCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "CategoryName")
    @Id
    private String categoryName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ProductName")
    private String productName;
    @Size(max = 20)
    @Column(name = "QuantityPerUnit")
    private String quantityPerUnit;
    @Column(name = "UnitsInStock")
    private Short unitsInStock;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Discontinued")
    private boolean discontinued;

    public ProductsbyCategory() {
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

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public Short getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Short unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }
    
}
