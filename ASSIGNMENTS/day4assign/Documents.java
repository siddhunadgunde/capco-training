package day4assign;

public class Documents
{
    private  String name;
    private int pasNo;
    private String aadharNo;
    private String panNo;
    private String conNo;
    //private String issueAuth;
    //rivate String issDate;
    //private  String validTill;

    public Documents(String name, int pasNo, String aadharNo, String panNo, String conNo)
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
        return name+","+pasNo+","+aadharNo+","+panNo+","+conNo;
    }
}
