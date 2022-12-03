package models;

import java.util.Date;

public class Car {

    // Class Properties - Members
    // private -> no other objects can access these variables except this object itself
    // This allows for control for access; we don't want ppl to change these themselves
    // Hence we will provide access methods to change them
    // These are variables to represent the properties of this class (attributes)
    private String colour;
    private String make;
    private String registration;
    private Date registrationDate;
    private Integer accerleration = 0;

    // Constructor
    //Constructors have no return type
    
    public Car(String registration) {
        this.registration = registration;
        this.colour = "Red";
        this.make = "Lavender";
        this.make = "Lambrogini";

    }

    public Car(String registration, Date registrationDate) {
        this.registration = registration;
        this.registrationDate = registrationDate;

    }


    // Access methods to our attributes
    // getMemberName, setMemberName 

    public String getColour() { // This is called a method/function
        return this.colour;
        // return this.color.toUpperCase();
        //this refers to myself as in the colour from the members
        // Basically you will get the value but you don't need to know how

    }

    public void setColour(String colour) {

        this.colour = colour;

    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        if(make.equals("honda") || make.equals("toyota") || make.equals("mazda")) {

            this.make = make;

        } else {
            this.make = "others";

            //case "honda":
            //case "toyota":
            //case "mazda":
        }
        
    }

    public String getRegistration() {
        return this.registration;

    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    //Shortcut to generating getters and setters
    //Cmd Shift P -> Source Action -> Getters and Setters


    // This is a behavior
    public void horn() {
        System.out.println("Beep beep, so lets ride");
    }

    public void accelerate() {
        if(this.accerleration < 100) {
            this.accerleration++;

        }
        
    
    }

    public void accelerate(int n) {
        for(int i = 0; i <= n; i++) {
            this.accelerate();
            //Overloading 
        }
    }

    public void deccerlerate() {
        if(this.accerleration > 0) {
            this.accerleration--;
        }
    }


    

}