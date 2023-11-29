package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();

//		ducati.start();
//		honda.start();

//		ducati.speed = 100;
//		honda.speed = 80;
//
//		ducati.speed = 20;
//		honda.speed = 0;

		ducati.setSpeed(100);
		honda.setSpeed(80);

		ducati.increaseSpeed(150);
		ducati.decreaseSpeed(30);
		System.out.println(ducati.getSpeed());
//
//		ducati.setSpeed(90);
//		honda.setSpeed(0);

	}

}
