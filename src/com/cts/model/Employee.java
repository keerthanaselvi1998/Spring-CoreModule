package com.cts.model;



public class Employee {

	private byte SystemNo;
	private short roomNo;
	private int id;
	private String name;
	private Double salary;
	private char gender;
	private long mobileNumber;
	private String maritalStatus;
	
	private Account account;
	public byte getSystemNo() {
		return SystemNo;
	}
	public void setSystemNo(byte systemNo) {
		SystemNo = systemNo;
	}
	public short getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(short roomNo) {
		this.roomNo = roomNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
