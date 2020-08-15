package com.aipalbot.automobile.services;

import com.aipalbot.automobile.models.AccountingDepartment;
import com.aipalbot.automobile.models.Automobile;
import com.aipalbot.automobile.models.CarRent;
import com.aipalbot.automobile.models.Card;
import com.aipalbot.automobile.models.Commission;
import com.aipalbot.automobile.models.Customer;
import com.aipalbot.automobile.models.Invoice;
import com.aipalbot.automobile.models.TypeOfCars;

import com.aipalbot.automobile.services.interfaces.IPaymentService;
import com.aipalbot.automobile.utils.Color;
import com.aipalbot.automobile.utils.ModeOfPayment;
import com.aipalbot.automobile.utils.PaymentMethod;

public class PaymentService implements IPaymentService{

	@Override
	public Invoice puchaseCar(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String reserveCar(Customer customer, Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String carForSales(Automobile car, TypeOfCars type) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public boolean performDebit(Card card) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updateBalance(Card card, double money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verifyCard(Card card) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String reserveCar(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Invoice prepareInvoice(Customer customer, Card card, Commission com) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountingDepartment calCommission(Customer customer, Commission com) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card createPaymentMethod(PaymentMethod payment, ModeOfPayment mode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CarRent reserveCar(Customer customer, TypeOfCars type, Color color) {
		// TODO Auto-generated method stub
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
