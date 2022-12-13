package com.parkinglot.ui;

import com.parkinglot.Customer;
import com.parkinglot.VechileType;
import com.parkinglot.service.ParkingServiceImplementation;

public class Client {

	public static void main(String[] args) {
		Customer customer = new Customer();
		VechileType vechile = new VechileType();
		ParkingServiceImplementation ps = new ParkingServiceImplementation();
		ps.getCustomerDetials(customer);
		ps.getVechileDetials(vechile);
		ps.display(vechile);

	}

}
