import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
class BubbleSort
    {
    public static void main(String []lol)throws Exception
        {
        BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the total numbers in array");
        int n=scan.nextInt();
        int []arr=new int[n];
        System.out.println("Enter array");
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        System.out.println("UnSorted Array is: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println("");
        int tmp;
        long start=System.nanoTime();
        for(int i=0;i<n;i++)
            for(int j=0;j<n-1;j++)
                {
                if(arr[j]>arr[j+1])
                    {
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    }
                }
        long end=System.nanoTime();
        long total=end-start;
        System.out.println("Sorted Array is: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println("");
        System.out.println("Execution time: "+total+"nano seconds");
        }
    }
