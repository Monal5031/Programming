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
			x=new Formatter("/home/student/Desktop/MONAL/Data Structure/Input Files/InputFile7.txt");
			}
		catch(Exception e)
			{
			System.out.println("GOt an error");
			}
		}	
		
	public void addRecords()
		{
		Random obj=new Random();
		int tmp;
		for(int i=0;i<500;i++)
			{
			tmp=1+obj.nextInt(1000000)+obj.nextInt(1000000)-obj.nextInt(1000000);
			if(tmp<0)
				{
				i--;
				continue;
				}			
			x.format("%d\n",tmp);	//x.format(format,args);	
			}
		}
	
	public void closeFile()
		{
		x.close();
		}
	}
public class UnsortedNonRepeated
	{
	public static void main(String[] args)
		{
		CreateFile g=new CreateFile();
		g.openFile();
		g.addRecords();
		g.closeFile();
		}
	}	
