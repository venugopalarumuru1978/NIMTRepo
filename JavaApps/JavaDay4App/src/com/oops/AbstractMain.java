package com.oops;

abstract class  Vechicle
{
	public void VechCompany(String cname)
	{
		// concreate method:- which has the body
		System.out.println("Company Name " + cname);
	}
	
	abstract  void VechName(String vname, String model);  //abstract method
}

class  Car  extends Vechicle
{
	@Override
	void VechName(String vname, String model) {
		System.out.println("Vech Name : " + vname);
		System.out.println("Vech Model : " + model);
	}	
}

class Bus extends Vechicle
{
	@Override
	void VechName(String vname, String model) {
		System.out.println("Vech Name : " + vname);
		System.out.println("Vech Model : " + model);
	}
}

public class AbstractMain {

	public static void main(String[] args) {
		
		Vechicle  vCar = new Car();
		vCar.VechCompany("Suzuki");
		vCar.VechName("renolds","2025");
		
		Vechicle vBus = new Bus();
		vBus.VechCompany("bharat benz");
		vCar.VechName("Benz Bus","2021");
		
	}
}
