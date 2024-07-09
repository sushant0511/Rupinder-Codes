package com.java.outside;



public class CallingClass {

	

	private void avail()
	{
		System.out.println("I can access as private");
	}
	
	public static void main(String[] args) {
		
		CallingClass callingClass=new CallingClass();
		callingClass.avail();
	}
	
}
