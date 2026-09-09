public class Book {
    private String tittle;
    private String author;
    private double price;
    public Book(String tittle,String author,double price){
        this.tittle=tittle;
        this.author=author;
        this.price=price;
    }
    public String getTittle(){
        return tittle;
    } 
    public String getAuthor(){
        return author;

    }
    public double  getPrice(){
        return price;
    }
    public void setTittle(String tittle){
        this.tittle=tittle;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void  setPrice(double price){
        this.price= price;
    }

    public static void  main(String[] args){
        Book myBook1= new Book("The Pearl","Coyotito",500);
        myBook1.setTittle("The Pearl");
        myBook1.setAuthor("Coyotito");
        myBook1.setPrice(600);
        System.out.println("the book tittle is" +" " + myBook1.getTittle() +" " +"by " + myBook1.getAuthor()+" " +"at ksh" +myBook1.getPrice()); 
    }

}
