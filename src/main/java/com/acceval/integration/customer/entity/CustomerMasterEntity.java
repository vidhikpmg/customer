package com.acceval.integration.customer.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER_MASTER", schema = "retaildb")
public class CustomerMasterEntity {
	@EmbeddedId
	private CustomerMasterYourCompositeKey compositeKey;
//	@Id
//	private Integer CUSTOMER_MASTER_ID;
//	@Column(name = "CUSTCODE", insertable = false, updatable = false)
//	private String custCode;
//	@Column(name = "SALESORG", insertable = false, updatable = false)
//	private String salesOrg;
//	@Column(name = "DISTCHNL", insertable = false, updatable = false)
//	private String distChnl;
//	@Column(name = "DIVISION", insertable = false, updatable = false)
//	private String division;
	private String SALESORG_NAME;
	private String SALESOFF;
	private String SALESOFF_NAME;
	private String SALESAREA;
	private String SALESAREA_NAME;
	private String CUST_NAME;
	private String CUST_ADD1;
	private String CUST_ADD2;
	private String CUST_ADD3;
	private String CUST_PIN;
	private String CUST_STATE;
	private String CUST_STATE_NAME;
	private String CUST_CITY;
	private String CUST_CLASS;
	private String DISTRICT;
	private String DISTRICT_NAME;
	private String ACCT_ASSIGN_GRP;
	private String CUSTGRP;
	private String PRICEGRP;
	private String PRICEGRP_DESC;
	private String VAT_NO;
	private String DRC;
	private String DRC_NAME;
	private String CUST_LAND;
	private String CUST_LAND_DESC;
	private String ATTRIB2;
	private String ATTRIB2_DESC;
	private String ATTRIB3;
	private String ATTRIB3_DESC;
	private String ATTRIB4;
	private String ATTRIB4_DESC;
	private String TCATEGORY_CODE;
	private String TCATEGORY_NAME;
	private String END_USE_CODE;
	private String END_USE_NAME;
	private String COCO_TYPE;
	private String COCO_TYPE_DESC;
	private String LPG_TYPE;
	private String LPG_TYPE_DESC;
	private String RO_FLEET;
	private String RO_FLEET_DESC;
	private String ATTR10;
	private String ATTR10_DESC;
	private String HILL_CODE;
	private String HILL_DESC;
	private String RO_FAC_CODE;
	private String RO_FAC_DESC;
	private String RO_PAY_TYPE;
	private String RO_PAY_DESC;
	private String RO_MKT_TYPE;
	private String RO_MKT_DESC;
	private String RO_PROD_TYPE;
	private String RO_PROD_DESC;
	private String INDUSTRY_KEY;
	private String LEGAL_STATUS;
	private String EXCISE_REG_NO;
	private String PAN_NO;
	private String CREATE_DATE;
	private String LEASE_AMOUNT;
	private String LEASE_VALID_DATE;
	private String COMMISSION_DATE;
	private String AGREEMENT_VALID_DATE;
	private String CORPORATE_GROUP;
	private String ACT_GROUP;
	private String VENDER_CODE;
	private String CUST_CAT;
	private String CUST_CAT_DESC;
	private String TERMINATION_DATE;
	private String SOLD_TO_PARTY;
	private String AU;
	private String LI;
	private String FA;
	private String TELF1;
	private String EMAIL;
	private String MAP_CUSTOMER;
	private String APPROVED;
	private String APPROVED_BY;
	private Date APPROVED_ON;
	private Date CREATED_ON;
	private String CREATED_BY;
	private String FIRST_TRANSACTION_DATE;
	private String MAIL_SEND;
	private String BBBNR_NSAP;
	private String CITYC;
	private String GSTIN;
	private String TAX_CLASS;
	private Date SYNCED_ON;
	private Date UPDATED_ON;
	private String VWERK;
	private String KURST;
	private String INCO1;
	private String ZTERM;
	private String VSBED;
	private String ZWELS;

//	public Integer getCUSTOMER_MASTER_ID() {
//		return CUSTOMER_MASTER_ID;
//	}
//
//	public void setCUSTOMER_MASTER_ID(Integer cUSTOMER_MASTER_ID) {
//		CUSTOMER_MASTER_ID = cUSTOMER_MASTER_ID;
//	}

