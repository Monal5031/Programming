import java.io.*;
import java.lang.*;
import java.util.*;

class CreateFile
    {
    private Formatter x;

    public void openFile()
        {
        try
            {
            x=new Formatter("/home/student/Desktop/Monal/Search/InputFile4.txt");
            }
        catch(Exception e)
            {
            System.out.println("GOt an error");
            }
        }

    public void addRecords()
        {
        int n=2000;
        int []arr=new int[n];
        Random obj=new Random();
        for(int i=0;i<n;i++)
            {
            arr[i]=10*n+obj.nextInt(2*n);   //x.format(format,args);
            }
        int tmp;
        for(int i=0;i<n;i++)
            for(int j=0;j<n-1;j++)
                {
                if(arr[j]>arr[j+1])
                    {
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    }
                }
        for(int i=0;i<n;i++)
            x.format("%d\n",arr[i]);
        }

    public void closeFile()
        {
        x.close();
        }
    }
public class AlreadySortedCode
    {
    public static void main(String[] args)
        {
        CreateFile g=new CreateFile();
        g.openFile();
        g.addRecords();
        g.closeFile();
        }
    }
