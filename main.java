import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int balance = 1000;
        int pin = 1234;

        System.out.print("ENTER PIN: ");
        int inputPin = sc.nextInt();

        if(inputPin != pin) {
            System.out.print("WRONG PIN");
            return;
        }
        while(true){
            System.out.println("\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            int choice = sc.nextInt();

            if(choice==1){
                System.out.println("Balance: " + balance);
                
            }
            else if(choice==2){
                System.out.println("Enter amount: ");
                int amt = sc.nextInt();
                balance +=amt;
                System.out.println("deposited! ");
            }
            else if(choice==3){
                System.out.println("Enter amount: ");
                int amt = sc.nextInt();

                if(amt>balance){
                    System.out.println("Insufficient Balance");
                }
                else{
                    balance -=amt;
                    System.out.println("Withdrawn!");
                }
            }
            else if(choice == 4){
                break;
            }

        }

        sc.close();
    }
}
