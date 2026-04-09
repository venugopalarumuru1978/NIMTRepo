package com.gymapp.models;
//	BatchID	   BatchSlot    BatchTime      StartDate

import java.sql.Date;

public class Batches {

	private int batchid;
	private String batchSlot;
	private String batchTime;
	private Date  startDate;
	public int getBatchid() {
		return batchid;
	}
	public void setBatchid(int batchid) {
		this.batchid = batchid;
	}
	public String getBatchSlot() {
		return batchSlot;
	}
	public void setBatchSlot(String batchSlot) {
		this.batchSlot = batchSlot;
	}
	public String getBatchTime() {
		return batchTime;
	}
	public void setBatchTime(String batchTime) {
		this.batchTime = batchTime;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
}
