package day3.interfacedemo;

public class Employee implements Rules
{

    @Override
    public void sawpCard() {
        System.out.println("swapCard from Employee class");
    }

    @Override
    public void calculateSalary()
    {
        System.out.println("calculateSalary from Employee class");
    }
}
