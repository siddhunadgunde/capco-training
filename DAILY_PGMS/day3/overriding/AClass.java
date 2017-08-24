package day3.overriding;

public class AClass
{
    public void show()
    {
        System.out.println("AClass show()");
    }
}
class BClass extends AClass
{
    public void show()
    {
        System.out.println("BClass show()");
    }
    public static  void  main(String s[])throws Exception
    {
        BClass b=new BClass();
        b.show();
        BClass b2= (BClass) new AClass();

        //b=(BClass) new AClass();
        b2.show();
    }
}
