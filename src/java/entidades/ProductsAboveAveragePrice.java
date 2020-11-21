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
@Table(name = "Products Above Average Price")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductsAboveAveragePrice.findAll", query = "SELECT p FROM ProductsAboveAveragePrice p")
    , @NamedQuery(name = "ProductsAboveAveragePrice.findByProductName", query = "SELECT p FROM ProductsAboveAveragePrice p WHERE p.productName = :productName")
    , @NamedQuery(name = "ProductsAboveAveragePrice.findByUnitPrice", query = "SELECT p FROM ProductsAboveAveragePrice p WHERE p.unitPrice = :unitPrice")})
public class ProductsAboveAveragePrice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ProductName")
    @Id
    private String productName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "UnitPrice")
    private BigDecimal unitPrice;

    public ProductsAboveAveragePrice() {
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
    
}
