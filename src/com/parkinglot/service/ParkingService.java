package com.parkinglot.service;

import com.parkinglot.Customer;
import com.parkinglot.VechileType;

public interface ParkingService {
	
	public void getCustomerDetials(Customer customer);
	//public void display(Customer customer);
	public void getVechileDetials(VechileType vechile);
	public void display(VechileType vechile);
	
	

}
