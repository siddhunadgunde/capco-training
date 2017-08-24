package day2assign;

public class Documents
{
    private  String name;
    private int pasNo;
    private double aadharNo;
    private String panNo;
    private double conNo;
    //private String issueAuth;
    //rivate String issDate;
    //private  String validTill;

    public Documents(String name, int pasNo, double aadharNo, String panNo, double conNo)
    {
        this.name=name;
        this.pasNo=pasNo;
        this.aadharNo=aadharNo;
        this.panNo=panNo;
        this.conNo=conNo;
    }

    @Override
    public String toString()
    {
        return "\nDocuments Details: \nName: "+name+"\tPassport No: "+pasNo+"\tAadhar No: "+aadharNo+"\tPAN No: "+panNo+"\tContact No: "+conNo;
    }
}
