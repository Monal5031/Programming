import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Scanner


class MatrixSum
    {
        public static void main(String[]lol)throws Exception
        {
            BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
            Scanner scan = new Scanner(System.in);
            System.out.println(
                "Enter the number of rows and colms of 1st matrix");
            int row1 = scan.nextInt(); int col1 = scan.nextInt();
            System.out.println("Enter 1st matrix");
            int[][]one = new int[row1][col1];
            for(int i=0; i < row1; i++)
            {
                String[]nums = inp.readLine().split(" ");
                for(int j=0; j < col1; j++)
                one[i][j] = Integer.parseInt(nums[j]);}
            System.out.println(
                "Enter the number of rows and colms of 2nd matrix");
            int row2 = scan.nextInt(); int col2 = scan.nextInt();
            boolean pass = true;
            if(row1 != row2 | |col1 != col2)
            {
                System.out.println("Matrix cannt be added");
                pass = false; }
            if(pass)
            {
                System.out.println("Enter 2nd matrix");
                int[][]two = new int[row1][col1];
                for(int i=0; i < row1; i++)
                {
                    String[]nums = inp.readLine().split(" ");
                    for(int j=0; j < col1; j++)
                    two[i][j] = Integer.parseInt(nums[j]);}
                int[][]ans = new int[row2][col2];
                for(int i=0; i < row1; i++)
                for(int j=0; j < col1; j++)
                ans[i][j] = one[i][j]+two[i][j];
                System.out.println("1st Matrix is:");
                for(int i=0; i < row1; i++)
                {
                    for(int j=0; j < col1; j++)
                    System.out.print(one[i][j]+" ");
                    System.out.println(""); }
                System.out.println("2nd Matrix is:");
                for(int i=0; i < row1; i++)
                {
                    for(int j=0; j < col1; j++)
                    System.out.print(two[i][j]+" ");
                    System.out.println(""); }
                System.out.println("Addition of Matrices is:");
                for(int i=0; i < row1; i++)
                {
                    for(int j=0; j < col1; j++)
                    System.out.print(ans[i][j]+" ");
                    System.out.println(""); }
            }
        }

    }
