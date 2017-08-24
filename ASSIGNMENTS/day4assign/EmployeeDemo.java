package day4assign;
import java.sql.*;
public class EmployeeDemo
{
    public static void main(String s[]) throws Exception {
        BankAccount b1=new BankAccount("63435345423","Sudhir Ashok Chavan","Hinjewadi","BKID0302324", 3445453);
        Documents p1=new Documents("Sudhir Ashok Chavan",12345,"622012367865", "AWRPN123124","7656453421D");
        WageOfEmployee w1=new WageOfEmployee(40,50,420000);
        SalesEmployee se=new SalesEmployee(101,"Sudhir Chavan",32726,40,b1,p1);


        String bankData[]=b1.toString().split(",");

        String weData[]=w1.toString().split(",");
        String empData[]=se.toString().split(",");
        String docData[]=p1.toString().split(",");

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_data","root","1234");
        Statement st=con.createStatement();
  //      st.executeUpdate("create table emp(empid int,name varchar(50),salary double,sales int,commission double, netsalary double)");
        System.out.println("Employee Table Created....!");
    //    st.executeUpdate("create table bankaccount(accno int(20),custname varchar(50),branch varchar(50),ifsc varchar(30),balance double)");
        System.out.println("BankAccount Table Created....!");
        //st.executeUpdate("create table documents(name varchar(50),passno int,aadharno int(20),panno varchar(20),contact int(10))");
        System.out.println("Documents Table Created....!");
        //st.executeUpdate("create table wageemp(noweek int,wrkinghour int,hrsrate int, grssal double)");
        System.out.println("WageEmployee Table Created....!");

        //        st.executeUpdate("insert into emp values("+Integer.parseInt(empData[0])+",'"+empData[1]+"',"+Double.parseDouble(empData[2])+","+Integer.parseInt(empData[3])+","+Double.parseDouble(empData[4])+","+Double.parseDouble(empData[5])+")");
        System.out.println("Employee Data Inserted....!");
        //st.executeUpdate("insert into bankaccount values('"+bankData[0]+"','"+bankData[1]+"','"+bankData[2]+"','"+bankData[3]+"',"+Double.parseDouble(bankData[4])+")");
        System.out.println("Bank Data Inserted....!");
        //st.executeUpdate("insert into documents values('"+docData[0]+"',"+Integer.parseInt(docData[1])+",'"+docData[2]+"','"+docData[3]+"','"+docData[4]+"')");
        System.out.println("Document Data Inserted....!");
        //st.executeUpdate("insert into wageemp values("+Integer.parseInt(weData[0])+","+Integer.parseInt(weData[1])+","+Double.parseDouble(weData[2])+","+Double.parseDouble(weData[3])+")");
        System.out.println("Wage Data Inserted....!");
    }
}
