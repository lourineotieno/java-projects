
public class Car extends Vehicle {
    private int numberOfDoors;
public Car(String brand,double speed,int numberOfDoors){
    super(brand,speed);
    this.numberOfDoors=numberOfDoors;
}
 
public void refuel(int amount){
    fuelLevel +=amount;
     System.out.println(brand + " refueled. Fuel level: " + fuelLevel);
}public int getnumberOfDoors(){
    return numberOfDoors;
}
    
}
