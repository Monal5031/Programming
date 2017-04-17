import java.io.BufferedReader;
import java.io.InputStreamReader;
class ReverseNumberStringMethod
    {
    public static void main(String []lol)throws Exception
        {
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter a number to reverse it");
        int n=Integer.parseInt(inp.readLine());
        int reverse=0;
        while (n != 0)
            {
            reverse = reverse * 10;
            reverse = reverse + n%10;
            n= n/10;
            }
        System.out.println("Reverse is: "+reverse);
        }
    }
