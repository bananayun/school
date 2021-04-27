package com.banana.demo;

public class QuickSortAdapter extends QuickSort implements DataOperation {
	public void sort() {
		System.out.println("QuickSort类的方法适配到DataOperation接口");
		super.quickSort();
		
	}
	
	public void search() {
		
	}
	
}