	public CustomerMasterYourCompositeKey getCompositeKey() {
		return compositeKey;
	}

	public void setCompositeKey(CustomerMasterYourCompositeKey compositeKey) {
		this.compositeKey = compositeKey;
	}

//	public String getCustCode() {
//		return custCode;
//	}
//
//	public void setCustCode(String custCode) {
//		this.custCode = custCode;
//	}
//
//	public String getSalesOrg() {
//		return salesOrg;
//	}
//
//	public void setSalesOrg(String salesOrg) {
//		this.salesOrg = salesOrg;
//	}
//
//	public String getDistChnl() {
//		return distChnl;
//	}
//
//	public void setDistChnl(String distChnl) {
//		this.distChnl = distChnl;
//	}
//
//	public String getDivision() {
//		return division;
//	}
//
//	public void setDivision(String division) {
//		this.division = division;
//	}

	public String getSALESORG_NAME() {
		return SALESORG_NAME;
	}

	public void setSALESORG_NAME(String sALESORG_NAME) {
		SALESORG_NAME = sALESORG_NAME;
	}

	public String getSALESOFF() {
		return SALESOFF;
	}

	public void setSALESOFF(String sALESOFF) {
		SALESOFF = sALESOFF;
	}

	public String getSALESOFF_NAME() {
		return SALESOFF_NAME;
	}

	public void setSALESOFF_NAME(String sALESOFF_NAME) {
		SALESOFF_NAME = sALESOFF_NAME;
	}

	public String getSALESAREA() {
		return SALESAREA;
	}

	public void setSALESAREA(String sALESAREA) {
		SALESAREA = sALESAREA;
	}

	public String getSALESAREA_NAME() {
		return SALESAREA_NAME;
	}

	public void setSALESAREA_NAME(String sALESAREA_NAME) {
		SALESAREA_NAME = sALESAREA_NAME;
	}

	public String getCUST_NAME() {
		return CUST_NAME;
	}

	public void setCUST_NAME(String cUST_NAME) {
		CUST_NAME = cUST_NAME;
	}

	public String getCUST_ADD1() {
		return CUST_ADD1;
	}

	public void setCUST_ADD1(String cUST_ADD1) {
		CUST_ADD1 = cUST_ADD1;
	}

	public String getCUST_ADD2() {
		return CUST_ADD2;
	}

	public void setCUST_ADD2(String cUST_ADD2) {
		CUST_ADD2 = cUST_ADD2;
	}

	public String getCUST_ADD3() {
		return CUST_ADD3;
	}

	public void setCUST_ADD3(String cUST_ADD3) {
		CUST_ADD3 = cUST_ADD3;
	}

	public String getCUST_PIN() {
		return CUST_PIN;
	}

	public void setCUST_PIN(String cUST_PIN) {
		CUST_PIN = cUST_PIN;
	}

	public String getCUST_STATE() {
		return CUST_STATE;
	}

	public void setCUST_STATE(String cUST_STATE) {
		CUST_STATE = cUST_STATE;
	}

	public String getCUST_STATE_NAME() {
		return CUST_STATE_NAME;
	}

	public void setCUST_STATE_NAME(String cUST_STATE_NAME) {
		CUST_STATE_NAME = cUST_STATE_NAME;
	}

	public String getCUST_CITY() {
		return CUST_CITY;
	}

	public void setCUST_CITY(String cUST_CITY) {
		CUST_CITY = cUST_CITY;
	}

	public String getCUST_CLASS() {
		return CUST_CLASS;
	}

	public void setCUST_CLASS(String cUST_CLASS) {
		CUST_CLASS = cUST_CLASS;
	}

