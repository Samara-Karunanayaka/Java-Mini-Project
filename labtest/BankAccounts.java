
package labtest;


public class BankAccounts {
    private String bankAccountNo;
    private String TypeOfBankAccount;
    private String customerName;
    private int age;
    private double balanceOfPreviousMonth;
    private double totalOfDeposits;
    private double bankCharges;
    private double totalOfWithdrawals;
    
    public BankAccounts(String bankAccountNo, String TypeOfBankAccount, String customerName, int age, double balanceOfPreviousMonth, double totalOfDeposits, double bankCharges, double totalOfWithdrawals){
        this.bankAccountNo=bankAccountNo;
        this.TypeOfBankAccount=TypeOfBankAccount;
        this.customerName=customerName;
        this.age=age;
        this.balanceOfPreviousMonth=balanceOfPreviousMonth;
        this.totalOfDeposits=totalOfDeposits;
        this.bankCharges=bankCharges;
        this.totalOfWithdrawals=totalOfWithdrawals;
    }
    public String getBankAccountNo(){
        return bankAccountNo;
    }
    public String getBankType(){
        return TypeOfBankAccount;
    }
    public String getCustomerName(){
        return customerName;
    }
    public int getAge(){
        return age;
    }
    public double calInterest(){
        return (balanceOfPreviousMonth+totalOfDeposits-bankCharges-totalOfWithdrawals)*1.2/100;
    }
    public double calBalanceBroughtForward(){
        return (balanceOfPreviousMonth+totalOfDeposits-bankCharges-totalOfWithdrawals+calInterest());
    }
}
