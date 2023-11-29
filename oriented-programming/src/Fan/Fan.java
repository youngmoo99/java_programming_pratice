package Fan;

public class Fan {

	// state
	private String make;
	private double radius;
	private String color;

	private boolean isOn;
	private byte speed; // 0 to 5

	// creation
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	// isOn
	public void SwitchOn() {
		this.isOn = true;
	}

	public void SwitchOff() {
		this.isOn = false;
	}

	// print the state
	@Override
	public String toString() {
		return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d", make, radius, color, isOn,
				speed);
	}
}
