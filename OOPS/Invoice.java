public class Invoice {
     static void printInvoice(String item, double price, int quantity) {
         System.out.println("no return value");
    }

    static double calculateTotal(double price, int quantity) {
       return price+quantity;
    }

    public static void main(String[] args) {
        printInvoice("Notebook", 150.0, 3);
        double total = calculateTotal(150.0, 3);
        System.out.println("Total: " + total);
    }
}
