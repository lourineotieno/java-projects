public class Book {
    String tittle;
    String author;
    double price;
    public Book(String tittle,String author,double price){
        this.tittle=tittle;
        this.author=author;
        this.price=price;
    } 
    public static void  main(String[] args){
        Book myBook1=new Book("The Pearl","Coyotito",2000.0);
        System.out.println("the book tittle is" +" " + myBook1.tittle +" " +"by " + myBook1.author+" " +"at ksh" +myBook1.price); 
    }

}
