package com.acceval.integration.service;

import java.util.List;

import com.acceval.integration.customer.entity.CustomerMasterEntity;

public interface IoclDataServices {
	public void sendCustomerMasterToSt(String startDate, String endDate);

	public List<CustomerMasterEntity> getCustomer(String startDate, String endDate);

//	public List<SalesItem> fetchCustomerSalesArea(String salesStartDate, String salesEndDate,
//			String customercode);
//
//	List<CustomerHierarchy> getCustomerSalesPartner(String customersalesStartDate, String customersalesEndDate,
//			String customercode);

}
