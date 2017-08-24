package day3assign;
import java.io.*;
import java.util.StringTokenizer;

public class FileHandling
{
    public static void main(String[] args)throws Exception
    {
        int cnt=0;
        StringTokenizer st;
        String s1="";
        BufferedReader br=new BufferedReader(new FileReader("d:\\input.txt"));
        String input=br.readLine();
        String str[]=input.split(",");
        System.out.println("Reading File....");
        FileOutputStream fout=new FileOutputStream("d:\\output.txt");
        String op="\nEmployee Id\tEmployee Name\tSalary\n";
        fout.write(op.getBytes());
        for(int i=0;i< str.length;i++)
        {
            st=new StringTokenizer(str[i]," ");
            while(st.hasMoreTokens())
                s1="\n"+s1+st.nextToken()+"\t";
            writeToFile(fout,s1);
            cnt++;
        }

        System.out.println("Writing Data to File....");
        System.out.println(cnt+" record(s) inserted to file");
        fout.close();
//        System.out.println("Data written Successfully !");

    }

    private static void writeToFile(FileOutputStream fout, String s)throws Exception
    {
        fout.write(s.getBytes());
    }
}