	public String getDISTRICT() {
		return DISTRICT;
	}

	public void setDISTRICT(String dISTRICT) {
		DISTRICT = dISTRICT;
	}

	public String getDISTRICT_NAME() {
		return DISTRICT_NAME;
	}

	public void setDISTRICT_NAME(String dISTRICT_NAME) {
		DISTRICT_NAME = dISTRICT_NAME;
	}

	public String getACCT_ASSIGN_GRP() {
		return ACCT_ASSIGN_GRP;
	}

	public void setACCT_ASSIGN_GRP(String aCCT_ASSIGN_GRP) {
		ACCT_ASSIGN_GRP = aCCT_ASSIGN_GRP;
	}

	public String getCUSTGRP() {
		return CUSTGRP;
	}

	public void setCUSTGRP(String cUSTGRP) {
		CUSTGRP = cUSTGRP;
	}

	public String getPRICEGRP() {
		return PRICEGRP;
	}

	public void setPRICEGRP(String pRICEGRP) {
		PRICEGRP = pRICEGRP;
	}

	public String getPRICEGRP_DESC() {
		return PRICEGRP_DESC;
	}

	public void setPRICEGRP_DESC(String pRICEGRP_DESC) {
		PRICEGRP_DESC = pRICEGRP_DESC;
	}

	public String getVAT_NO() {
		return VAT_NO;
	}

	public void setVAT_NO(String vAT_NO) {
		VAT_NO = vAT_NO;
	}

	public String getDRC() {
		return DRC;
	}

	public void setDRC(String dRC) {
		DRC = dRC;
	}

	public String getDRC_NAME() {
		return DRC_NAME;
	}

	public void setDRC_NAME(String dRC_NAME) {
		DRC_NAME = dRC_NAME;
	}

	public String getCUST_LAND() {
		return CUST_LAND;
	}

	public void setCUST_LAND(String cUST_LAND) {
		CUST_LAND = cUST_LAND;
	}

	public String getCUST_LAND_DESC() {
		return CUST_LAND_DESC;
	}

	public void setCUST_LAND_DESC(String cUST_LAND_DESC) {
		CUST_LAND_DESC = cUST_LAND_DESC;
	}

	public String getATTRIB2() {
		return ATTRIB2;
	}

	public void setATTRIB2(String aTTRIB2) {
		ATTRIB2 = aTTRIB2;
	}

	public String getATTRIB2_DESC() {
		return ATTRIB2_DESC;
	}

	public void setATTRIB2_DESC(String aTTRIB2_DESC) {
		ATTRIB2_DESC = aTTRIB2_DESC;
	}

	public String getATTRIB3() {
		return ATTRIB3;
	}

	public void setATTRIB3(String aTTRIB3) {
		ATTRIB3 = aTTRIB3;
	}

	public String getATTRIB3_DESC() {
		return ATTRIB3_DESC;
	}

	public void setATTRIB3_DESC(String aTTRIB3_DESC) {
		ATTRIB3_DESC = aTTRIB3_DESC;
	}

	public String getATTRIB4() {
		return ATTRIB4;
	}

	public void setATTRIB4(String aTTRIB4) {
		ATTRIB4 = aTTRIB4;
	}

	public String getATTRIB4_DESC() {
		return ATTRIB4_DESC;
	}

	public void setATTRIB4_DESC(String aTTRIB4_DESC) {
		ATTRIB4_DESC = aTTRIB4_DESC;
	}

	public String getTCATEGORY_CODE() {
		return TCATEGORY_CODE;
	}

	public void setTCATEGORY_CODE(String tCATEGORY_CODE) {
		TCATEGORY_CODE = tCATEGORY_CODE;
	}

	public String getTCATEGORY_NAME() {
		return TCATEGORY_NAME;
	}

	public void setTCATEGORY_NAME(String tCATEGORY_NAME) {
		TCATEGORY_NAME = tCATEGORY_NAME;
	}

	public String getEND_USE_CODE() {
		return END_USE_CODE;
	}

