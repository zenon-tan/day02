package models;

public class TurboChargedCar extends Car {

    public Boolean turbo = false;

    // Inherits ALL variables and methods from Car except Constructor (when you create it)

    public TurboChargedCar (String registration) {
        // Use super() to inherit from the parent class
        // Super has to be the first line
        super(registration); // Passes this constructor to the parent constructor


    }

    // Overriding -> changes behavior of the parent method
    @Override()
    public void accelerate() {
        if(this.turbo) {

            super.accelerate();
            super.accelerate();
            super.accelerate();
            super.accelerate();
            super.accelerate();
            System.out.println("Vroom Vroom bitches know they can't catch me");

        } else {
            super.accelerate();
            System.out.println("So let's ride... I guess");
        }
  
    }

    public Boolean getTurbo() {
        return turbo;
    }

    public void setTurbo(Boolean turbo) {
        this.turbo = turbo;
    }

    

}
    

