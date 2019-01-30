package com.subham.myrailapp.pnr;

public class PnrStatus {
	int pnrNumber;
	String status;
	public int getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(int pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "PnrStatus [pnrNumber=" + pnrNumber + ", status=" + status + "]";
	}
	
	
	

}