	public void setEND_USE_CODE(String eND_USE_CODE) {
		END_USE_CODE = eND_USE_CODE;
	}

	public String getEND_USE_NAME() {
		return END_USE_NAME;
	}

	public void setEND_USE_NAME(String eND_USE_NAME) {
		END_USE_NAME = eND_USE_NAME;
	}

	public String getCOCO_TYPE() {
		return COCO_TYPE;
	}

	public void setCOCO_TYPE(String cOCO_TYPE) {
		COCO_TYPE = cOCO_TYPE;
	}

	public String getCOCO_TYPE_DESC() {
		return COCO_TYPE_DESC;
	}

	public void setCOCO_TYPE_DESC(String cOCO_TYPE_DESC) {
		COCO_TYPE_DESC = cOCO_TYPE_DESC;
	}

	public String getLPG_TYPE() {
		return LPG_TYPE;
	}

	public void setLPG_TYPE(String lPG_TYPE) {
		LPG_TYPE = lPG_TYPE;
	}

	public String getLPG_TYPE_DESC() {
		return LPG_TYPE_DESC;
	}

	public void setLPG_TYPE_DESC(String lPG_TYPE_DESC) {
		LPG_TYPE_DESC = lPG_TYPE_DESC;
	}

	public String getRO_FLEET() {
		return RO_FLEET;
	}

	public void setRO_FLEET(String rO_FLEET) {
		RO_FLEET = rO_FLEET;
	}

	public String getRO_FLEET_DESC() {
		return RO_FLEET_DESC;
	}

	public void setRO_FLEET_DESC(String rO_FLEET_DESC) {
		RO_FLEET_DESC = rO_FLEET_DESC;
	}

	public String getATTR10() {
		return ATTR10;
	}

	public void setATTR10(String aTTR10) {
		ATTR10 = aTTR10;
	}

	public String getATTR10_DESC() {
		return ATTR10_DESC;
	}

	public void setATTR10_DESC(String aTTR10_DESC) {
		ATTR10_DESC = aTTR10_DESC;
	}

	public String getHILL_CODE() {
		return HILL_CODE;
	}

	public void setHILL_CODE(String hILL_CODE) {
		HILL_CODE = hILL_CODE;
	}

	public String getHILL_DESC() {
		return HILL_DESC;
	}

	public void setHILL_DESC(String hILL_DESC) {
		HILL_DESC = hILL_DESC;
	}

	public String getRO_FAC_CODE() {
		return RO_FAC_CODE;
	}

	public void setRO_FAC_CODE(String rO_FAC_CODE) {
		RO_FAC_CODE = rO_FAC_CODE;
	}

	public String getRO_FAC_DESC() {
		return RO_FAC_DESC;
	}

	public void setRO_FAC_DESC(String rO_FAC_DESC) {
		RO_FAC_DESC = rO_FAC_DESC;
	}

	public String getRO_PAY_TYPE() {
		return RO_PAY_TYPE;
	}

	public void setRO_PAY_TYPE(String rO_PAY_TYPE) {
		RO_PAY_TYPE = rO_PAY_TYPE;
	}

	public String getRO_PAY_DESC() {
		return RO_PAY_DESC;
	}

	public void setRO_PAY_DESC(String rO_PAY_DESC) {
		RO_PAY_DESC = rO_PAY_DESC;
	}

	public String getRO_MKT_TYPE() {
		return RO_MKT_TYPE;
	}

	public void setRO_MKT_TYPE(String rO_MKT_TYPE) {
		RO_MKT_TYPE = rO_MKT_TYPE;
	}

	public String getRO_MKT_DESC() {
		return RO_MKT_DESC;
	}

	public void setRO_MKT_DESC(String rO_MKT_DESC) {
		RO_MKT_DESC = rO_MKT_DESC;
	}

	public String getRO_PROD_TYPE() {
		return RO_PROD_TYPE;
	}

