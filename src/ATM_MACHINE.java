import java.util.*;
class ATM{
    Scanner scan = new Scanner(System.in);
    float balance;
    int PIN = 5674;
    public void checkpin() {
        System.out.print("Enter your pin : ");
        int enterpin = scan.nextInt();
        if (enterpin == PIN) {
            menu();
        } else {
            System.out.println("Enter Valid Pin!......");
            checkpin();
        }
    }
        public void menu(){
            System.out.println("Enter your choice: ");
            System.out.println("1. Check A/C Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            int opt = scan.nextInt();

            if(opt == 1){
                checkBalance();
            } else if (opt == 2) {
                withdrawMoney();
            } else if (opt == 3) {
                depositMoney();
            } else if (opt == 4) {
                return;
            }else{
                System.out.println("Chose valid number......");
            }

        }
    public void checkBalance(){
        System.out.println("Balance: " + balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount to Withdraw: ");
        float amount = scan.nextFloat();
        if(amount > balance){
            System.out.println("Insufficient Balance...");
        }else{
            balance = balance - amount;
            System.out.println("Money withdraw successfully...");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter the amount: ");
        float amount = scan.nextFloat();
        balance = balance + amount;
        System.out.println("Money deposit successfully.....");
        menu();
    }
}
public class ATM_MACHINE {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }

}
