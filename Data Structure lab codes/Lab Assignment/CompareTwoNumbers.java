import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.Math.*;
class CompareTwoNumbers
	{
	public static void main(String []lol)throws Exception
		{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter two numbers to compare");
		String []s=inp.readLine().split(" ");
		int x=Integer.parseInt(s[0]);
		int y=Integer.parseInt(s[1]);
		System.out.println(Math.max(x,y)+" is greater than "+Math.min(x,y));
		}
	}