	public void setRO_PROD_TYPE(String rO_PROD_TYPE) {
		RO_PROD_TYPE = rO_PROD_TYPE;
	}

	public String getRO_PROD_DESC() {
		return RO_PROD_DESC;
	}

	public void setRO_PROD_DESC(String rO_PROD_DESC) {
		RO_PROD_DESC = rO_PROD_DESC;
	}

	public String getINDUSTRY_KEY() {
		return INDUSTRY_KEY;
	}

	public void setINDUSTRY_KEY(String iNDUSTRY_KEY) {
		INDUSTRY_KEY = iNDUSTRY_KEY;
	}

	public String getLEGAL_STATUS() {
		return LEGAL_STATUS;
	}

	public void setLEGAL_STATUS(String lEGAL_STATUS) {
		LEGAL_STATUS = lEGAL_STATUS;
	}

	public String getEXCISE_REG_NO() {
		return EXCISE_REG_NO;
	}

	public void setEXCISE_REG_NO(String eXCISE_REG_NO) {
		EXCISE_REG_NO = eXCISE_REG_NO;
	}

	public String getPAN_NO() {
		return PAN_NO;
	}

	public void setPAN_NO(String pAN_NO) {
		PAN_NO = pAN_NO;
	}

	public String getCREATE_DATE() {
		return CREATE_DATE;
	}

	public void setCREATE_DATE(String cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}

	public String getLEASE_AMOUNT() {
		return LEASE_AMOUNT;
	}

	public void setLEASE_AMOUNT(String lEASE_AMOUNT) {
		LEASE_AMOUNT = lEASE_AMOUNT;
	}

	public String getLEASE_VALID_DATE() {
		return LEASE_VALID_DATE;
	}

	public void setLEASE_VALID_DATE(String lEASE_VALID_DATE) {
		LEASE_VALID_DATE = lEASE_VALID_DATE;
	}

	public String getCOMMISSION_DATE() {
		return COMMISSION_DATE;
	}

	public void setCOMMISSION_DATE(String cOMMISSION_DATE) {
		COMMISSION_DATE = cOMMISSION_DATE;
	}

	public String getAGREEMENT_VALID_DATE() {
		return AGREEMENT_VALID_DATE;
	}

	public void setAGREEMENT_VALID_DATE(String aGREEMENT_VALID_DATE) {
		AGREEMENT_VALID_DATE = aGREEMENT_VALID_DATE;
	}

	public String getCORPORATE_GROUP() {
		return CORPORATE_GROUP;
	}

	public void setCORPORATE_GROUP(String cORPORATE_GROUP) {
		CORPORATE_GROUP = cORPORATE_GROUP;
	}

	public String getACT_GROUP() {
		return ACT_GROUP;
	}

	public void setACT_GROUP(String aCT_GROUP) {
		ACT_GROUP = aCT_GROUP;
	}

	public String getVENDER_CODE() {
		return VENDER_CODE;
	}

	public void setVENDER_CODE(String vENDER_CODE) {
		VENDER_CODE = vENDER_CODE;
	}

	public String getCUST_CAT() {
		return CUST_CAT;
	}

	public void setCUST_CAT(String cUST_CAT) {
		CUST_CAT = cUST_CAT;
	}

	public String getCUST_CAT_DESC() {
		return CUST_CAT_DESC;
	}

	public void setCUST_CAT_DESC(String cUST_CAT_DESC) {
		CUST_CAT_DESC = cUST_CAT_DESC;
	}

	public String getTERMINATION_DATE() {
		return TERMINATION_DATE;
	}

	public void setTERMINATION_DATE(String tERMINATION_DATE) {
		TERMINATION_DATE = tERMINATION_DATE;
	}

	public String getSOLD_TO_PARTY() {
		return SOLD_TO_PARTY;
	}

	public void setSOLD_TO_PARTY(String sOLD_TO_PARTY) {
		SOLD_TO_PARTY = sOLD_TO_PARTY;
	}

	public String getAU() {
		return AU;
	}

