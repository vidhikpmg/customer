package com.acceval.integration.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.acceval.integration.customer.entity.CustomerMasterEntity;
import com.acceval.integration.customer.repo.CustomerMasterRepository;
import com.acceval.integration.dto.Acknowledgement;
import com.acceval.integration.service.IoclDataServices;
import com.acceval.integration.util.IoclDateUtil;
import com.acceval.integration.ws.CustomerHierarchy;
import com.acceval.integration.ws.Exception_Exception;
import com.acceval.integration.ws.MasterDataCustomerInMessage;
import com.acceval.integration.ws.MasterDataStatusMessage;
import com.acceval.integration.ws.MasterDataWebService;
import com.acceval.integration.ws.MasterDataWebServicePortType;
import com.acceval.integration.ws.SalesItem;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class InsertCustomerMasterService implements IoclDataServices {
	private static final Logger logger = LogManager.getLogger(InsertCustomerMasterService.class);

	@Autowired
	CustomerMasterRepository customerRepo;

	@Autowired
	IoclDateUtil ioclUtil;

	private MasterDataWebServicePortType servicePort;

	// Initialize the service endpoint
	public InsertCustomerMasterService() {
		MasterDataWebService service = new MasterDataWebService();
		servicePort = service.getMasterDataWebServicePort();
	}

	//@Scheduled()
	@Override
	public void sendCustomerMasterToSt(String startDate, String endDate) {

		MasterDataCustomerInMessage masterDataReq = null;
		MasterDataStatusMessage response = null;
		SalesItem salesItem = null;
//		List<SalesItem> salesItemList = new ArrayList();
//		List<CustomerHierarchy> customerHierarchieList = new ArrayList<>();
		CustomerHierarchy customerHierarchy = null;
		Acknowledgement ack = new Acknowledgement();
		List<MasterDataCustomerInMessage> customerStList = new ArrayList<>();
		List<MasterDataStatusMessage> responseList = new ArrayList<MasterDataStatusMessage>();
		ack.setStatus(false);
		ack.setMsg("Unable to send customer Master data to ST");
		try {

			List<CustomerMasterEntity> customerMaster = getCustomer(startDate, endDate);

			if (customerMaster != null) {

				ObjectMapper om = new ObjectMapper();
				logger.info("Data from IOCL :: " + om.writeValueAsString(customerMaster));

				for (CustomerMasterEntity customer : customerMaster) {
					masterDataReq = new MasterDataCustomerInMessage();
					salesItem = new SalesItem();
					customerHierarchy = new CustomerHierarchy();

					// Customer Hierarchy

					customerHierarchy.setCustomerCode(customer.getCompositeKey().getCustCode());
					customerHierarchy.setPartnerFunction(customer.getACT_GROUP());

					// Sales Items

					salesItem.setUnloadingPort(null);
					salesItem.setType(null);
					salesItem.setOrderBlock(null);
					salesItem.setExchangeRateType(null);
					salesItem.setDeliveryPlant(null);

					salesItem.getCustomerHierarchies().add(customerHierarchy);
					salesItem.setDistributionChannel(customer.getCompositeKey().getDistChnl());
					salesItem.setSalesOffice(
							new JAXBElement<>(new QName("salesOffice"), String.class, customer.getSALESOFF_NAME()));
					salesItem
							.setIncoterm1(new JAXBElement<>(new QName("incoterm1"), String.class, customer.getINCO1()));
					salesItem.setDivision(customer.getCompositeKey().getDivision());
					salesItem.setPaymentTerm(
							new JAXBElement<>(new QName("paymentTerm"), String.class, customer.getZTERM()));
					salesItem.setSalesGroup(
							new JAXBElement<>(new QName("salesGroup"), String.class, customer.getSALESAREA()));
					salesItem.setSalesOrg(customer.getCompositeKey().getSalesOrg());
					salesItem.setDeletionFlag(null);//default null

					// main customer
					masterDataReq.setFaxNo(null);
					masterDataReq.setHouseNo(null);
					masterDataReq.setOrderBlock(null); //default null
					masterDataReq.setPoBox(null);
					masterDataReq.setShippingCondition(null);
					masterDataReq.setStreet4(null);
					masterDataReq.setTelephoneNo(null);

					masterDataReq.getSalesItems().add(salesItem);
					masterDataReq.setDeletionFlag(null);
					masterDataReq.setCode(customer.getACT_GROUP());
					masterDataReq.setCity(new JAXBElement<>(new QName("name2"), String.class, customer.getCUST_CITY()));
					masterDataReq.setName1(customer.getCUST_NAME());
					masterDataReq.setShortName(customer.getCUST_NAME());
					masterDataReq.setCountry("India");
					masterDataReq.setAccountGroup(customer.getCUSTGRP());
					masterDataReq.setCreationDate(
							new JAXBElement<>(new QName("creationDate"), String.class, customer.getCREATE_DATE()));
					masterDataReq
							.setStreet1(new JAXBElement<>(new QName("street1"), String.class, customer.getCUST_ADD1()));
					masterDataReq
							.setStreet2(new JAXBElement<>(new QName("street2"), String.class, customer.getCUST_ADD2()));
					masterDataReq
							.setStreet3(new JAXBElement<>(new QName("street3"), String.class, customer.getCUST_ADD3()));
					masterDataReq.setPostalCode(
							new JAXBElement<>(new QName("postalCode"), String.class, customer.getCUST_PIN()));

					//

					masterDataReq.getSalesItems();
					response = servicePort.sendCustomer(masterDataReq);
					responseList.add(response);
					customerStList.add(masterDataReq);

				}
				logger.info("Data for ST :: " + om.writeValueAsString(customerStList));
			}

			if (responseList != null && responseList.size() == customerMaster.size()) {
				ack.setStatus(true);
				ack.setMsg("Successfuly send customer Master data to ST");
				logger.info("Successfuly send customer Master data to ST");
			}
		}
		catch (Exception_Exception e) {
			ack.setStatus(true);
			ack.setMsg("Unable to send customer Master data to ST. Some exception occured :: " + e.getFaultInfo());
			logger.error("Unable to send customer Master data to ST. Some exception occured", e);
		} 
		catch (JsonProcessingException e) {
			ack.setStatus(true);
			ack.setMsg("Unable to send customer Master data to ST. Some exception occured :: " + e);
			logger.error("Unable to send customer Master data to ST. Some exception occured", e);
		}
	}

	@Override
	public List<CustomerMasterEntity> getCustomer(String startDate, String endDate) {

		System.out.println("start Date :: " + startDate + " :: end Date :: " + endDate);
		List<CustomerMasterEntity> allCustomers = null;
		try {
			if (startDate != null && endDate != null) {

				// Date begDate = ioclUtil.convertedDate(startDate, "yyyy-MM-dd");
				// Date endingDate = ioclUtil.convertedDate(endDate, "yyyy-MM-dd");

				allCustomers = customerRepo.getCustomerDataByDateRange(startDate, endDate);

			}
		} catch (Exception e) {
			logger.error("Unable to fetch customer Master data from HOIS. Some exception occured", e);

		}
		return allCustomers;
	}

}
