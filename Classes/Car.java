package Classes;

public abstract class Car extends Vehicle {
    int numDoors;

    public Car(){
        super();
    }
    public Car(int numDoors, int maxSpeed){
        super(100);
        this.numDoors=numDoors;
        System.out.println("Car's constructor");
    }
    public void printCar(){
        super.print();
        System.out.println("Car "+"color "+this.getColor()+" maxspeed "+this.getMaxSpeed()+" numDoors "+this.numDoors);
    }

    public boolean isMotorized(){
        return true;
    }
}
