
package labtest;


public class CurrentAccount extends BankAccounts{
    private int noOfCheckBooksIssued;
    private double balanceOfPreviousMonth;
    private double totalOfDeposits;
    private double bankCharges;
    private double totalOfWithdrawals;
    
    public CurrentAccount(String bankAccountNo, String TypeOfBankAccount, String customerName, int age, double balanceOfPreviousMonth, double totalOfDeposits, double bankCharges, double totalOfWithdrawals, int noOfCheckBooksIssued){
        super(bankAccountNo, TypeOfBankAccount, customerName, age, balanceOfPreviousMonth, totalOfDeposits, bankCharges, totalOfWithdrawals);
        this.balanceOfPreviousMonth=balanceOfPreviousMonth;
        this.bankCharges=bankCharges;
        this.totalOfDeposits=totalOfDeposits;
        this.totalOfWithdrawals=totalOfWithdrawals;
    }
    public double calCheckBookCharges(){
        return noOfCheckBooksIssued*50;
    }
    @Override
    public double calInterest(){
        return (balanceOfPreviousMonth+totalOfDeposits-bankCharges-totalOfWithdrawals)*1.4/100;
    }
    @Override
    public double calBalanceBroughtForward(){
        return (balanceOfPreviousMonth+totalOfDeposits-bankCharges-totalOfWithdrawals+calInterest()-calCheckBookCharges());
    }
}
