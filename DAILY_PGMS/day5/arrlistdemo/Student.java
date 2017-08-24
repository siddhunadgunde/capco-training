package day5.arrlistdemo;

public class Student
{
    private int rollNo;
    private String name;
    private String qual;

    public Student()
    {
        System.out.println("Student Default Constructor Initialized");
    }

    public Student(int rollNo,String name,String qual)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.qual=qual;
    }

    @Override
    public String toString() {
        return "RollNo: "+rollNo+"\tStudent Name: "+name+"\tQualification: "+qual;
    }
}
