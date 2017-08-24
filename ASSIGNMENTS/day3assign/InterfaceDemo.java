package day3assign;

interface Shape
{
    public void draw();
}
class Circle implements Shape
{
    @Override
    public void draw() {
        System.out.println("draw() Method Implemented by Circle");
    }
}
class Square implements Shape
{

    @Override
    public void draw() {
        System.out.println("draw() Method Implemented by Square");
    }
}
public class InterfaceDemo
{
    public static void main(String[] args)
    {
        Circle c=new Circle();
        Square s= new Square();
        c.draw();
        s.draw();
    }
}
