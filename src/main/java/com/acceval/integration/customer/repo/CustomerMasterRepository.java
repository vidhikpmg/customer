package com.acceval.integration.customer.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.acceval.integration.customer.entity.CustomerMasterEntity;
import com.acceval.integration.customer.entity.CustomerMasterYourCompositeKey;

@Repository
public interface CustomerMasterRepository extends JpaRepository<CustomerMasterEntity, CustomerMasterYourCompositeKey> {
	@Query(value = "select ce from CustomerMasterEntity as ce where ce.CREATE_DATE BETWEEN  :startdate AND :enddate")
	public List<CustomerMasterEntity> getCustomerDataByDateRange(@Param("startdate") String startDateTime,
			@Param("enddate") String endDateTime);
}
