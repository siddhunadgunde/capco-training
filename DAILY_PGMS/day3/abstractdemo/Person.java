package day3.abstractdemo;

 public abstract class Person
{
    private String name;
    private String gender;

    public Person(String nm, String gen)
    {
        this.name=nm;
        this.gender=gen;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "\nName: "+name+"\tGender: "+gender;
    }
}
class Employee extends Person
{
    private int empId;

    public Employee(String nm,String gen, int id)
    {
        super(nm,gen);
        this.empId=id;
    }
    @Override
    public void work()
    {
        if(empId==0)
            System.out.println("\nNot working");
        else
            System.out.println("\nWorking as Employee");

    }

    public static void main(String s[])
    {
        Person p=new Employee("Somu", "Male",102);
        Person e=new Employee("Sudhir", "Male",101);
        System.out.println(e);
        System.out.println(e);

    }

}
