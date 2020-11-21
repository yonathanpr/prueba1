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
@Table(name = "Alphabetical list of products")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alphabeticallistofproducts.findAll", query = "SELECT a FROM Alphabeticallistofproducts a")
    , @NamedQuery(name = "Alphabeticallistofproducts.findByProductID", query = "SELECT a FROM Alphabeticallistofproducts a WHERE a.productID = :productID")
    , @NamedQuery(name = "Alphabeticallistofproducts.findByProductName", query = "SELECT a FROM Alphabeticallistofproducts a WHERE a.productName = :productName")
    , @NamedQuery(name = "Alphabeticallistofproducts.findBySupplierID", query = "SELECT a FROM Alphabeticallistofproducts a WHERE a.supplierID = :supplierID")
    , @NamedQuery(name = "Alphabeticallistofproducts.findByCategoryID", query = "SELECT a FROM Alphabeticallistofproducts a WHERE a.categoryID = :categoryID")
    , @NamedQuery(name = "Alphabeticallistofproducts.findByQuantityPerUnit", query = "SELECT a FROM Alphabeticallistofproducts a WHERE a.quantityPerUnit = :quantityPerUnit")
    , @NamedQuery(name = "Alphabeticallistofproducts.findByUnitPrice", query = "SELECT a FROM Alphabeticallistofproducts a WHERE a.unitPrice = :unitPrice")
    , @NamedQuery(name = "Alphabeticallistofproducts.findByUnitsInStock", query = "SELECT a FROM Alphabeticallistofproducts a WHERE a.unitsInStock = :unitsInStock")
    , @NamedQuery(name = "Alphabeticallistofproducts.findByUnitsOnOrder", query = "SELECT a FROM Alphabeticallistofproducts a WHERE a.unitsOnOrder = :unitsOnOrder")
    , @NamedQuery(name = "Alphabeticallistofproducts.findByReorderLevel", query = "SELECT a FROM Alphabeticallistofproducts a WHERE a.reorderLevel = :reorderLevel")
    , @NamedQuery(name = "Alphabeticallistofproducts.findByDiscontinued", query = "SELECT a FROM Alphabeticallistofproducts a WHERE a.discontinued = :discontinued")
    , @NamedQuery(name = "Alphabeticallistofproducts.findByCategoryName", query = "SELECT a FROM Alphabeticallistofproducts a WHERE a.categoryName = :categoryName")})
public class Alphabeticallistofproducts implements Serializable {

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
    @Column(name = "SupplierID")
    private Integer supplierID;
    @Column(name = "CategoryID")
    private Integer categoryID;
    @Size(max = 20)
    @Column(name = "QuantityPerUnit")
    private String quantityPerUnit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "UnitPrice")
    private BigDecimal unitPrice;
    @Column(name = "UnitsInStock")
    private Short unitsInStock;
    @Column(name = "UnitsOnOrder")
    private Short unitsOnOrder;
    @Column(name = "ReorderLevel")
    private Short reorderLevel;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Discontinued")
    private boolean discontinued;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "CategoryName")
    private String categoryName;

    public Alphabeticallistofproducts() {
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

    public Integer getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(Integer supplierID) {
        this.supplierID = supplierID;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Short getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(Short unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public Short getUnitsOnOrder() {
        return unitsOnOrder;
    }

    public void setUnitsOnOrder(Short unitsOnOrder) {
        this.unitsOnOrder = unitsOnOrder;
    }

    public Short getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(Short reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public boolean getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    
}
