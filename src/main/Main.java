package main;

import java.util.Date;

import models.Car;
import models.TurboChargedCar;

public class Main {

    public static void main(String[] args) {
        
        Car myNewCar = new Car("XCX");
        Car myOtherCar = new TurboChargedCar("Charli");

        // Since myOtherCar is a Car, it cannot access methods from TurboChargedCar
        if(myOtherCar instanceof TurboChargedCar) {
            TurboChargedCar newTurboCar = (TurboChargedCar)myOtherCar;
            newTurboCar.setTurbo(true);
        }

        myNewCar.setColour("Lavender");
        myNewCar.setMake("Lambrogini");
        myNewCar.setRegistration("XCX");
        myNewCar.setRegistrationDate(new Date(1999)); 
        // Date is a class so you'll need to create a new Date object

        // If we need to use the Date class that is different from another Date class from another package
        // Specify the full qualified name of the date:
        // java.sql.Date date = new java.sql.Date(123L);

        myNewCar.horn();
        System.out.printf("Color: %s\nMake: %s\nRegistration: %s\n", myNewCar.getColour(),myNewCar.getMake(),
        myNewCar.getRegistration());

        myNewCar.accelerate();
        myNewCar.accelerate();
        myNewCar.accelerate();

    }
    
}
