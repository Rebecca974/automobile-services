package com.aipalbot.automobile.services.interfaces;

import com.aipalbot.automobile.models.AccountingDepartment;
import com.aipalbot.automobile.models.Card;
import com.aipalbot.automobile.models.Commission;
import com.aipalbot.automobile.models.Customer;
import com.aipalbot.automobile.models.Invoice;
import com.aipalbot.automobile.utils.ModeOfPayment;
import com.aipalbot.automobile.utils.PaymentMethod;

public interface IPaymentService extends IAutomobileService, IReservationService{
 boolean performDebit(Card card);
 void updateBalance(Card card, double money);
 boolean verifyCard(Card card);
public String reserveCar(Customer customer);	
public Invoice prepareInvoice(Customer customer , Card card, Commission com);
public AccountingDepartment calCommission(Customer customer,Commission com);
public Card createPaymentMethod(PaymentMethod payment, ModeOfPayment mode);



}
