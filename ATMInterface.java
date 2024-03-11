import java.util.Scanner;
class User{
    static int balance,pin;
    static String accno;
     User(){
     balance=10000;
     accno= "";
    }
    public static void info()
    {
        System.out.print("Enter four digit pin: ");
        Scanner in=new Scanner(System.in);
        pin=in.nextInt();
        accno="********"+pin;
        System.out.println("Your Account no is: "+accno); 
    }
} 
public class ATMInterface{
    int balan;
    public ATMInterface(int bal)
    {
        balan=bal;
    }
    public void withdrawing(int amount)
    {
        if(amount>balan)

        {
            System.out.println("Insufficient balance");
        }
        else{
            balan=balan-amount;
            System.out.println("Rs "+amount+" withdrawed");
        }
    }
    public void deposit(int amount)
    {
        balan=balan+amount;
        System.out.println("Rs "+amount+" deposited");
    }
    public void checkbalance()
    {
        System.out.println("Your balance is Rs "+balan);
    }
    public static void main(String[] args) {
        User var =new User();
        int bal= var.balance;
        ATMInterface atm=new ATMInterface(bal);
        Scanner sc= new Scanner(System.in);
        int ch,amount; 
        boolean bool=true;
        var.info();
        while(bool)
        {
        System.out.println("1.Withdraw\n2.Deposit\n3.Checkbalance\n4.Exit");
        System.out.print("Enter your choice: ");
        ch=sc.nextInt();

           switch(ch)
          { 
            case 1:
              System.out.print("Enter amount you want withdraw: ");
              amount= sc.nextInt();
              atm.withdrawing(amount);
              break;
            case 2:
               System.out.print("Enter amount you want deposit: ");
               amount=sc.nextInt();
               atm.deposit(amount);
               break;
            case 3:
               atm.checkbalance();
               break;
            case 4:
                bool=false;
                return;
            default:
               System.out.println("Invalid choice");
               break;
          }
          System.out.print("Enter your choice: ");
          ch=sc.nextInt();
        }
    }
}
