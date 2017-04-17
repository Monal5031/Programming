import java.util.*;
import java.io.*;
public class Searching
{
public static int LinearSearch(int arr[],int item)
    {
    int i=0;
    while(i<arr.length)
        {
        if(arr[i]==item)
            return item;
        i++;
        }
    return -1;
    }

public static int BinarySearch(int arr[],int item)throws Exception
    {
    int beg=0; int end=arr.length;
    int mid=(beg+end)/2;
    while(beg<=end&&mid<arr.length)
        {
        if(arr[mid]==item)
            return item;
        else if(arr[mid]>item)
            end=mid-1;
        else
            beg=mid+1;
        mid=(beg+end)/2;
        }
    return -1;
}


public static void main(String []lol)throws Exception
    {
    Random obj=new Random();
    int n=100;
    int []arr=new int[n];
    int []search=new int[n/2];

    int s=0;
    Scanner in = new Scanner(new FileReader("/home/student/Desktop/Monal/Search/InputFile1.txt"));
        while (in.hasNext())
            { arr[s]=in.nextInt(); }
        in.close();

    for(int i=0;i<n/2;i++)              //Setting elements to be searched
        search[i]=10*n+obj.nextInt(2*n);

    for(int i=0;i<n/2;i++)
        System.out.println(search[i]);

    long avg1=0;
    for(int i=0;i<n/2;i++)
        {
        long start=System.nanoTime() ;
        LinearSearch(arr,search[i]);
        long end=System.nanoTime();
        avg1+=end-start;
        }

    long avg2=0;
    for(int i=0;i<n/2;i++)
        {
        long start=System.nanoTime() ;
        BinarySearch(arr,search[i]);
        long end=System.nanoTime() ;
        avg2+=end-start;
        }

    System.out.println("LinearTime:"+((avg1/(double)n)*2.0));

    System.out.println("BinaryTime:"+((avg2/(double)n)*2.0));
    }
}
