package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello1")
public class ClientFacingEndPoint {

	@Autowired
	private DbSettings db1;
	
	@Value("${my.greeting}")
	private String staticmsg;
	
	@Value("static message....")
	private String staticmsg1;
	
	@Value("${my.list.values}")
	private List<String> listValues;
	
	@GetMapping(value="/hey")
	public String get() {
		return "Within hello() , ClientFacingEndpoint . "+staticmsg+" "+listValues+" "+staticmsg1;
	}
	@GetMapping(value="/hi")
	public String get1() {
		return "###########"+ staticmsg+db1.getConnection()+db1.getHost()+db1.getPort();
	}
}
