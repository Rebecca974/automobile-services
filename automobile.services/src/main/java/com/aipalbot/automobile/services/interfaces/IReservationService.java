package com.aipalbot.automobile.services.interfaces;

import com.aipalbot.automobile.models.Automobile;
import com.aipalbot.automobile.models.CarRent;
import com.aipalbot.automobile.models.Card;
import com.aipalbot.automobile.models.Customer;
import com.aipalbot.automobile.models.Invoice;
import com.aipalbot.automobile.models.TypeOfCars;
import com.aipalbot.automobile.utils.Color;

public interface IReservationService {

	
	public String reserveCar(Customer customer);
	public CarRent reserveCar(Customer customer, TypeOfCars type, Color color);
	public   Invoice PrepareReservation(Customer customer, Card card);
	public String showAvailableTypeOfCars(Automobile automobile);
	public String showReservedCar(Automobile automobile);
}