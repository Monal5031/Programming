import java.io.BufferedReader;
import java.io.InputStreamReader;
class MatrixTranspose
    {
    public static void main(String []lol)throws Exception
        {
        BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of rows and columns");
        String []str=inp.readLine().split(" ");
        int rows=Integer.parseInt(str[0]);
        int cols=Integer.parseInt(str[1]);
        int [][]matrix=new int[rows][cols];
        for(int i=0;i<rows;i++)
            {
            String []row=inp.readLine().split(" ");
            for(int j=0;j<cols;j++)
                matrix[i][j]=Integer.parseInt(row[j]);
            }
        System.out.println("Matrix is:");
        for(int i=0;i<rows;i++)
            {
            for(int j=0;j<cols;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println("");
            }
        int tmp;
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                {
                tmp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tmp;
                }
        System.out.println("Transpose is:");
        for(int i=0;i<rows;i++)
            {
            for(int j=0;j<cols;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println("");
            }
        }
    }
