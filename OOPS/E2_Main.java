public class E2_Main {
    public static void main(String[] args){
         Animal[] animals = { new Animal("Vin"), new Dog("Rex"), new Cat("Liam") };

    for (Animal a : animals) {
        a.makeSound();
         
    }
}
}
