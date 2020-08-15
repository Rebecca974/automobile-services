package com.aipalbot.automobile.services.interfaces;

import com.aipalbot.automobile.models.Automobile;
import com.aipalbot.automobile.models.Card;
import com.aipalbot.automobile.models.Customer;
import com.aipalbot.automobile.models.Invoice;
import com.aipalbot.automobile.models.TypeOfCars;

public interface IAutomobileService {

	

public Invoice puchaseCar(Customer customer);
public String reserveCar(Customer customer, Card card);
public String carForSales(Automobile car,TypeOfCars type);

}
