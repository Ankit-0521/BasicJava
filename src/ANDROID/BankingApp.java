package ANDROID;

import java.util.Scanner;

class BankDetails{
    private String accno;
    private String name;
    private String acc_type;
    private long balance;
    Scanner sc = new Scanner(System.in);

    public void openAccounts(){   // Method to open Account
        System.out.println("Enter Account number : ");
        accno = sc.next();
        System.out.println("Enter Account type : ");
        acc_type = sc.next();
        System.out.println("Enter Name : ");
        name = sc.next();
        System.out.println("Enter Balance: ");
        balance = sc.nextLong();
    }
    public void showAccounts(){  // method to show accounts
        System.out.println("Name of the account holder: " +name);
        System.out.println("Account no. " +accno);
        System.out.println("Account type " +acc_type);
        System.out.println("Balance " +balance);
    }
    public void deposit(){ // method to deposit money
        long amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = sc.nextLong();
        balance += amt;
    }
    public void withdraw(){ //method to withdraw amount.
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance>= amt){
            balance -= amt;
            System.out.println("Balance after withdraw: " +balance);
        }
        else {
            System.out.println("Your balance is less than " +amt+ "\t Transaction failed..!!");
        }
    }
    public boolean search(String ac_no){
        if (accno.equals(ac_no)){
            showAccounts();
            return (true);
        }
        return (false);
    }
}
public class BankingApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers of customers do you want to input?"); //create initial accounts
        int n = sc.nextInt();
        BankDetails[] C = new BankDetails[n];
        for (int i = 0; i<C.length; i++){
            C[i] = new BankDetails();
            C[i].openAccounts();
        }
        int ch;
        do {
            System.out.println("\n Banking System Application ");
            System.out.println("1.Display all accounts \n 2.Search by account number \n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit");
            System.out.println("Enter your choice: ");
             ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i=0; i< C.length; i++){
                        C[i].showAccounts();
                    }
                    break;
                case 2:
                    System.out.println("Enter account no. you want to search: ");
                    String ac_no = sc.next();
                    boolean found = false;
                    for (int i=0; i<C.length; i++){
                        found = C[i].search(ac_no);
                        if (found){
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Search failed! Account doesn't exist...!!");
                    }
                    break;
                case 3:
                    System.out.println("Enter Account no.: ");
                    ac_no = sc.next();
                    found = false;
                    for(int i=0; i<C.length; i++){
                        found = C[i].search(ac_no);
                        if (found){
                            C[i].deposit();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed...!! Account doesn't exist ");
                    }
                    break;
                case 4:
                    System.out.println("Enter the Account no.: ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i<C.length; i++){
                        found = C[i].search(ac_no);
                        if (found){
                            C[i].withdraw();
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Search failed....!!! Account doesn't exist: ");
                    }
                        break;
                case 5:
                    System.out.println("See you soon....");
                    break;


            }

        }

        while (ch!=5);
    }

}
