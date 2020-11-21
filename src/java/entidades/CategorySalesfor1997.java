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
@Table(name = "Category Sales for 1997")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategorySalesfor1997.findAll", query = "SELECT c FROM CategorySalesfor1997 c")
    , @NamedQuery(name = "CategorySalesfor1997.findByCategoryName", query = "SELECT c FROM CategorySalesfor1997 c WHERE c.categoryName = :categoryName")
    , @NamedQuery(name = "CategorySalesfor1997.findByCategorySales", query = "SELECT c FROM CategorySalesfor1997 c WHERE c.categorySales = :categorySales")})
public class CategorySalesfor1997 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "CategoryName")
    @Id
    private String categoryName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CategorySales")
    private Double categorySales;

    public CategorySalesfor1997() {
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Double getCategorySales() {
        return categorySales;
    }

    public void setCategorySales(Double categorySales) {
        this.categorySales = categorySales;
    }
    
}
