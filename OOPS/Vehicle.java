
public class Vehicle{
    protected String brand;
    protected double speed;
    protected int fuelLevel;
    public Vehicle(String brand,double speed){
        this.brand=brand;
        this.speed=speed;
        this.fuelLevel=0;
    }
    public void move(){
        System.out.println(brand +" "+"is moving at" +" " +speed +"km/h");
        
    } 

}