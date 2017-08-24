package day1.com.corejava;
import day1.com.*;
import java.io.*;
public class NewClass extends FirstProject
{
    private int rollNo;
    private String  name;
    NewClass()
    {
        this.rollNo=0;
        this.name="";
        System.out.println("Derived Class Default Constructor called with First Object ! ");
    }
    NewClass(String dept,String cls, int roll, String nm)
    {
        super(dept,cls);
        System.out.println("Derived Class Parameterized Constructor called with Second object ! ");
        this.rollNo=roll;
        this.name=nm;
        System.out.println("Data initialized !");
    }
    void displayData()
    {
        System.out.println("Roll No: "+rollNo);
        System.out.println("Name: "+name);
    }
    public static void main(String s[])
    {
        NewClass n1= new NewClass();
        NewClass n2= new NewClass("Computer", "A", 101, "SIDDHU NADGUNDE");
        System.out.println("\n-----------First Object Data-------------");
        n1.display();
        n1.displayData();
        System.out.println("\n-------------------------------------------");
        System.out.println("\n-----------Second Object Data-------------");
        n2.display();
        n2.displayData();
        System.out.println("\n-------------------------------------------");
        System.out.println("Done !");
    }
}
