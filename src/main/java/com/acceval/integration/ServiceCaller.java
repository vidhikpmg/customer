package com.acceval.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.acceval.integration.service.IoclDataServices;

@Component
public class ServiceCaller implements ApplicationListener<ApplicationReadyEvent> {
	@Autowired
	IoclDataServices insertCustomerMasterService;

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		// TODO Auto-generated method stub
		//insertCustomerMasterService.sendCustomerMasterToSt("2003-06-20", "2010-05-17");
		insertCustomerMasterService.sendCustomerMasterToSt("2024-01-09", "2024-01-01");
	}

}
