import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
    static String userName = "";
    static String bankName = "";
    static int accountBalance = 0;
    public static void main(String[] args) {
        ArrayList<User> arrayList = new ArrayList<>();
        int i = 1 ;
        do{
        System.out.println("What is your username : ");
        getUserNameInput();
        
        System.out.println("Which bank account you want to create : \npress H for HDFC Bank, press S for SBI Bank, press A for Axis Bank ");       
        getBankNameInput();

        System.out.println("How much money do you want to deposit: ");
        getBalanceInput();
        
        arrayList.add(new User(userName, bankName, accountBalance));
        
        i++;
        } while ( i < 2);

        for(User userdata : arrayList){
            userdata.showDetails();
        }
    }

    // public static void main(String[] args) {
    //     User bank1 = new User("userName", "h", 10000);
    //     System.out.println(bank1.showDetails());
        
    // }
    
    static void getUserNameInput(){
        Scanner sc = new Scanner(System.in);
        userName = sc.nextLine();
    }

    static boolean getBankNameInput(){
        Scanner sc = new Scanner(System.in);
        String bankAccount = sc.nextLine();
        if(bankAccount.equalsIgnoreCase("h")){
            bankName = "HDFC";
            return true;
        } else if(bankAccount.equalsIgnoreCase("s")){
            bankName = "SBI";
            return true;
        } else if (bankAccount.equalsIgnoreCase("a")){
            bankName = "Axis";
            return true;
        } else {
            System.out.println("Please provide correct input !");
            if(getBankNameInput()){
                return true;
            } else {
                return false;
            }           
        }
    }

    static void getBalanceInput(){
        Scanner sc = new Scanner(System.in);
        accountBalance = sc.nextInt();
    }
}



