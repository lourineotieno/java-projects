
public class E1_Main {
    public static void main(String[] args){
        Car myCar=new Car("Toyota",50,4);
        myCar.move();
        myCar.refuel(30);
        System.out.println("Doors: " + myCar.getnumberOfDoors());
        


    }

    
}
