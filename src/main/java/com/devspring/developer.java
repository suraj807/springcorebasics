package com.devspring;


public class developer {
	
	private String devName;
	private laptop leap;
	
	
	
	public laptop getLeap() {
		return leap;
	}



	public void setLeap(laptop leap) {
		this.leap = leap;
	}



	public developer(String devName) {
		super();
		this.devName = devName;
	}



	public String getDevName() {
		return devName;
	}



	public void setDevName(String devName) {
		this.devName = devName;
	}



	public void coding() {
		System.out.println(" Hello..... i can  code  !....  ");
		leap.deploy();
	}

}


//geter setter one constructer