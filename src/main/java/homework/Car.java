package homework;

public class Car {

    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {

        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void displayinfo () {

        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);

    }



    }

