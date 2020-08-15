package com.aipalbot.automobile.services;

import com.aipalbot.automobile.models.Automobile;
import com.aipalbot.automobile.models.CarRent;
import com.aipalbot.automobile.models.Card;
import com.aipalbot.automobile.models.Customer;
import com.aipalbot.automobile.models.Invoice;
import com.aipalbot.automobile.models.TypeOfCars;
import com.aipalbot.automobile.services.factory.AutomobileFactory;
import com.aipalbot.automobile.services.interfaces.IReservationService;
import com.aipalbot.automobile.utils.Color;

public class ReservationService implements IReservationService {
	
	
	private AutomobileFactory factory;
	
	public ReservationService(AutomobileFactory factory) {
		this.factory = factory;
	}

	@Override
	public String reserveCar(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CarRent reserveCar(Customer customer, TypeOfCars type, Color color) {
		
		String carName = "Toyota";
		Automobile automobile = factory.createAutomobile(carName );
		CarRent carRent = new CarRent();
		carRent.setColor(color);
		carRent.setType(type);
		
		
		return null;
	}
	
	
	@Override
	public Invoice PrepareReservation(Customer customer, Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showAvailableTypeOfCars(Automobile automobile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String showReservedCar(Automobile automobile) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
