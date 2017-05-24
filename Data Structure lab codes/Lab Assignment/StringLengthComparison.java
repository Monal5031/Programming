import java.io.BufferedReader
import java.io.InputStreamReader


class StringLengthComparsion
    {
        public static void main(String[]lol)throws Exception
        {
            BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a String");
            String str = inp.readLine();
            switch(str.length())
            {
                case 1: case 2: case 3: case 4: case 5:
                case 6: case 7: case 8: case 9: case 10:
                System.out.println("Small String");
                break;
                case 11: case 12: case 13: case 14: case 15:
                case 16: case 17: case 18: case 19: case 20:
                case 21: case 22: case 23: case 24: case 25:
                System.out.println("Medium String");
                break;
                default:
                System.out.println("Large String"); }
        }
    }
