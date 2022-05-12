package com.zensar.code;

public class Addition {
        //I want to add this text
	
	public Integer add(Integer a,Integer b) {
		System.out.println("inside the add");
		return a+b;
	}
	
	public Integer sub(Integer a,Integer b) {
		return a-b;	
	
	}
	public Integer mul(Integer a,Integer b) {
		return a*b;	
	
	}
	public Integer div(Integer a,Integer b) {
		return a/b;	
	
	}
	public int[] myArr() {
		return new int[]{1,2,3,4,5};
	}
	
	public String getName(String name) {
		if(name.length()!=0) {
			return name.toUpperCase();
		}
		 throw new IllegalArgumentException("arg not valid");
	}
}
