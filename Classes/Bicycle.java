package Classes;

public abstract class Bicycle extends Vehicle {

    public Bicycle(int maxSpeed) {
        super(maxSpeed);
    }

    public boolean isMotorized(){
        return false;
    }
}
