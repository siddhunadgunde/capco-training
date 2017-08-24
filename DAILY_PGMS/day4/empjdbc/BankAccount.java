package day4.empjdbc;

public class BankAccount
{

    private String accNo;
    private String custName;
    private String branch;
    private String ifsc;
    private double bal;

    public BankAccount(String accNo,String custName, String branch, String ifsc, double bal)
    {
        this.accNo=accNo;
        this.custName=custName;
        this.branch=branch;
        this.ifsc=ifsc;
    }


    @Override
    public String toString()
    {
        return accNo+","+custName+","+branch+","+ifsc+","+bal;
    }
}
