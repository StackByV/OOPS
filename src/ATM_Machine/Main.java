package ATM_Machine;
import java.util.Scanner;


class ATM{

    //Attributes
    float balance;
    int pin=1234;

    //constructor
    ATM(){
        System.out.println("Enter pin");
        Scanner sc = new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==pin){
            menu();
        }
        else{
            System.out.println("Enter the valid pin");
            checkpin();
        }
    }
    //Method_1
    public void checkpin(){
        System.out.println("Enter pin");
        Scanner sc = new Scanner(System.in);
        int enteredpin=sc.nextInt();
        if(enteredpin==pin){
            menu();
        }
        else{
            System.out.println("Enter the valid pin");
            checkpin();
        }
    }



    //Method_2
    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money ");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc =new Scanner (System.in);
        int opt= sc.nextInt();

        if(opt==1){
            checkBalalnce();
        }else if(opt==2){
            withdrawmoney();
        }else if(opt==3){
            depositMoney();
        }else if(opt==4){
            return;
        }
        else {
            System.out.println("Enter a valid choice");
        }

    }

    //Method_3
    public void checkBalalnce(){
        System.out.println("Your Balance "+balance);
        menu();
    }

    //Method_4
    public void withdrawmoney(){
        System.out.println("Enter Amount");
        Scanner sc = new Scanner(System.in);
        float amount= sc.nextFloat();
        if(amount>balance){
            System.out.println("Insuffcient balance");

        }
        else  {
            balance-=amount;
            System.out.println("Money withdrawal successful");
        }
        menu();
    }

    //Method_5
    public void depositMoney(){
        System.out.println("Enter amount you want to deposit");
        Scanner sc = new Scanner(System.in);
        float depositAmount= sc.nextFloat();
        balance+=depositAmount;
        menu();

    }

}

public class Main {
    public static void main(String[] args){
        ATM obj = new ATM();

    }
}
