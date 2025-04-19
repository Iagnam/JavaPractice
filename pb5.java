public class pb5 {
    public static void main(String args[]){
        Bank_account ba=new Bank_account();
        ba.balance(10000);
        ba.getBalance();
        ba.deposit(1000);
       // ba.getBalance();
        ba.withdraw(7000);

    }
}
class Bank_account{
    private int account_number;
    private int balance;
    public void balance(int balance){
        this.balance = balance;
        //System.out.print()
    }
    public  void getBalance(){
         System.out.println("the balance is "+balance);
    }

    public void  deposit(int amount){
        balance+=amount;
        System.out.println("After deposit");
        getBalance();
    }
    public void withdraw(int amt){
        if(balance>amt)
             System.out.println("After Withdrawl the balance is " + (balance - amt));
        else  
            System.out.println("Insufficient BAlance");     
    }

}