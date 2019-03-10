package com.java.interfaces;

public class InterfaceExample {

    public static void main(String[] args) {
        LoanDepartment sbi= new SBI();
        LoanDepartment sbi2= new SBI();
        sbi.newLoanType();
    }
}

interface LoanDepartment{

    final float interest =4.0f;
    float getRateOfInterestForHomeLoan();
    float getRateOfInterestForPersonalLoan();
    default void newLoanType(){
        System.out.println("New Loan launched");
    }
}
interface AccountDepartment{
    final String savingAccount="SAVING_ACCOUNT";
    final String currentAccount="CURRENT_ACCOUNT";
    String getSavingAccountVale();
    String getCurrentAccountValue();

}
//When limited contracts needs to be implemented
class XYZBank implements AccountDepartment{

    @Override
    public String getSavingAccountVale() {
        return null;
    }

    @Override
    public String getCurrentAccountValue() {
        return null;
    }
}

//when all contracts are required to be implemented
class PQRBank implements AccountDepartment,LoanDepartment{

    @Override
    public float getRateOfInterestForHomeLoan() {
        return 0;
    }

    @Override
    public float getRateOfInterestForPersonalLoan() {
        return 0;
    }

    @Override
    public String getSavingAccountVale() {
        return null;
    }

    @Override
    public String getCurrentAccountValue() {
        return null;
    }
}


class SBI implements LoanDepartment{

    /*@Override
    public void newLoanType() {
        System.out.println("New Loan launched by SBI");

    }*/

    public float myHomeIRCalculatar(){
        return 4.2f + interest;
    }

    @Override
    public float getRateOfInterestForHomeLoan() {
        return myHomeIRCalculatar();
    }

    @Override
    public float getRateOfInterestForPersonalLoan() {
        return interest + 6.2f;
    }


}