public class Car extends Vehicle{
	private int doors;
	private int wheels;
	private  boolean isManual;
	
	private int currentGear;

	public Car(String name, String size, int currentVelocity, int currentDirection, int doors, int wheels,
			boolean isManual) {
		super(name, size, currentVelocity, currentDirection);
		this.doors = doors;
		this.wheels = wheels;
		this.isManual = isManual;
		this.currentGear = 1;
	}

	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car.setCurrentGear(): changed to "+this.currentGear+" gear");
	}
	public void changeVelocity(int speed,int direction) {
		System.out.println("Car.changeVelocity(): "+ speed+" direction "+direction);
		move(speed,direction);
		
	}
}