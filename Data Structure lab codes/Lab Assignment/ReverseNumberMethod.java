import java.io.BufferedReader;
import java.io.InputStreamReader;
class ReverseNumberMethod
	{
	public static void main(String []lol)throws Exception
		{
		BufferedReader inp=new BufferedReader(InputStreamReader(System.in));
		System.out.println("Enter a number to reverse it");
		String number=inp.readLine();
		String reverse=new StringBuilder(number).reverse().toString()
		System.out.println("Reverse is: "+reverse);
		}
	}
