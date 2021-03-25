package academy.learnprogramming;

public class Car extends Vehicle {

    private boolean isManual;
    private int wheels;
    private int doors;
    private int gears;

    private int currentGear;


    public Car(String size, String name, boolean isManual, int wheels, int doors, int gears) {
        super(size, name);
        this.isManual = isManual;
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
    }

}
