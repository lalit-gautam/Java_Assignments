public class User {
    BankService bank;
    
    User(String username, String bankName , int accountBalance){
        if(bankName.equalsIgnoreCase("h")){
            bank = new HdfcBank(username, bankName, accountBalance);
        } else if (bankName.equalsIgnoreCase("s")){
            bank = new SbiBank(username, bankName, accountBalance);
        } else {
            bank = new AxisBank(username, bankName, accountBalance);
        }
    }
    public void showDetails(){
        bank.getUserDetails();
    }

}
