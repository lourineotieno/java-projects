public class Microwave extends Appliance implements Chargeable{
   public Microwave(String brand){
    super(brand);
   } 
   @Override
   public void performTask(){
    System.out.println("The food is in the microwave");
   }
   @Override
    public void charge() {
        System.out.println(brand + " microwave is charging its smart display battery.");
    }
}
