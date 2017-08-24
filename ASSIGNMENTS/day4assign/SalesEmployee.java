package day4assign;

import java.util.Scanner;

public class SalesEmployee extends Employee
{
    private int sales;
    private double comission;
    private double netSal;
    //private int empId;
    //private String name;
    private double sal;
    Scanner sc=new Scanner(System.in);

    public SalesEmployee(int empId, String name, double salary, int sales, BankAccount b, Documents p)
    {
        super(empId,name,salary,b,p);
        this.sales=sales;
        this.sal=salary;
        netSal= calculateNetSal(sales,sal)+salary;
    }

    public double calculateNetSal(int sale,double slry)
    {
        if(sale<4000)
            this.comission=(2*slry)/100;
        if(sale>=5000&&sale<=7000)
            this.comission=(5*slry)/100;
        if(sale>=10000&&sale<=15000)
            this.comission=(10*slry)/100;
        return this.comission;
    }
/*
    public void displaySalesDetail()
    {
        System.out.println("\nSales: "+sales+"\tComission: "+comission+"\tNetSalary: "+netSal);
    }
*/

    @Override
    public String toString() {
        return super.toString()+","+sales+","+comission+","+netSal;
    }
}
