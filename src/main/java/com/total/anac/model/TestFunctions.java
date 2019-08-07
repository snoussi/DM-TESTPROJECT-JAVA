package com.total.anac.model;

import java.util.ArrayList;
import java.util.List;


public class TestFunctions {

	private String msg = "";
	private int measUp = 0;
	private int compUp = 0;
	private int colUp = 0;
	List<Account> accounts= new ArrayList<Account>();
	
	public void update_dataset() {
		Account acc = new Account();
		acc.setAccountno(10);
		accounts.add(acc);
		System.out.println("dataset updated");
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getMeasUp() {
		return measUp;
	}

	public void setMeasUp(int measUp) {
		this.measUp = measUp;
	}

	public int getCompUp() {
		return compUp;
	}

	public void setCompUp(int compUp) {
		this.compUp = compUp;
	}

	public int getColUp() {
		return colUp;
	}

	public void setColUp(int colUp) {
		this.colUp = colUp;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

}
