package day1.tostringdemo;

public class ToStringDemo
{
    private int real;
    private int img;

    public ToStringDemo()
    {
        real=0;
        img=0;
    }

    public ToStringDemo(ToStringDemo tsd)
    {
        tsd.real=100;
        tsd.img=200;
    }

    @Override
    public String toString() {
        return "Real: "+real+"\nImaginary:"+img;
    }

    public static void main(String s[])
    {
        ToStringDemo sd=new ToStringDemo();
        ToStringDemo sd2=new ToStringDemo(sd);
        System.out.println(sd2);

    }
}
