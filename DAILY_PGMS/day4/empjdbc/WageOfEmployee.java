package day4.empjdbc;

public class WageOfEmployee extends Employee
{
    private int wrkingHrs;
    private int noWeek;
    private double annSal;
    private double hrRate;
    private int noHrs;
    private double grsSal;

    public WageOfEmployee(int wrkingHrs, int noWeek, double annSal)
    {
        this.wrkingHrs=wrkingHrs;
        this.noWeek=noWeek;
        this.annSal=annSal;
        noHrs=noWeek*wrkingHrs;
        hrRate=annSal/noHrs;
        grsSal=noHrs*hrRate;
    }

    @Override
    public String toString()
    {
        return ""+noWeek+","+noHrs+","+hrRate+","+grsSal;
    }
}
