
package labtest;


public class LabTest {

    public static void main(String[] args) {
        StarSavings ss1=new StarSavings("S2541756", "Star Savings", "Fernando", 15, 25000.00, 5000.00, 100.00, 0);
        System.out.println("Star Savings Bank Account No: "+ss1.getBankAccountNo());
        System.out.println("Star Savings Type of the Bank Account: "+ss1.getBankType());
        System.out.println("Star Savings Customer Name: "+ss1.getCustomerName());
        System.out.println("Star Savings Interest: "+ss1.calInterest());
        System.out.println("Star Savings Balance Brought Forward: "+ss1.calBalanceBroughtForward());
        System.out.println("");
        
        GoldSavings gs1=new GoldSavings("G2541362", "Gold Savings", "Perera", 20, 32000.00, 10000.00, 250.00, 0);
        System.out.println("Gold Savings Bank Account No: "+gs1.getBankAccountNo());
        System.out.println("Gold Savings Type of the Bank Account: "+gs1.getBankType());
        System.out.println("Gold Savings Customer Name: "+gs1.getCustomerName());
        System.out.println("Gold Savings Interest: "+gs1.calInterest());
        System.out.println("Gold Savings Balance Brought Forward: "+gs1.calBalanceBroughtForward());
        System.out.println("");
        
        CurrentAccount ca1=new CurrentAccount("C4521453", "Current Account", "Fonseka", 45, 41000.00, 35000.00, 250.00, 0, 5);
        System.out.println("Current Savings Bank Account No: "+ca1.getBankAccountNo());
        System.out.println("Current Savings Type of the Bank Account: "+ca1.getBankType());
        System.out.println("Current Savings Customer Name: "+ca1.getCustomerName());
        System.out.println("Current Savings Interest: "+ca1.calInterest());
        System.out.println("Current Savings Balance Brought Forward: "+ca1.calBalanceBroughtForward());
        System.out.println("");
        
        PowerSavings ps1=new PowerSavings("P2541789", "Power Savings", "Andrea", 30, 32000.00, 25000.00, 300.00, 0);
        System.out.println("Power Savings Bank Account No: "+ps1.getBankAccountNo());
        System.out.println("Power Savings Type of the Bank Account: "+ps1.getBankType());
        System.out.println("Power Savings Customer Name: "+ps1.getCustomerName());
        System.out.println("Power Savings Interest: "+ps1.calInterest());
        System.out.println("Power Savings Bonus: "+ps1.calBonus());
        System.out.println("Power Savings Balance Brought Forward: "+ps1.calBalanceBroughtForward());
        System.out.println("");
    }
    
}
