package com.aipalbot.automobile.services.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.aipalbot.automobile.models.Automobile;
import com.aipalbot.automobile.models.Ford;
import com.aipalbot.automobile.models.Toyota;
import com.aipalbot.automobile.models.TypeOfCars;
import com.aipalbot.automobile.utils.AutomobileName;
import com.aipalbot.automobile.utils.AutomobileSize;
import com.aipalbot.automobile.utils.Body;
import com.aipalbot.automobile.utils.Color;
import com.aipalbot.automobile.utils.Make;

public class AutomobileFactory {

	public  Automobile  createAutomobile(String carName) {
	
	if(carName.equals(AutomobileName.Ford.toString()))	{
	
	List<TypeOfCars> typeOfCars = null;
	if(carName.equalsIgnoreCase(AutomobileName .Ford.toString())) {
		
		
		double discount = 0.5;
		
		Automobile ford = new Ford(discount);
		
		ford.setColor( Color.LightBreown);
		ford.setMake(Make.Chevrolet);
		ford.setBody(Body.FourSeats);
		ford.setBody(Body.FourDoors);
		ford.setBody(Body.FourTire);
		ford.setAutomobileSize(AutomobileSize.SVU);
		
		Map<String,TypeOfCars> car = createCars(1);
		
		ford.setTypeOfCar(typeOfCars);
		
	
	return ford;
		}else if(carName.equals(AutomobileName.Toyota.toString())) {
			
		}else if(carName.equalsIgnoreCase(AutomobileName.Toyota.toString())) {
	
			
			int buyOneGetOneFree = 2020;
			Automobile toyota = new Toyota(buyOneGetOneFree);
			
			toyota.setAutomobileSize(AutomobileSize.Van);
			toyota.setBody(Body.Capacity);
			toyota.setBody(Body.Wheel);
			toyota.setColor(Color.Black);
			toyota.setMake(Make.Bmw);
			Map<String,TypeOfCars> car = createCars(2);
			
			toyota.setTypeOfCar(typeOfCars);
			
			return toyota;
	}else {
		
		return null;
	}
	}
	return null;
	}
	
	private Map<String, TypeOfCars> createCars(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	//public List <TypeOfCars> createCars(String automobile) {
		  
		public Map<String,TypeOfCars> n (int motor){
		  
			Map<String,TypeOfCars> cars = new HashMap<>();
		int count = 1;
		for(int i= 1; i < motor; i++) 
		{
			TypeOfCars c = new  TypeOfCars();
			c.setColor(Color.Black);
			c.setMake(Make.Jeep);
			c.setBody(Body.FourDoors);
			count++;
			}
		
		return cars;
		//return null;
		
		}
	}
	
