package day3.filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileDemo
{
    public static void main(String[] args)throws Exception
    {
        String filePath="d:\\output1.txt";
        FileOutputStream fout=new FileOutputStream(filePath);
        String name="This is a File Handling in JAVA";
        byte b[]=name.getBytes();
        fout.write(b);
        fout.close();
        System.out.println("Data is written to File.");
        System.out.println("Data: ");
        FileInputStream fin=new FileInputStream(filePath);
        int i,j=0;
        char[] c = new char[0];
        while((i=fin.read())!=-1)
        {
            
            c[j]=(char)i;
            j++;
            //System.out.print((char)i);
        }
        System.out.print(c);
    }
}
