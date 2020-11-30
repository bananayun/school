package com.qfedu.pojo;

public class StuCard {
	private int cid;
	private double balance;
	public StuCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StuCard(int cid, double balance) {
		super();
		this.cid = cid;
		this.balance = balance;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "StuCard [cid=" + cid + ", balance=" + balance + "]";
	}
}
