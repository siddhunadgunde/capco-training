package day1.com;

public class FirstProject {
    protected String depName,div;
    public FirstProject()
    {
        this.depName="";
        this.div="";
        System.out.println("\nBase Class Default Constructor called with First Object !");
    }
    public FirstProject(String dept, String cls)
    {
        System.out.println("Base Class Parameterized Constructor called called with Second object ! ");
        this.depName=dept;
        this.div=cls;

    }
    public void display()
    {
        System.out.println("Department: "+depName);
        System.out.println("Class: "+div);
    }

}
