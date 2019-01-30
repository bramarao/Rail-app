package com.subham.myrailapp.pnr;

import com.subham.myrailapp.util.JourneyType;

public class Pnr {

	private String pnrNumber;
	private JourneyType journeyType;
	private String confirmStatus;
	private String source;
	private String destination;
	private String doj;
	private boolean chartPrepared;
	
	
	public String getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getConfirmStatus() {
		return confirmStatus;
	}
	public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public JourneyType getJourneyType() {
		return journeyType;
	}
	
	
	public boolean isChartPrepared() {
		return chartPrepared;
	}
	public void setChartPrepared(boolean chartPrepared) {
		this.chartPrepared = chartPrepared;
	}
	public void setJourneyType(JourneyType journeyType) {
		this.journeyType = journeyType;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}


	
	
}
