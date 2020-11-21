/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "Orders Qry")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdersQry.findAll", query = "SELECT o FROM OrdersQry o")
    , @NamedQuery(name = "OrdersQry.findByOrderID", query = "SELECT o FROM OrdersQry o WHERE o.orderID = :orderID")
    , @NamedQuery(name = "OrdersQry.findByCustomerID", query = "SELECT o FROM OrdersQry o WHERE o.customerID = :customerID")
    , @NamedQuery(name = "OrdersQry.findByEmployeeID", query = "SELECT o FROM OrdersQry o WHERE o.employeeID = :employeeID")
    , @NamedQuery(name = "OrdersQry.findByOrderDate", query = "SELECT o FROM OrdersQry o WHERE o.orderDate = :orderDate")
    , @NamedQuery(name = "OrdersQry.findByRequiredDate", query = "SELECT o FROM OrdersQry o WHERE o.requiredDate = :requiredDate")
    , @NamedQuery(name = "OrdersQry.findByShippedDate", query = "SELECT o FROM OrdersQry o WHERE o.shippedDate = :shippedDate")
    , @NamedQuery(name = "OrdersQry.findByShipVia", query = "SELECT o FROM OrdersQry o WHERE o.shipVia = :shipVia")
    , @NamedQuery(name = "OrdersQry.findByFreight", query = "SELECT o FROM OrdersQry o WHERE o.freight = :freight")
    , @NamedQuery(name = "OrdersQry.findByShipName", query = "SELECT o FROM OrdersQry o WHERE o.shipName = :shipName")
    , @NamedQuery(name = "OrdersQry.findByShipAddress", query = "SELECT o FROM OrdersQry o WHERE o.shipAddress = :shipAddress")
    , @NamedQuery(name = "OrdersQry.findByShipCity", query = "SELECT o FROM OrdersQry o WHERE o.shipCity = :shipCity")
    , @NamedQuery(name = "OrdersQry.findByShipRegion", query = "SELECT o FROM OrdersQry o WHERE o.shipRegion = :shipRegion")
    , @NamedQuery(name = "OrdersQry.findByShipPostalCode", query = "SELECT o FROM OrdersQry o WHERE o.shipPostalCode = :shipPostalCode")
    , @NamedQuery(name = "OrdersQry.findByShipCountry", query = "SELECT o FROM OrdersQry o WHERE o.shipCountry = :shipCountry")
    , @NamedQuery(name = "OrdersQry.findByCompanyName", query = "SELECT o FROM OrdersQry o WHERE o.companyName = :companyName")
    , @NamedQuery(name = "OrdersQry.findByAddress", query = "SELECT o FROM OrdersQry o WHERE o.address = :address")
    , @NamedQuery(name = "OrdersQry.findByCity", query = "SELECT o FROM OrdersQry o WHERE o.city = :city")
    , @NamedQuery(name = "OrdersQry.findByRegion", query = "SELECT o FROM OrdersQry o WHERE o.region = :region")
    , @NamedQuery(name = "OrdersQry.findByPostalCode", query = "SELECT o FROM OrdersQry o WHERE o.postalCode = :postalCode")
    , @NamedQuery(name = "OrdersQry.findByCountry", query = "SELECT o FROM OrdersQry o WHERE o.country = :country")})
public class OrdersQry implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderID")
    @Id
    private int orderID;
    @Size(max = 5)
    @Column(name = "CustomerID")
    private String customerID;
    @Column(name = "EmployeeID")
    private Integer employeeID;
    @Column(name = "OrderDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    @Column(name = "RequiredDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requiredDate;
    @Column(name = "ShippedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date shippedDate;
    @Column(name = "ShipVia")
    private Integer shipVia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Freight")
    private BigDecimal freight;
    @Size(max = 40)
    @Column(name = "ShipName")
    private String shipName;
    @Size(max = 60)
    @Column(name = "ShipAddress")
    private String shipAddress;
    @Size(max = 15)
    @Column(name = "ShipCity")
    private String shipCity;
    @Size(max = 15)
    @Column(name = "ShipRegion")
    private String shipRegion;
    @Size(max = 10)
    @Column(name = "ShipPostalCode")
    private String shipPostalCode;
    @Size(max = 15)
    @Column(name = "ShipCountry")
    private String shipCountry;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CompanyName")
    private String companyName;
    @Size(max = 60)
    @Column(name = "Address")
    private String address;
    @Size(max = 15)
    @Column(name = "City")
    private String city;
    @Size(max = 15)
    @Column(name = "Region")
    private String region;
    @Size(max = 10)
    @Column(name = "PostalCode")
    private String postalCode;
    @Size(max = 15)
    @Column(name = "Country")
    private String country;

    public OrdersQry() {
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public Integer getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(Integer employeeID) {
        this.employeeID = employeeID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(Date requiredDate) {
        this.requiredDate = requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(Date shippedDate) {
        this.shippedDate = shippedDate;
    }

    public Integer getShipVia() {
        return shipVia;
    }

    public void setShipVia(Integer shipVia) {
        this.shipVia = shipVia;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public void setShipCity(String shipCity) {
        this.shipCity = shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public void setShipRegion(String shipRegion) {
        this.shipRegion = shipRegion;
    }

    public String getShipPostalCode() {
        return shipPostalCode;
    }

    public void setShipPostalCode(String shipPostalCode) {
        this.shipPostalCode = shipPostalCode;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public void setShipCountry(String shipCountry) {
        this.shipCountry = shipCountry;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