	public void setAU(String aU) {
		AU = aU;
	}

	public String getLI() {
		return LI;
	}

	public void setLI(String lI) {
		LI = lI;
	}

	public String getFA() {
		return FA;
	}

	public void setFA(String fA) {
		FA = fA;
	}

	public String getTELF1() {
		return TELF1;
	}

	public void setTELF1(String tELF1) {
		TELF1 = tELF1;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getMAP_CUSTOMER() {
		return MAP_CUSTOMER;
	}

	public void setMAP_CUSTOMER(String mAP_CUSTOMER) {
		MAP_CUSTOMER = mAP_CUSTOMER;
	}

	public String getAPPROVED() {
		return APPROVED;
	}

	public void setAPPROVED(String aPPROVED) {
		APPROVED = aPPROVED;
	}

	public String getAPPROVED_BY() {
		return APPROVED_BY;
	}

	public void setAPPROVED_BY(String aPPROVED_BY) {
		APPROVED_BY = aPPROVED_BY;
	}

	public Date getAPPROVED_ON() {
		return APPROVED_ON;
	}

	public void setAPPROVED_ON(Date aPPROVED_ON) {
		APPROVED_ON = aPPROVED_ON;
	}

	public Date getCREATED_ON() {
		return CREATED_ON;
	}

	public void setCREATED_ON(Date cREATED_ON) {
		CREATED_ON = cREATED_ON;
	}

	public String getCREATED_BY() {
		return CREATED_BY;
	}

	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}

	public String getFIRST_TRANSACTION_DATE() {
		return FIRST_TRANSACTION_DATE;
	}

	public void setFIRST_TRANSACTION_DATE(String fIRST_TRANSACTION_DATE) {
		FIRST_TRANSACTION_DATE = fIRST_TRANSACTION_DATE;
	}

	public String getMAIL_SEND() {
		return MAIL_SEND;
	}

	public void setMAIL_SEND(String mAIL_SEND) {
		MAIL_SEND = mAIL_SEND;
	}

	public String getBBBNR_NSAP() {
		return BBBNR_NSAP;
	}

	public void setBBBNR_NSAP(String bBBNR_NSAP) {
		BBBNR_NSAP = bBBNR_NSAP;
	}

	public String getCITYC() {
		return CITYC;
	}

	public void setCITYC(String cITYC) {
		CITYC = cITYC;
	}

	public String getGSTIN() {
		return GSTIN;
	}

	public void setGSTIN(String gSTIN) {
		GSTIN = gSTIN;
	}

	public String getTAX_CLASS() {
		return TAX_CLASS;
	}

	public void setTAX_CLASS(String tAX_CLASS) {
		TAX_CLASS = tAX_CLASS;
	}

	public Date getSYNCED_ON() {
		return SYNCED_ON;
	}

	public void setSYNCED_ON(Date sYNCED_ON) {
		SYNCED_ON = sYNCED_ON;
	}

	public Date getUPDATED_ON() {
		return UPDATED_ON;
	}

	public void setUPDATED_ON(Date uPDATED_ON) {
		UPDATED_ON = uPDATED_ON;
	}

	public String getVWERK() {
		return VWERK;
	}

	public void setVWERK(String vWERK) {
		VWERK = vWERK;
	}

	public String getKURST() {
		return KURST;
	}

	public void setKURST(String kURST) {
		KURST = kURST;
	}

	public String getINCO1() {
		return INCO1;
	}

	public void setINCO1(String iNCO1) {
		INCO1 = iNCO1;
	}

	public String getZTERM() {
		return ZTERM;
	}

	public void setZTERM(String zTERM) {
		ZTERM = zTERM;
	}

	public String getVSBED() {
		return VSBED;
	}

	public void setVSBED(String vSBED) {
		VSBED = vSBED;
	}

	public String getZWELS() {
		return ZWELS;
	}

	public void setZWELS(String zWELS) {
		ZWELS = zWELS;
	}

}
