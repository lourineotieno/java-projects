public class E6_Main {
   public static void main(String[] args) {
        Microwave smartMicrowave = new Microwave("Samsung");

        smartMicrowave.powerOn();      // inherited from Appliance
        smartMicrowave.performTask();  // required by Appliance (abstract method)
        smartMicrowave.charge();       // required by Chargeable (interface)
    } 
}
