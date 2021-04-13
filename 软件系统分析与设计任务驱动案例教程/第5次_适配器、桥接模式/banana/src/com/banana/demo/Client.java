package com.banana.demo;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       DataOperation dataOperation = (DataOperation)XMLUtil.getBean();
       dataOperation.sort();
       dataOperation.search();
	}
}