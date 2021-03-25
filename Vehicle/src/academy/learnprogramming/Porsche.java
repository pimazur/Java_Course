package academy.learnprogramming;

public class Porsche extends Car {

    private int roadServiceMonths;

    public Porsche(int roadServiceMonths) {
        super("4WD", "Porsche", false, 4, 3, 6);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {

        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0){
            stop();
            changeGear(1);
        } else if(newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        } else if(newVelocity > 10 && newVelocity <= 20){
            changeGear(2);
        } else if(newVelocity > 20 && newVelocity <= 30){
            changeGear(3);
        } else
            changeGear(4);
    }
}
