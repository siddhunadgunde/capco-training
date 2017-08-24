package day2.empinheritance;
import java.util.*;
public class Employee
{
    private int empId;
    private String name;
    private double salary;

    public Employee()
    {
        empId=0;
        name="";
        salary=0.0;
    }

    public Employee(int id, String nm, double sal)
    {
        empId=id;
        name=nm;
        salary=sal;
    }


    public void displayData()
    {
        System.out.println("\nEmpId: "+empId+"\tName: "+name+"\tSalary: "+salary);
    }
}
