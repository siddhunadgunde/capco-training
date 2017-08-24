package day5.arrlistdemo;
import java.util.*;
import java.text.*;
public class JavaCourse
{
    private String courseId;
    private String courseName;
    private int dur;
    private String facultyName;
    private Date startDate;
    private Date endDate;
    private ArrayList<Student> sdList;
    public JavaCourse()
    {
        startDate=new Date();
        endDate=new Date();
        sdList=new ArrayList<Student>();
    }

    public JavaCourse(String courseId,String courseName,int dur, String facultyName,Date startDate,Date endDate,ArrayList<Student> sdList)
    {
        this.courseId=courseId;
        this.courseName=courseName;
        this.dur=dur;
        this.facultyName=facultyName;
        this.startDate=startDate;
        this.endDate=endDate;
        this.sdList=sdList;

    }

    public void addStudent(Student s)
    {
        sdList.add(s);
    }

    public void displayDetails()
    {
        System.out.println("Course Deatils are: ");
        System.out.println("Course ID: "+courseId+"\t Course Name: "+courseName+"\tCourse Duration: "+dur+"\t Start Date: "+new SimpleDateFormat().format(startDate)+"\t End Date: "+new SimpleDateFormat().format(endDate));
        for (int i=0;i<sdList.size();i++)
            System.out.println(sdList.get(i).toString());

    }
}
