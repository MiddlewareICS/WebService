package com.ics.client;

import com.ics.client.ServiceHello;
import com.ics.client.ServiceHelloService;

public class ServiceTest {

	/**
	 *  @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceHello hello = new ServiceHelloService().getServiceHelloPort();
		String name = hello.getValue("HeWei");		
		System.out.println(name);
	}



}
