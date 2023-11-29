package com.in28minutes.oops;

public class MotorBike {
	// state
	private int speed;

	public void setSpeed(int speed) { // local variable
		this.speed = speed;
		System.out.println("speed 값 " + speed);

	}

	public void increaseSpeed(int howMuch) {
		// this.speed = this.speed + howMuch;
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		// this.speed = this.speed - howMuch;
		setSpeed(this.speed - howMuch);
	}

	public int getSpeed() {
		return this.speed;
	}

	public void start() {
		System.out.println("Bike Start~");
	}

}
