package day1assign;
import java.util.*;
class Employee
{
    private int empId;
    private String name;
    private double salary;

    /*public Employee()
    {
        this.empId=0;
        this.name="";
        this.salary=0.0;
    }*/

    void acceptData()//throws Exception
    {
        /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter EmpID, NAme, Salary: ");
        this.empId=Integer.parseInt(br.readLine());
        this.name=br.readLine();
        this.salary=Double.parseDouble(br.readLine());*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter EmpID, Name, Salary: ");
        this.empId=sc.nextInt();
        this.name=sc.next();
        this.salary=sc.nextDouble();

        /*JOptionPane op=new JOptionPane();
        this.empId=Integer.parseInt(op.showInputDialog("Enter EmpId:"));
        this.name=op.showInputDialog("Enter Name:");
        this.salary=Double.parseDouble(op.showInputDialog("Enter Salary:"));*/


    }

    void displayData()
    {
        System.out.println("\n"+this.empId+"\t\t"+this.name+"\t\t"+this.salary);
        //System.out.println("Employee Name: "+name);
        //System.out.println("Salary: "+salary);
    }
    boolean searchRecord(int id)
    {
        if(this.empId==id)
            return true;
        else
            return false;
    }
}
public class SecondProject
{
    public static void main(String s[])throws Exception
    {
        int op,id;
        Scanner sc=new Scanner(System.in);
        Employee[] e = new Employee[5];
        do {
            System.out.println("\n1.Accept Records\n2.Display Records\n3.Search Record\n4.Exit\nEnter Option:");
            op=sc.nextInt();
            switch (op)
            {
                case 1:
                    for(int i=0;i<e.length;i++)
                    {
                        e[i]=new Employee();
                        e[i].acceptData();
                    }
                    break;
                case 2:
                    System.out.println("Employee Id\tEmployee Name\tSalary");
                    for(int j=0;j<5;j++)
                    {
                        e[j].displayData();
                    }
                    break;
                case 3:
                    boolean res;
                    System.out.println("Enter the empId:");
                    id=sc.nextInt();
                    for(int k=0;k<e.length;k++)
                    {
                        res = e[k].searchRecord(id);
                        if (res) {
                            System.out.println("\nRecord is found at " + k);
                            System.out.println("\nEmployee Id\tEmployee Name\tSalary");
                            e[k].displayData();
                            break;
                        }

                    }
                    break;
                default:
                    System.out.println("\nInvalid Choice....!");
                    break;
            }

        }while(op!=4);

    }

}
