
package com.acceval.integration.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for masterDataMaterialInMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="masterDataMaterialInMessage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="baseUom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="items" type="{http://ws.integration.acceval.com/}item" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="materialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="multilingualNames" type="{http://ws.integration.acceval.com/}multilingualValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="multilingualSalesSpecs" type="{http://ws.integration.acceval.com/}multilingualValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentProduct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plantItems" type="{http://ws.integration.acceval.com/}plantItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="prodocutDeletionFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesSpec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "masterDataMaterialInMessage", propOrder = {
    "baseUom",
    "code",
    "division",
    "items",
    "materialType",
    "multilingualNames",
    "multilingualSalesSpecs",
    "name",
    "parentProduct",
    "plantItems",
    "prodocutDeletionFlag",
    "salesSpec"
})
public class MasterDataMaterialInMessage {

    protected String baseUom;
    protected String code;
    protected String division;
    @XmlElement(nillable = true)
    protected List<Item> items;
    protected String materialType;
    @XmlElement(nillable = true)
    protected List<MultilingualValue> multilingualNames;
    @XmlElement(nillable = true)
    protected List<MultilingualValue> multilingualSalesSpecs;
    protected String name;
    protected String parentProduct;
    @XmlElement(nillable = true)
    protected List<PlantItem> plantItems;
    @XmlElementRef(name = "prodocutDeletionFlag", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prodocutDeletionFlag;
    @XmlElementRef(name = "salesSpec", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesSpec;

    /**
     * Gets the value of the baseUom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseUom() {
        return baseUom;
    }

    /**
     * Sets the value of the baseUom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseUom(String value) {
        this.baseUom = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the division property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the value of the division property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivision(String value) {
        this.division = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Item }
     * 
     * 
     */
    public List<Item> getItems() {
        if (items == null) {
            items = new ArrayList<Item>();
        }
        return this.items;
    }

    /**
     * Gets the value of the materialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialType() {
        return materialType;
    }

    /**
     * Sets the value of the materialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialType(String value) {
        this.materialType = value;
    }

    /**
     * Gets the value of the multilingualNames property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multilingualNames property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultilingualNames().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualValue }
     * 
     * 
     */
    public List<MultilingualValue> getMultilingualNames() {
        if (multilingualNames == null) {
            multilingualNames = new ArrayList<MultilingualValue>();
        }
        return this.multilingualNames;
    }

    /**
     * Gets the value of the multilingualSalesSpecs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multilingualSalesSpecs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultilingualSalesSpecs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualValue }
     * 
     * 
     */
    public List<MultilingualValue> getMultilingualSalesSpecs() {
        if (multilingualSalesSpecs == null) {
            multilingualSalesSpecs = new ArrayList<MultilingualValue>();
        }
        return this.multilingualSalesSpecs;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the parentProduct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentProduct() {
        return parentProduct;
    }

    /**
     * Sets the value of the parentProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentProduct(String value) {
        this.parentProduct = value;
    }

    /**
     * Gets the value of the plantItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the plantItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlantItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlantItem }
     * 
     * 
     */
    public List<PlantItem> getPlantItems() {
        if (plantItems == null) {
            plantItems = new ArrayList<PlantItem>();
        }
        return this.plantItems;
    }

    /**
     * Gets the value of the prodocutDeletionFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProdocutDeletionFlag() {
        return prodocutDeletionFlag;
    }

    /**
     * Sets the value of the prodocutDeletionFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProdocutDeletionFlag(JAXBElement<String> value) {
        this.prodocutDeletionFlag = value;
    }

    /**
     * Gets the value of the salesSpec property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesSpec() {
        return salesSpec;
    }

    /**
     * Sets the value of the salesSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesSpec(JAXBElement<String> value) {
        this.salesSpec = value;
    }

}
