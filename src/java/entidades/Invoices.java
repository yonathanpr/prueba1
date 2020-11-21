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
@Table(name = "Invoices")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Invoices.findAll", query = "SELECT i FROM Invoices i")
    , @NamedQuery(name = "Invoices.findByShipName", query = "SELECT i FROM Invoices i WHERE i.shipName = :shipName")
    , @NamedQuery(name = "Invoices.findByShipAddress", query = "SELECT i FROM Invoices i WHERE i.shipAddress = :shipAddress")
    , @NamedQuery(name = "Invoices.findByShipCity", query = "SELECT i FROM Invoices i WHERE i.shipCity = :shipCity")
    , @NamedQuery(name = "Invoices.findByShipRegion", query = "SELECT i FROM Invoices i WHERE i.shipRegion = :shipRegion")
    , @NamedQuery(name = "Invoices.findByShipPostalCode", query = "SELECT i FROM Invoices i WHERE i.shipPostalCode = :shipPostalCode")
    , @NamedQuery(name = "Invoices.findByShipCountry", query = "SELECT i FROM Invoices i WHERE i.shipCountry = :shipCountry")
    , @NamedQuery(name = "Invoices.findByCustomerID", query = "SELECT i FROM Invoices i WHERE i.customerID = :customerID")
    , @NamedQuery(name = "Invoices.findByCustomerName", query = "SELECT i FROM Invoices i WHERE i.customerName = :customerName")
    , @NamedQuery(name = "Invoices.findByAddress", query = "SELECT i FROM Invoices i WHERE i.address = :address")
    , @NamedQuery(name = "Invoices.findByCity", query = "SELECT i FROM Invoices i WHERE i.city = :city")
    , @NamedQuery(name = "Invoices.findByRegion", query = "SELECT i FROM Invoices i WHERE i.region = :region")
    , @NamedQuery(name = "Invoices.findByPostalCode", query = "SELECT i FROM Invoices i WHERE i.postalCode = :postalCode")
    , @NamedQuery(name = "Invoices.findByCountry", query = "SELECT i FROM Invoices i WHERE i.country = :country")
    , @NamedQuery(name = "Invoices.findBySalesperson", query = "SELECT i FROM Invoices i WHERE i.salesperson = :salesperson")
    , @NamedQuery(name = "Invoices.findByOrderID", query = "SELECT i FROM Invoices i WHERE i.orderID = :orderID")
    , @NamedQuery(name = "Invoices.findByOrderDate", query = "SELECT i FROM Invoices i WHERE i.orderDate = :orderDate")
    , @NamedQuery(name = "Invoices.findByRequiredDate", query = "SELECT i FROM Invoices i WHERE i.requiredDate = :requiredDate")
    , @NamedQuery(name = "Invoices.findByShippedDate", query = "SELECT i FROM Invoices i WHERE i.shippedDate = :shippedDate")
    , @NamedQuery(name = "Invoices.findByShipperName", query = "SELECT i FROM Invoices i WHERE i.shipperName = :shipperName")
    , @NamedQuery(name = "Invoices.findByProductID", query = "SELECT i FROM Invoices i WHERE i.productID = :productID")
    , @NamedQuery(name = "Invoices.findByProductName", query = "SELECT i FROM Invoices i WHERE i.productName = :productName")
    , @NamedQuery(name = "Invoices.findByUnitPrice", query = "SELECT i FROM Invoices i WHERE i.unitPrice = :unitPrice")
    , @NamedQuery(name = "Invoices.findByQuantity", query = "SELECT i FROM Invoices i WHERE i.quantity = :quantity")
    , @NamedQuery(name = "Invoices.findByDiscount", query = "SELECT i FROM Invoices i WHERE i.discount = :discount")
    , @NamedQuery(name = "Invoices.findByExtendedPrice", query = "SELECT i FROM Invoices i WHERE i.extendedPrice = :extendedPrice")
    , @NamedQuery(name = "Invoices.findByFreight", query = "SELECT i FROM Invoices i WHERE i.freight = :freight")})
public class Invoices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 40)
    @Column(name = "ShipName")
    @Id
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
    @Size(max = 5)
    @Column(name = "CustomerID")
    private String customerID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CustomerName")
    private String customerName;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "Salesperson")
    private double salesperson;
    @Basic(optional = false)
    @NotNull
    @Column(name = "OrderID")
    private int orderID;
    @Column(name = "OrderDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;
    @Column(name = "RequiredDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requiredDate;
    @Column(name = "ShippedDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date shippedDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ShipperName")
    private String shipperName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductID")
    private int productID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "ProductName")
    private String productName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "UnitPrice")
    private BigDecimal unitPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Quantity")
    private short quantity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Discount")
    private double discount;
    @Column(name = "ExtendedPrice")
    private Double extendedPrice;
    @Column(name = "Freight")
    private BigDecimal freight;

    public Invoices() {
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

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public double getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(double salesperson) {
        this.salesperson = salesperson;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
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

    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
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

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Double getExtendedPrice() {
        return extendedPrice;
    }

    public void setExtendedPrice(Double extendedPrice) {
        this.extendedPrice = extendedPrice;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }
    
}
