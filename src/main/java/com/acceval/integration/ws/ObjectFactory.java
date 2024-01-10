
package com.acceval.integration.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.acceval.integration.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://ws.integration.acceval.com/", "Exception");
    private final static QName _SendMaterial_QNAME = new QName("http://ws.integration.acceval.com/", "sendMaterial");
    private final static QName _SendMaterialResponse_QNAME = new QName("http://ws.integration.acceval.com/", "sendMaterialResponse");
    private final static QName _SendCustomer_QNAME = new QName("http://ws.integration.acceval.com/", "sendCustomer");
    private final static QName _SendCustomerResponse_QNAME = new QName("http://ws.integration.acceval.com/", "sendCustomerResponse");
    private final static QName _SalesItemCurrency_QNAME = new QName("", "currency");
    private final static QName _SalesItemDeletionFlag_QNAME = new QName("", "deletionFlag");
    private final static QName _SalesItemDeliveryPlant_QNAME = new QName("", "deliveryPlant");
    private final static QName _SalesItemExchangeRateType_QNAME = new QName("", "exchangeRateType");
    private final static QName _SalesItemIncoterm1_QNAME = new QName("", "incoterm1");
    private final static QName _SalesItemOrderBlock_QNAME = new QName("", "orderBlock");
    private final static QName _SalesItemPaymentTerm_QNAME = new QName("", "paymentTerm");
    private final static QName _SalesItemSalesGroup_QNAME = new QName("", "salesGroup");
    private final static QName _SalesItemSalesOffice_QNAME = new QName("", "salesOffice");
    private final static QName _SalesItemType_QNAME = new QName("", "type");
    private final static QName _SalesItemUnloadingPort_QNAME = new QName("", "unloadingPort");
    private final static QName _MasterDataCustomerInMessageCity_QNAME = new QName("", "city");
    private final static QName _MasterDataCustomerInMessageCreationDate_QNAME = new QName("", "creationDate");
    private final static QName _MasterDataCustomerInMessageFaxNo_QNAME = new QName("", "faxNo");
    private final static QName _MasterDataCustomerInMessageHouseNo_QNAME = new QName("", "houseNo");
    private final static QName _MasterDataCustomerInMessageIndustry_QNAME = new QName("", "industry");
    private final static QName _MasterDataCustomerInMessageName2_QNAME = new QName("", "name2");
    private final static QName _MasterDataCustomerInMessageName3_QNAME = new QName("", "name3");
    private final static QName _MasterDataCustomerInMessageName4_QNAME = new QName("", "name4");
    private final static QName _MasterDataCustomerInMessagePoBox_QNAME = new QName("", "poBox");
    private final static QName _MasterDataCustomerInMessagePostalCode_QNAME = new QName("", "postalCode");
    private final static QName _MasterDataCustomerInMessageRegion_QNAME = new QName("", "region");
    private final static QName _MasterDataCustomerInMessageShippingCondition_QNAME = new QName("", "shippingCondition");
    private final static QName _MasterDataCustomerInMessageStreet1_QNAME = new QName("", "street1");
    private final static QName _MasterDataCustomerInMessageStreet2_QNAME = new QName("", "street2");
    private final static QName _MasterDataCustomerInMessageStreet3_QNAME = new QName("", "street3");
    private final static QName _MasterDataCustomerInMessageStreet4_QNAME = new QName("", "street4");
    private final static QName _MasterDataCustomerInMessageStreet5_QNAME = new QName("", "street5");
    private final static QName _MasterDataCustomerInMessageTelephoneNo_QNAME = new QName("", "telephoneNo");
    private final static QName _PlantItemPlantDeletionFlag_QNAME = new QName("", "plantDeletionFlag");
    private final static QName _PlantItemValuationClass_QNAME = new QName("", "valuationClass");
    private final static QName _MultilingualValueLanguage_QNAME = new QName("", "language");
    private final static QName _MultilingualValueValue_QNAME = new QName("", "value");
    private final static QName _ItemPackaging_QNAME = new QName("", "packaging");
    private final static QName _ItemSalesAreaDeletionFlag_QNAME = new QName("", "salesAreaDeletionFlag");
    private final static QName _ItemSalesUom_QNAME = new QName("", "salesUom");
    private final static QName _MasterDataMaterialInMessageProdocutDeletionFlag_QNAME = new QName("", "prodocutDeletionFlag");
    private final static QName _MasterDataMaterialInMessageSalesSpec_QNAME = new QName("", "salesSpec");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.acceval.integration.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link SendMaterial }
     * 
     */
    public SendMaterial createSendMaterial() {
        return new SendMaterial();
    }

    /**
     * Create an instance of {@link SendMaterialResponse }
     * 
     */
    public SendMaterialResponse createSendMaterialResponse() {
        return new SendMaterialResponse();
    }

    /**
     * Create an instance of {@link SendCustomer }
     * 
     */
    public SendCustomer createSendCustomer() {
        return new SendCustomer();
    }

    /**
     * Create an instance of {@link SendCustomerResponse }
     * 
     */
    public SendCustomerResponse createSendCustomerResponse() {
        return new SendCustomerResponse();
    }

    /**
     * Create an instance of {@link MasterDataMaterialInMessage }
     * 
     */
    public MasterDataMaterialInMessage createMasterDataMaterialInMessage() {
        return new MasterDataMaterialInMessage();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link MultilingualValue }
     * 
     */
    public MultilingualValue createMultilingualValue() {
        return new MultilingualValue();
    }

    /**
     * Create an instance of {@link PlantItem }
     * 
     */
    public PlantItem createPlantItem() {
        return new PlantItem();
    }

    /**
     * Create an instance of {@link MasterDataStatusMessage }
     * 
     */
    public MasterDataStatusMessage createMasterDataStatusMessage() {
        return new MasterDataStatusMessage();
    }

    /**
     * Create an instance of {@link MasterDataCustomerInMessage }
     * 
     */
    public MasterDataCustomerInMessage createMasterDataCustomerInMessage() {
        return new MasterDataCustomerInMessage();
    }

    /**
     * Create an instance of {@link SalesItem }
     * 
     */
    public SalesItem createSalesItem() {
        return new SalesItem();
    }

    /**
     * Create an instance of {@link CustomerHierarchy }
     * 
     */
    public CustomerHierarchy createCustomerHierarchy() {
        return new CustomerHierarchy();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.integration.acceval.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMaterial }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendMaterial }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.integration.acceval.com/", name = "sendMaterial")
    public JAXBElement<SendMaterial> createSendMaterial(SendMaterial value) {
        return new JAXBElement<SendMaterial>(_SendMaterial_QNAME, SendMaterial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMaterialResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendMaterialResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.integration.acceval.com/", name = "sendMaterialResponse")
    public JAXBElement<SendMaterialResponse> createSendMaterialResponse(SendMaterialResponse value) {
        return new JAXBElement<SendMaterialResponse>(_SendMaterialResponse_QNAME, SendMaterialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendCustomer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendCustomer }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.integration.acceval.com/", name = "sendCustomer")
    public JAXBElement<SendCustomer> createSendCustomer(SendCustomer value) {
        return new JAXBElement<SendCustomer>(_SendCustomer_QNAME, SendCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendCustomerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SendCustomerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.integration.acceval.com/", name = "sendCustomerResponse")
    public JAXBElement<SendCustomerResponse> createSendCustomerResponse(SendCustomerResponse value) {
        return new JAXBElement<SendCustomerResponse>(_SendCustomerResponse_QNAME, SendCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "currency", scope = SalesItem.class)
    public JAXBElement<String> createSalesItemCurrency(String value) {
        return new JAXBElement<String>(_SalesItemCurrency_QNAME, String.class, SalesItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "deletionFlag", scope = SalesItem.class)
    public JAXBElement<String> createSalesItemDeletionFlag(String value) {
        return new JAXBElement<String>(_SalesItemDeletionFlag_QNAME, String.class, SalesItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "deliveryPlant", scope = SalesItem.class)
    public JAXBElement<String> createSalesItemDeliveryPlant(String value) {
        return new JAXBElement<String>(_SalesItemDeliveryPlant_QNAME, String.class, SalesItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "exchangeRateType", scope = SalesItem.class)
    public JAXBElement<String> createSalesItemExchangeRateType(String value) {
        return new JAXBElement<String>(_SalesItemExchangeRateType_QNAME, String.class, SalesItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "incoterm1", scope = SalesItem.class)
    public JAXBElement<String> createSalesItemIncoterm1(String value) {
        return new JAXBElement<String>(_SalesItemIncoterm1_QNAME, String.class, SalesItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "orderBlock", scope = SalesItem.class)
    public JAXBElement<String> createSalesItemOrderBlock(String value) {
        return new JAXBElement<String>(_SalesItemOrderBlock_QNAME, String.class, SalesItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "paymentTerm", scope = SalesItem.class)
    public JAXBElement<String> createSalesItemPaymentTerm(String value) {
        return new JAXBElement<String>(_SalesItemPaymentTerm_QNAME, String.class, SalesItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "salesGroup", scope = SalesItem.class)
    public JAXBElement<String> createSalesItemSalesGroup(String value) {
        return new JAXBElement<String>(_SalesItemSalesGroup_QNAME, String.class, SalesItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "salesOffice", scope = SalesItem.class)
    public JAXBElement<String> createSalesItemSalesOffice(String value) {
        return new JAXBElement<String>(_SalesItemSalesOffice_QNAME, String.class, SalesItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "type", scope = SalesItem.class)
    public JAXBElement<String> createSalesItemType(String value) {
        return new JAXBElement<String>(_SalesItemType_QNAME, String.class, SalesItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "unloadingPort", scope = SalesItem.class)
    public JAXBElement<String> createSalesItemUnloadingPort(String value) {
        return new JAXBElement<String>(_SalesItemUnloadingPort_QNAME, String.class, SalesItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "city", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessageCity(String value) {
        return new JAXBElement<String>(_MasterDataCustomerInMessageCity_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "creationDate", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessageCreationDate(String value) {
        return new JAXBElement<String>(_MasterDataCustomerInMessageCreationDate_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "deletionFlag", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessageDeletionFlag(String value) {
        return new JAXBElement<String>(_SalesItemDeletionFlag_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "faxNo", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessageFaxNo(String value) {
        return new JAXBElement<String>(_MasterDataCustomerInMessageFaxNo_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "houseNo", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessageHouseNo(String value) {
        return new JAXBElement<String>(_MasterDataCustomerInMessageHouseNo_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "industry", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessageIndustry(String value) {
        return new JAXBElement<String>(_MasterDataCustomerInMessageIndustry_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "name2", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessageName2(String value) {
        return new JAXBElement<String>(_MasterDataCustomerInMessageName2_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "name3", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessageName3(String value) {
        return new JAXBElement<String>(_MasterDataCustomerInMessageName3_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "name4", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessageName4(String value) {
        return new JAXBElement<String>(_MasterDataCustomerInMessageName4_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "orderBlock", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessageOrderBlock(String value) {
        return new JAXBElement<String>(_SalesItemOrderBlock_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "poBox", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessagePoBox(String value) {
        return new JAXBElement<String>(_MasterDataCustomerInMessagePoBox_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "postalCode", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessagePostalCode(String value) {
        return new JAXBElement<String>(_MasterDataCustomerInMessagePostalCode_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "region", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessageRegion(String value) {
        return new JAXBElement<String>(_MasterDataCustomerInMessageRegion_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "shippingCondition", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessageShippingCondition(String value) {
        return new JAXBElement<String>(_MasterDataCustomerInMessageShippingCondition_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "street1", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessageStreet1(String value) {
        return new JAXBElement<String>(_MasterDataCustomerInMessageStreet1_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "street2", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessageStreet2(String value) {
        return new JAXBElement<String>(_MasterDataCustomerInMessageStreet2_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "street3", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessageStreet3(String value) {
        return new JAXBElement<String>(_MasterDataCustomerInMessageStreet3_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "street4", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessageStreet4(String value) {
        return new JAXBElement<String>(_MasterDataCustomerInMessageStreet4_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "street5", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessageStreet5(String value) {
        return new JAXBElement<String>(_MasterDataCustomerInMessageStreet5_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "telephoneNo", scope = MasterDataCustomerInMessage.class)
    public JAXBElement<String> createMasterDataCustomerInMessageTelephoneNo(String value) {
        return new JAXBElement<String>(_MasterDataCustomerInMessageTelephoneNo_QNAME, String.class, MasterDataCustomerInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "plantDeletionFlag", scope = PlantItem.class)
    public JAXBElement<String> createPlantItemPlantDeletionFlag(String value) {
        return new JAXBElement<String>(_PlantItemPlantDeletionFlag_QNAME, String.class, PlantItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "valuationClass", scope = PlantItem.class)
    public JAXBElement<String> createPlantItemValuationClass(String value) {
        return new JAXBElement<String>(_PlantItemValuationClass_QNAME, String.class, PlantItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "language", scope = MultilingualValue.class)
    public JAXBElement<String> createMultilingualValueLanguage(String value) {
        return new JAXBElement<String>(_MultilingualValueLanguage_QNAME, String.class, MultilingualValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "value", scope = MultilingualValue.class)
    public JAXBElement<String> createMultilingualValueValue(String value) {
        return new JAXBElement<String>(_MultilingualValueValue_QNAME, String.class, MultilingualValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "deliveryPlant", scope = Item.class)
    public JAXBElement<String> createItemDeliveryPlant(String value) {
        return new JAXBElement<String>(_SalesItemDeliveryPlant_QNAME, String.class, Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "packaging", scope = Item.class)
    public JAXBElement<String> createItemPackaging(String value) {
        return new JAXBElement<String>(_ItemPackaging_QNAME, String.class, Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "salesAreaDeletionFlag", scope = Item.class)
    public JAXBElement<String> createItemSalesAreaDeletionFlag(String value) {
        return new JAXBElement<String>(_ItemSalesAreaDeletionFlag_QNAME, String.class, Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "salesUom", scope = Item.class)
    public JAXBElement<String> createItemSalesUom(String value) {
        return new JAXBElement<String>(_ItemSalesUom_QNAME, String.class, Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "prodocutDeletionFlag", scope = MasterDataMaterialInMessage.class)
    public JAXBElement<String> createMasterDataMaterialInMessageProdocutDeletionFlag(String value) {
        return new JAXBElement<String>(_MasterDataMaterialInMessageProdocutDeletionFlag_QNAME, String.class, MasterDataMaterialInMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "salesSpec", scope = MasterDataMaterialInMessage.class)
    public JAXBElement<String> createMasterDataMaterialInMessageSalesSpec(String value) {
        return new JAXBElement<String>(_MasterDataMaterialInMessageSalesSpec_QNAME, String.class, MasterDataMaterialInMessage.class, value);
    }

}
