import java.io.*;
import java.util.Scanner;
public class BubbleSort
	{
	public static void main(String []lol)throws Exception
		{
		int tmp;
		int n=100;
		int[] arr=new int[n];
		long start=System.currentTimeMillis() % 1000;
		Read(arr);
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
		long end=System.currentTimeMillis() % 1000;
		long total=end-start;
		System.out.println("Execution time: "+total+"milli seconds");
		}
	
	public static void Read(int arr[])throws Exception
		{
		int i=0;
		Scanner in = new Scanner(new FileReader("/home/student/Desktop/MONAL/Data Structure/Input Files/InputFile8.txt"));
		while (in.hasNext()) 
			{ arr[i]=in.nextInt(); }
		in.close();
		}

	}

