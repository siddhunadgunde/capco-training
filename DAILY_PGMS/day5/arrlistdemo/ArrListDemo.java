package day5.arrlistdemo;
import java.util.*;
class Books
{
    private String bkName;
    public Books()
    {
    }
    public Books(String bkName)
    {
        this.bkName=bkName;
    }

    @Override
    public String toString() {
        return bkName;
    }
}
public class ArrListDemo
{
    public static void main(String[] args)
    {
        ArrayList<Books> lib=new ArrayList<Books>();
        lib.add(new Books("Java Black Book"));
        lib.add(new Books("Quantitive Aptitude"));
        lib.add(new Books("Cloud Computing"));
        for(int i=0;i<lib.size();i++)
        {
            System.out.println(lib.get(i));
        }

    }
}
