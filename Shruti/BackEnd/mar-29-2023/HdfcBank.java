public class HdfcBank extends BankService{

    HdfcBank(String username, String bankName, int accountBalance) {
        this.username = username;
        this.bankName = bankName;
        this.accountBalance = accountBalance;
        this.accountNumber= BankService.displayAccountNum(bankName);
    }
    // public String getUserDetails(){
    //     return username + "," + bankName + ", " + accountBalance + ", " + accountNumber;
    // }

    
}