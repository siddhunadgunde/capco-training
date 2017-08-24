package day5.linklist;

import java.util.*;
public class LinkedListDemo
{
    public static void main(String[] args)
    {
        System.out.println("---------------Linked List-------------------");
        LinkedList<String> l1=new LinkedList<String>();
        l1.add("ABC");
        System.out.println(l1.getClass()+" "+l1);

        LinkedList<String> l2=new LinkedList<String>();
        l2.add("XYZ");
        System.out.println(l2.getClass()+" "+l2);

        System.out.println("-------------------Vector-----------------");
        Vector<String> v1=new Vector<String>();
        v1.addElement("PQR");
        System.out.println(v1.getClass()+" "+v1);
        v1.addElement("XYY");
        v1.addElement("MNO");
        for(String tmp:v1)
            System.out.println(tmp);

        System.out.println("---------------Enumeration-------------------");
        Enumeration e1=v1.elements();
        while(e1.hasMoreElements())
        {
            System.out.println(e1.nextElement());
        }

        System.out.println("-------------------Stack-----------------");
        Stack<Integer> s1=new Stack<Integer>();
        s1.push(100);
        s1.push(200);
        s1.push(600);
        s1.push(700);

        System.out.println("peek "+s1.peek());
        System.out.println("pop "+s1.pop());
        System.out.println(s1);

        Stack s2=new Stack();
        System.out.println(s2.isEmpty());

        s2.push(new String("PQR"));
        s2.push(new Double(34.09));
        s2.push(new Character('A'));

        System.out.println(s2.isEmpty());
        for(Object obj:s2)
            System.out.println(obj);


        System.out.println("-------------------String Tokenizer----------------");
        String str="23 67.4 A Mama";
        StringTokenizer st=new StringTokenizer(str);
        System.out.println("Total Tokens: "+st.countTokens());
        while(st.hasMoreTokens())
            System.out.println(st.nextToken());

        System.out.println("-------------------Iterator------------------");

        ArrayList lib=new ArrayList();
        lib.add(new String("Java Black Book"));
        lib.add(new Boolean(false));
        lib.add(new Date());
        lib.add(new Integer(123));
        Iterator it=lib.iterator();
        while(it.hasNext())
        {
            Object obj=it.next();
            System.out.println(obj);
        }
    }

}
