public abstract class Appliance{
    protected String brand;
    public Appliance(String brand){
        this.brand=brand;
    }
    public void powerOn(){
        System.out.println(brand + " is powered on.");
    }
    public abstract void performTask();

}