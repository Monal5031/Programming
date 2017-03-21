import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class StringPallindrome
	{
	public static void main(String []lol)throws Exception
		{
		BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String to check if pallindrome");
		String str=inp.readLine();
		String reverse=new StringBuilder(str).reverse().toString();
		if(str==reverse)
			System.out.println("Pallindrome");
		else
			System.out.println("Not Pallindrome");
		}
	}
