package com.qfedu.bean;

import java.util.*;

public class Mix {
	private List<String> myList;
	private Map<String, String> myMap;
	private String[] myArray;

	public void setMyList(List<String> myList) {
		this.myList = myList;
	}

	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}

	public void setMyArray(String[] myArray) {
		this.myArray = myArray;
	}

	@Override
	public String toString() {
		return "Mix [myList=" + myList + ", myMap=" + myMap + ", myArray=" + Arrays.toString(myArray) + "]";
	}
}
