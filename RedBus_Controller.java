package com.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redbus")
public class RedBus_Controller {
	@RequestMapping(value="/pune",method=RequestMethod.GET)
	public String pune() {
		return "BusName:Shivneri Express\n"
			    +"BusTime: 09:30 AM\n"
			    +"route: Pune to Latur\n"
			    +"totalSeats: 40\n"
			    +"availableSeats: 15\n"
			    +"price: 500.00";
	}
	
	
	@RequestMapping(value="/mumbai",method=RequestMethod.POST)
	public String mumbai() {
		return "BusName:Gokul Express\n"
			    +"BusTime:08:00 AM\n"
			    +"route: Mumbai to pune\n"
			    +"totalSeats: 40\n"
			    +"availableSeats: 15\n"
			    +"price: 450.00";
	}
	
	@RequestMapping(value="/aurangabad",method=RequestMethod.GET)
	public String aurangabad() {
		return "BusName:Nikhil Travels\n"
			    +"BusTime:08:00PM\n"
			    +"route:Aurangabad to Mumbai\n"
			    +"totalSeats:30\n"
			    +"availableSeats:20\n"
			    +"price: 550.00";
	}
	
	@RequestMapping(value="/nashik",method=RequestMethod.PUT)
	public String Nashik() {
		return "BusName: MahaLaxmi Travels\n"
			    +"BusTime:10:00PM\n"
			    +"route:Nashik to Nagpur\n"
			    +"totalSeats:30\n"
			    +"availableSeats:20\n"
			    +"price:300.00";
	}
}
