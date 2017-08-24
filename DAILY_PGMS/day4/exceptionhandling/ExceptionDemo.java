package day4.exceptionhandling;

class MyException extends Exception
{
    private String msg;
    MyException(String msg)
    {
        this.msg=msg;
    }

    @Override
    public String toString() {
        return "This is user defined exception !\n"+msg;
    }
}
public class ExceptionDemo
{
    public static void main(String[] args)
    {
        int a=10;
        try
        {
            if(a==10)
                throw new MyException("My Exception..! "+a+"");
        }
        catch (MyException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally");
        }
    }
}
