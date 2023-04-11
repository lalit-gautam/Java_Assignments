public class BankService {
    protected String username;
    protected String bankName;
    protected int accountBalance;
    protected String accountNumber ;

    void displayBankName(){
        System.out.println("BankName        : " + bankName);
    }
    void displayUsername(){
        System.out.println("Account username: " + username);
    } 
    static String displayAccountNum(String bankName){       
        long randomNum = (long) (Math.random() * Math.pow(10, 16));
        String accountNumber = bankName+randomNum;
        return accountNumber;
    } 
    void displayAccountBalance(){
        System.out.println("Account Balance : " + accountBalance);
    }
    public void getUserDetails(){
        System.out.println("BankName        : " + bankName);
        System.out.println("Account username: " + username);
        System.out.println("Account Number  : " + accountNumber);
        System.out.println("Account Balance : " + accountBalance);
    }
}
