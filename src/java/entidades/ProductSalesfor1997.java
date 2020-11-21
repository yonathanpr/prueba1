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
@Table(name = "Product Sales for 1997")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductSalesfor1997.findAll", query = "SELECT p FROM ProductSalesfor1997 p")
    , @NamedQuery(name = "ProductSalesfor1997.findByCategoryName", query = "SELECT p FROM ProductSalesfor1997 p WHERE p.categoryName = :categoryName")
    , @NamedQuery(name = "ProductSalesfor1997.findByProductName", query = "SELECT p FROM ProductSalesfor1997 p WHERE p.productName = :productName")
    , @NamedQuery(name = "ProductSalesfor1997.findByProductSales", query = "SELECT p FROM ProductSalesfor1997 p WHERE p.productSales = :productSales")})
public class ProductSalesfor1997 implements Serializable {

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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ProductSales")
    private Double productSales;

    public ProductSalesfor1997() {
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
