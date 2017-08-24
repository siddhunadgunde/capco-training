package day4.jdbcdem;
import java.util.*;
import java.sql.*;
public class JDBCDemo
{
    public static void main(String[] args)throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_data","root","1234");
        Statement st=con.createStatement();
        ResultSet rs;
        System.out.println("----------Empolyee Data-----------");
        rs=st.executeQuery("select * from Employee");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
        }
        System.out.println("----------------------------------");
        //int res=st.executeUpdate("create table Student(rollNo int,Name varchar(40),Address varchar(25),Department varchar(40))");
        //System.out.println("Result: "+res);
        System.out.println("\nStudent table Created");
        Scanner sc=new Scanner(System.in);
        //System.out.println("\nEnter Student Roll No, Name, Address, Department: ");
        //int roll=sc.nextInt();
        //String name=sc.next(),add=sc.next(),dept=sc.next();
        //st.executeUpdate("insert into Student values("+roll+",'"+name+"','"+add+"','"+dept+"')");
        System.out.println("\nRecord Inserted ");
        System.out.println("\n----------Student Data-----------");
        rs=st.executeQuery("select *from Student");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
        }
        System.out.println("----------------------------------");
        //st.executeUpdate("delete from Employee where ename='Piyush'");
        System.out.println("\nEmployee Record Deleted ");
        System.out.println("----------Empolyee Data-----------");
        rs=st.executeQuery("select * from Employee");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
        }
        System.out.println("----------------------------------");

        //st.executeUpdate("update Employee set ename='Bahubali' where empId=101");
        System.out.println("\nEmployee Record Updated ");
        System.out.println("----------Empolyee Data-----------");
        rs=st.executeQuery("select * from Employee");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
        }
        System.out.println("----------------------------------");

    }
}
