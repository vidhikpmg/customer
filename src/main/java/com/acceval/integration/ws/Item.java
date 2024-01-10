
package com.acceval.integration.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deliveryPlant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="distributionChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="materialGroup1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="materialGroup2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="materialGroup3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="materialGroup4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="packaging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesAreaDeletionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesOrganisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesUom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "deliveryPlant",
    "distributionChannel",
    "materialGroup1",
    "materialGroup2",
    "materialGroup3",
    "materialGroup4",
    "packaging",
    "salesAreaDeletionFlag",
    "salesOrganisation",
    "salesUom"
})
public class Item {

    @XmlElementRef(name = "deliveryPlant", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryPlant;
    protected String distributionChannel;
    protected String materialGroup1;
    protected String materialGroup2;
    protected String materialGroup3;
    protected String materialGroup4;
    @XmlElementRef(name = "packaging", type = JAXBElement.class, required = false)
    protected JAXBElement<String> packaging;
    @XmlElementRef(name = "salesAreaDeletionFlag", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesAreaDeletionFlag;
    protected String salesOrganisation;
    @XmlElementRef(name = "salesUom", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesUom;

    /**
     * Gets the value of the deliveryPlant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryPlant() {
        return deliveryPlant;
    }

    /**
     * Sets the value of the deliveryPlant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryPlant(JAXBElement<String> value) {
        this.deliveryPlant = value;
    }

    /**
     * Gets the value of the distributionChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistributionChannel() {
        return distributionChannel;
    }

    /**
     * Sets the value of the distributionChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistributionChannel(String value) {
        this.distributionChannel = value;
    }

    /**
     * Gets the value of the materialGroup1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialGroup1() {
        return materialGroup1;
    }

    /**
     * Sets the value of the materialGroup1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialGroup1(String value) {
        this.materialGroup1 = value;
    }

    /**
     * Gets the value of the materialGroup2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialGroup2() {
        return materialGroup2;
    }

    /**
     * Sets the value of the materialGroup2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialGroup2(String value) {
        this.materialGroup2 = value;
    }

    /**
     * Gets the value of the materialGroup3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialGroup3() {
        return materialGroup3;
    }

    /**
     * Sets the value of the materialGroup3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialGroup3(String value) {
        this.materialGroup3 = value;
    }

    /**
     * Gets the value of the materialGroup4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialGroup4() {
        return materialGroup4;
    }

    /**
     * Sets the value of the materialGroup4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialGroup4(String value) {
        this.materialGroup4 = value;
    }

    /**
     * Gets the value of the packaging property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPackaging() {
        return packaging;
    }

    /**
     * Sets the value of the packaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPackaging(JAXBElement<String> value) {
        this.packaging = value;
    }

    /**
     * Gets the value of the salesAreaDeletionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAreaDeletionFlag() {
        return salesAreaDeletionFlag;
    }

    /**
     * Sets the value of the salesAreaDeletionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAreaDeletionFlag(JAXBElement<String> value) {
        this.salesAreaDeletionFlag = value;
    }

    /**
     * Gets the value of the salesOrganisation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOrganisation() {
        return salesOrganisation;
    }

    /**
     * Sets the value of the salesOrganisation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOrganisation(String value) {
        this.salesOrganisation = value;
    }

    /**
     * Gets the value of the salesUom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesUom() {
        return salesUom;
    }

    /**
     * Sets the value of the salesUom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesUom(JAXBElement<String> value) {
        this.salesUom = value;
    }

}
