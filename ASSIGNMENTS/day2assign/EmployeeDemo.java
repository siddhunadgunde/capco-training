package day2assign;

public class EmployeeDemo
{
    public static void main(String s[])
    {
        BankAccount b1=new BankAccount(03434353454,"Sudhir Ashok Chavan","Hinjewadi","BKID0302324", 3445453);
        Documents p1=new Documents("Sudhir Ashok Chavan", 12345,622012367865D, "AWRPN123124",7656453421D);
        WageOfEmployee w1=new WageOfEmployee(40,50,420000);
        SalesEmployee se=new SalesEmployee(101,"Sudhir Chavan",32726,40,b1,p1);
        System.out.println(se);
        System.out.println(w1);

    }
}
