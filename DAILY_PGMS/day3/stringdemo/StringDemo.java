package day3.stringdemo;
import java.util.*;
public class StringDemo
{
    public static void main(String[] args)
    {
        String txt="It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, making it look like readable English.";

        Scanner sc=new Scanner(System.in);
        char c;
        int cnt=0;
        System.out.println("String: "+txt);
        System.out.println("Enter the Char:");
        c=sc.next().charAt(0);
        for(int i=0;i<txt.length();i++)
        {
            if(txt.charAt(i)==c)
            {
                cnt++;
            }
        }
        System.out.println("\nOccurances of Character "+c+" is "+cnt);

        System.out.println("\nString  After Replace: "+txt.replaceAll("m","k"));

        System.out.println("\nUpper Case: "+txt.toUpperCase());

        System.out.println("\nLower Case: "+txt.toLowerCase());

        System.out.println("\nReverse String: "+reverseString(txt));

        String s2[]=txt.split(" ");

        System.out.println("\nEach Word in Reverse: ");
        for(int i=0;i<s2.length;i++)
        {
            System.out.print(reverseString(s2[i])+" ");
        }

        System.out.println("\n\nWords Starting from Capital: ");
        for(int i=0;i<s2.length;i++)
        {
            System.out.print(s2[i].replaceFirst(s2[i].charAt(0)+"", Character.toUpperCase(s2[i].charAt(0))+"")+" ");
        }

    }
    private static String reverseString(String text)
    {
        String rev="";
        for(int i=text.length()-1;i>=0;i--)
        {
            rev=rev+text.charAt(i);
        }
        return rev;
    }
}
