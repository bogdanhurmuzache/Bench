package ro.deloitte.JavaMethods;

//import ro.deloitte.ui.Car;

public class JavaMethods {
    public static void main(String[] args) {

        Cars myCars = new Cars("Tim's car");
        Cars anotherCars = new Cars("The Batmobile");
        myCars.accelerate();
        myCars.accelerate();
        myCars.accelerate();
        myCars.accelerate();
        myCars.brake();
        myCars.accelerate();

        anotherCars.brake();
    }
}

class Cars {
    private int speed = 0;
    private String name;
    public Cars(String carName) {
        name = carName;
    }
    public void accelerate() {
        speed++;
        showSpeed();
    }
    public void brake () {
        speed--;
        showSpeed();
    }

    private void showSpeed() {
        System.out.printf("%s is going %d miles per hour.%n", name, speed);
    }
}


