package Classes;

public abstract class Vehicle {
    private String color;
    protected int maxSpeed;

    public Vehicle(){

    }
    public Vehicle(int maxSpeed){
        System.out.println("Vehicle's constructor");
        this.maxSpeed=maxSpeed;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return this.color;
    }

    public void setMaxSpeed(int speed){
        this.maxSpeed=speed;
    }

    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    public void print(){
        System.out.println("Vehicle"+" color "+this.color+" maxspeed "+this.maxSpeed);
    }

//    this method will force all the classes that inherit Vehicle class, to have this method
    public abstract boolean isMotorized();

    public abstract String getCompany();
}
