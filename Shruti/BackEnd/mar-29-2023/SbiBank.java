public class SbiBank extends BankService{

    SbiBank(String username, String bankName, int accountBalance) {
        this.username = username;
        this.bankName = bankName;
        this.accountBalance = accountBalance;
        this.accountNumber= BankService.displayAccountNum(bankName);
        
    }
    // public String getUserDetails(){
    //     return username + "," + bankName + ", " + accountBalance + ", " + accountNumber;
    // }
}
