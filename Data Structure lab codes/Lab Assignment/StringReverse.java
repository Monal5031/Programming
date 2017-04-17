import java.io.BufferedReader;
import java.io.InputStreamReader;
class StringReverse
    {
    public static void main(String []lol)throws Exception
        {
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter a String to reverse it");
        String original=inp.readLine();
        String reverse=new StringBuilder(original).reverse().toString();
        System.out.println("Reverse is: "+reverse);
        }
    }
