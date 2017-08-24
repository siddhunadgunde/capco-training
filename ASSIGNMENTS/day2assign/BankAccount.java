package day2assign;

public class BankAccount
{

    private double accNo;
    private String custName;
    private String branch;
    private String ifsc;
    private double bal;

    public BankAccount(double accNo,String custName, String branch, String ifsc, double bal)
    {
        this.accNo=accNo;
        this.custName=custName;
        this.branch=branch;
        this.ifsc=ifsc;
    }

    @Override
    public String toString()
    {
        return "\nAccount Details:\nCustomer Name: "+custName+"\tAccount No: "+accNo+"\tBranch Name: "+branch+"\tIFSC Code: "+ifsc+"\tBalance: "+bal;
    }
}
