package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels=wheels;
        this.doors=doors;
        this.gears=gears;
        this.isManual=isManual;
        this.type=type;
        this.seats=seats;
        this.currentGear=1;
    }

    public void changeGear(int newGear){
        this.currentGear=newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        setCurrentSpeed(newSpeed);
        setCurrentDirection(newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    public int getCurrentGear(){
        return currentGear;
    }
    public int getseats(){
        return seats;
    }
    public boolean getisManual(){
        return isManual;
    }
    public int getgears(){
        return gears;
    }
    public int getdoors(){
        return doors;
    }
    public String gettype(){
        return type;
    }
    public int getwheels(){
        return wheels;
    }
    public void setCurrentGear(int currentGear){
        this.currentGear = currentGear;
    }
    public void setseats(int seats){
        this.seats= seats;
    }
    public void setisManual(boolean isManual){
        this.isManual= isManual;
    }
    public void setgears(int gears){
        this.gears= gears;
    }
    public void setdoors(int doors){
        this.doors= doors;
    }
    public void settype(String type){
        this.type= type;
    }
    public void setwheels(int wheels){
        this.wheels= wheels;
    }

}
