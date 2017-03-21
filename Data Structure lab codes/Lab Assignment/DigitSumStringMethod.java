import java.io.BufferedReader;
import java.io.InputStreamReader;
class DigitSumStringMethod
	{
	public static void main(String []lol)throws Exception
		{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter a number to sum its digits");
		String number=inp.readLine();
		int sum=0;
		for(int i=0;i<number.length();i++)
			{
			sum+=number.charAt(i)-48;
			}
		System.out.println("Sum is :"+sum);
		}
	}
