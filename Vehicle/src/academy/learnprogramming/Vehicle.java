package academy.learnprogramming;

public class Vehicle {

    private String size;
    private String name;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String size, String speed){
    this.size = size;
    this.name = speed;

    this.currentDirection = 0;
    this.currentVelocity = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction){
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public String getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop() {
        this.currentVelocity = 0;
    }
}
