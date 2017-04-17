import java.io.BufferedReader;
import java.io.InputStreamReader;
class ArithmeticOperations
    {
    public static void main(String []lol)throws Exception
        {
        System.out.println("Enter two numbers separated by space");
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        String []in=inp.readLine().split(" ");
        int x=Integer.parseInt(in[0]);
        int y=Integer.parseInt(in[1]);
        System.out.println("Addition is: "+(x+y));
        System.out.println("Subtraction is: "+(x-y));
        System.out.println("Multiplication is :"+(x*y));
        System.out.println("Division is: "+((float)x/y));
        }
    }
