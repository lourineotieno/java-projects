public class E5_Main {
    public static void main(String[] args){
        Appliance washer=new WashingMachine("Syinix");
        Appliance microwave=new Microwave("Samsung");
        washer.powerOn();
        washer.performTask();
        microwave.powerOn();
        microwave.performTask();
    }
}
