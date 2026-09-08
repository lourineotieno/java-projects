public class BankAccount {
 private double balance;
   public BankAccount(){
    balance=0;
   }
   public double deposit(double amount){
    if(amount>=1){
    balance += amount;
    }
    return balance;
    
   }
   public double withdrawal(double amount){
    if(amount>=1 && amount<=balance){
     balance -=amount;
    }
    else{
        System.out.println("invalid withdrawal");
    }
    return balance;
   }
   public double getBalance(){
    return balance;
   } 
   public static void main(String[] args){
    BankAccount account=new BankAccount();


    account.deposit(500.0);
    account.withdrawal(40.0);
     account.withdrawal(500.0);
    System.out.println("Balance:"+ account.getBalance());

   }
}
