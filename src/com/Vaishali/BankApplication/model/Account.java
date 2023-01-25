package com.Vaishali.BankApplication.model;

public class Account {

	int accNo;
	String accName;
	String accAddr;
	String accPan;
	double accAmt;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccAddr() {
		return accAddr;
	}
	public void setAccAddr(String accAddr) {
		this.accAddr = accAddr;
	}
	public String getAccPan() {
		return accPan;
	}
	public void setAccPan(String accPan) {
		this.accPan = accPan;
	}
	public double getAccAmt() {
		return accAmt;
	}
	public void setAccAmt(double accAmt) {
		this.accAmt = accAmt;
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", accAddr=" + accAddr + ", accPan=" + accPan
				+ ", accAmt=" + accAmt + "]";
	}
	
	
}
