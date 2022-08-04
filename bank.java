import java.util.*;
public class bank {
    public static void main(String args[]){
        int amount=1000,accountNumber=45634568,accountBalance=8000;
        String customerName="Prashant";
        Scanner ns = new Scanner(System.in);
        customerDetails customer1= new customerDetails();
        customer1.createAccount(accountNumber,customerName,accountBalance);
        customer1.getAmount();
        customer1.depositAmount(amount);
        customer1.getAmount();
        customer1.withdrawAmount(amount);
        customerDetails customer2 = new customerDetails();
    }
}

class customerDetails {
    private int accNumber;
    private String accHolderName;
    private int accBalance;
    public void createAccount(int accountNumber, String customerName, int accountBalance) {
        accNumber = accountNumber;
        accHolderName = customerName;
        accBalance = accountBalance;
    }

    public void depositAmount(int amount){
        System.out.println("You are depositing" +amount);
        accBalance += amount;
    }

    public void withdrawAmount(int Amount) {
        System.out.println("You are withdrawing "+Amount);
        accBalance -= Amount;
    }
    public void getAmount(){
        System.out.println("accHolderName " +accBalance+ " in your Account");
    }
}



