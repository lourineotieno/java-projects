public class Checker {
static boolean isEven(int number){
    if(number %2 == 0){
        return true;

    }
    else{
        return false;
    }
}
static void printEvenOrOdd(int number,boolean isEven){
    if (isEven){
        System.out.println(number +" " + "is even") ;   }
        else{
            System.out.println(number +" " + "is odd");
        }
} 
public static void main(String[] args){
    printEvenOrOdd(5,isEven(5));
    printEvenOrOdd(2,isEven(4));
    printEvenOrOdd(1,isEven(1));
}
}
