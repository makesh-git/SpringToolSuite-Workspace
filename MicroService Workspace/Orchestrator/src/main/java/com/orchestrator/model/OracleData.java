package com.orchestrator.model;

import java.math.BigInteger;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("oracleData")
public class OracleData
{
	@Id
	private String no;
	private String name;
	private String projNum;
	private String empNum;
	private String frmTaskNum;
	private String hoursVal;
	private String transferType;
	private String toTaskNum;
	private String toProjNum;
	private String frmExpDate;
	private String toExpDate;
	private String uiPathStatus;

	private String ticNo;
	private String type;
	private String spoc;
	private String status;
	
	
	
	public OracleData() {
		super();
		// TODO Auto-generated constructor stub
	}






	public OracleData( String name, String projNum, String empNum, String frmTaskNum, String hoursVal,
			String transferType, String toTaskNum, String toProjNum, String frmExpDate, String toExpDate,
			String uiPathStatus, String ticNo, String type, String spoc, String status) {
		super();
	
		this.name = name;
		this.projNum = projNum;
		this.empNum = empNum;
		this.frmTaskNum = frmTaskNum;
		this.hoursVal = hoursVal;
		this.transferType = transferType;
		this.toTaskNum = toTaskNum;
		this.toProjNum = toProjNum;
		this.frmExpDate = frmExpDate;
		this.toExpDate = toExpDate;
		this.uiPathStatus = uiPathStatus;
		this.ticNo = ticNo;
		this.type = type;
		this.spoc = spoc;
		this.status = status;
	}






	public String getUiPathStatus() {
		return uiPathStatus;
	}






	public void setUiPathStatus(String uiPathStatus) {
		this.uiPathStatus = uiPathStatus;
	}






	public String getNo() {
		return no;
	}



	public void setNo(String no) {
		this.no = no;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getProjNum() {
		return projNum;
	}



	public void setProjNum(String projNum) {
		this.projNum = projNum;
	}



	public String getEmpNum() {
		return empNum;
	}



	public void setEmpNum(String empNum) {
		this.empNum = empNum;
	}



	public String getFrmTaskNum() {
		return frmTaskNum;
	}



	public void setFrmTaskNum(String frmTaskNum) {
		this.frmTaskNum = frmTaskNum;
	}



	public String getHoursVal() {
		return hoursVal;
	}



	public void setHoursVal(String hoursVal) {
		this.hoursVal = hoursVal;
	}



	public String getTransferType() {
		return transferType;
	}



	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}



	public String getToTaskNum() {
		return toTaskNum;
	}



	public void setToTaskNum(String toTaskNum) {
		this.toTaskNum = toTaskNum;
	}



	public String getToProjNum() {
		return toProjNum;
	}



	public void setToProjNum(String toProjNum) {
		this.toProjNum = toProjNum;
	}



	public String getFrmExpDate() {
		return frmExpDate;
	}



	public void setFrmExpDate(String frmExpDate) {
		this.frmExpDate = frmExpDate;
	}



	public String getToExpDate() {
		return toExpDate;
	}



	public void setToExpDate(String toExpDate) {
		this.toExpDate = toExpDate;
	}



	public String getTicNo() {
		return ticNo;
	}



	public void setTicNo(String ticNo) {
		this.ticNo = ticNo;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getSpoc() {
		return spoc;
	}



	public void setSpoc(String spoc) {
		this.spoc = spoc;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "OracleData [no=" + no + ", name=" + name + ", projNum=" + projNum + ", empNum=" + empNum
				+ ", frmTaskNum=" + frmTaskNum + ", hoursVal=" + hoursVal + ", transferType=" + transferType
				+ ", toTaskNum=" + toTaskNum + ", toProjNum=" + toProjNum + ", frmExpDate=" + frmExpDate
				+ ", toExpDate=" + toExpDate + ", ticNo=" + ticNo + ", type=" + type + ", spoc=" + spoc + ", status="
				+ status + "]";
	}
	
	
	
	
	
	
	
	

}