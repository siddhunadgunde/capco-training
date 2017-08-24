package day5.arrlistdemo;

import java.util.ArrayList;
import java.util.Date;

public class TrainingInstitute
{
    public static void main(String[] args)
    {
        JavaCourse jc=new JavaCourse();
        Student sd1=new Student();
        Student sd2=new Student(101,"Rahul","B.E.");
        ArrayList<Student> sdList1=new ArrayList<Student>();
        JavaCourse jc1=new JavaCourse("JVSPG","Java Spring",6,"S. B. Madake",new Date(2017,8,16),new Date(2018,1,16),sdList1);
        jc1.addStudent(sd2);
        jc1.displayDetails();

    }
}
