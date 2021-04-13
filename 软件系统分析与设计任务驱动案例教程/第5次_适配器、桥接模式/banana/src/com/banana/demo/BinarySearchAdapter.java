package com.banana.demo;

public class BinarySearchAdapter extends BinarySearch implements DataOperation {
	public void sort() {
				
	}
	
	public void search() {
		System.out.println("Binary类的方法适配到DataOperation接口");
		super.binarySearch();
		
	}
}
