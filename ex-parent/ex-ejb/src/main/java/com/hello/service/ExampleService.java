package com.hello.service;

import javax.ejb.Stateless;

@Stateless
public class ExampleService {
	public String hello() {
		return "HelloWorld - service";
	}
}
