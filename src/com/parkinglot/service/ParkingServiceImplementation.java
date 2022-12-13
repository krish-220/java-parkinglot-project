package com.parkinglot.service;

import java.util.Scanner;

import com.parkinglot.Customer;
import com.parkinglot.VechileType;

public class ParkingServiceImplementation implements ParkingService {
	Scanner sc = new Scanner(System.in);

	@Override
	public void getCustomerDetials(Customer customer) {
		System.out.println("welcome to the parking pattas ");
		System.out.println("enter the name:");
		customer.setName(sc.next());
		System.out.println("enter the phone number:");
		customer.setPhoneno(sc.next());

	}

	// @Override
	// public void display(Customer customer) {

//}

	@Override
	public void getVechileDetials(VechileType vechile) {
		System.out.println("enter the vechile number");
		vechile.setVechileno(sc.next());
		System.out.println("choose the vechiletype:");
		// vechile.setVechiletype(sc.next());
		System.out.println("\n1.bike \n2.car \n3.bus");
		// vechile.setVechiletype(sc.next());
		int vechiletype = sc.nextInt();
		// int choise =sc.nextInt();

		if (vechiletype == 1) {
			// System.out.println("bike");
			vechile.setVechiletype("bike");

		} else if (vechiletype == 2) {
			vechile.setVechiletype("car");

		} else if (vechiletype == 3) {
			vechile.setVechiletype("bus");

		} else {
			System.out.println("there is no services this type ");
		}
		System.out.println("you choose the vechile is " + vechile.getVechiletype());

	}

	@Override
	public void display(VechileType vechile) {
		//System.out.println("\n your booking vechiletype is " + vechile.getVechiletype());
		System.out.println("\n thank you for visit  safe and secure and drive");
	}

}
