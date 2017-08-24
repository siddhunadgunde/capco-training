package day3.overloading;

public class Calculation
{

    public void sum(int val1)
    {
        System.out.println("sum(int) called !");

    }

    public void sum(int val1, int val2)
    {
        System.out.println("sum(int,int) called !");

    }

    public void sum(int val1,int val2,int val3)
    {
        System.out.println("sum(int,int,int) called !");
    }

    public static void main(String s[])
    {
        Calculation c=new Calculation();
        c.sum(12);
        c.sum(12,12);
        c.sum(12,12,12);
    }


}
