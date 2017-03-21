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
			x=new Formatter("/home/student/Desktop/MONAL/Data Structure/Input Files/InputFile11.txt");
			}
		catch(Exception e)
			{
			System.out.println("GOt an error");
			}
		}	
		
	public void addRecords()
		{
		Random obj=new Random();
		int[] tmp=new int[14];
		for(int i=0;i<14;i++)
			tmp[i]=1+obj.nextInt(1000000);
		for(int i=0;i<2000;i++)
			{
			x.format("%d\n",tmp[obj.nextInt(14)]);	//x.format(format,args);	
			}
		}
	
	public void closeFile()
		{
		x.close();
		}
	}
public class UnsortRepeated
	{
	public static void main(String[] args)
		{
		CreateFile g=new CreateFile();
		g.openFile();
		g.addRecords();
		g.closeFile();
		}
	}	
