package com.ics.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class ServiceHello {

	/**
	* 供客户端调用的方法
	* @param name		传入参数
	* @return String	返回结果
	*/
	
	public String getValue(String name){
		return "I'm "+name;
	}
	
	/*
	* @param args
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:9001/Service/ServiceHello", new ServiceHello());
		System.out.println("service success");
		
	}

}
