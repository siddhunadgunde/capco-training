package day2assign;
public class Employee
{
    private int empId;
    private String name;
    private double salary;
    private BankAccount b;
    private Documents p;
    public Employee(int empId, String name, double salary)
    {
        this.empId =0;
        this.name ="";
        this.salary =0.0;
        //this.b=new BankAccount();
    }

    public Employee(int id, String nm, double sal, BankAccount b,Documents p)
    {
        empId=id;
        name=nm;
        salary=sal;
        this.b=b;
        this.p=p;
    }

    public Employee(int empId, String name, double salary, int b, BankAccount p) {
    }

    public Employee() {
    }


    @Override
    public String toString() {
        return "\nEmployee Details:\nEmployee Name: "+name+"\tEmployee Id: "+empId+"\tSalary: "+salary+"\n"+b+"\n"+p;
    }
}
