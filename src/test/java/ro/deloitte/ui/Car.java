package ro.deloitte.ui;

public class Car {

    private int speed = 0;

    public void accelerate() {
        speed++;
        System.out.printf("You are going %d kilometres per hour. %n", speed);
    }

    public void brake() {
        speed--;
        System.out.printf("You are going %d kilometres per hour. %n", speed);

    }
    public static void main(String[] args){

        Car myCar = new Car();
        Car anotherCar = new Car();

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.brake();
        myCar.accelerate();

        anotherCar.brake();
    }
}

