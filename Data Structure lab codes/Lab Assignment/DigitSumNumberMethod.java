import java.io.BufferedReader;
import java.io.InputStreamReader;
class DigitSumNumberMethod
	{
	public static void main(String []lol)throws Exception
		{
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter a number to add its digits");
		int number=Integer.parseInt(inp.readLine());
		int sum=0;
		while(number!=0)
			{
			sum+=number%10;
			number/=10;
			}
		System.out.println("Sum is: "+sum);
		}
	}
