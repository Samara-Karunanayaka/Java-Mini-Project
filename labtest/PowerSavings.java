
package labtest;


public class PowerSavings extends BankAccounts{
    public PowerSavings(String bankAccountNo, String TypeOfBankAccount, String customerName, int age, double balanceOfPreviousMonth, double totalOfDeposits, double bankCharges, double totalOfWithdrawals){
        super(bankAccountNo, TypeOfBankAccount, customerName, age, balanceOfPreviousMonth, totalOfDeposits, bankCharges, totalOfWithdrawals);
    }
    public double calBonus(){
        return super.calInterest();
    }
    @Override
    public double calBalanceBroughtForward(){
        return (super.calBalanceBroughtForward()+calBonus());
    }
}
