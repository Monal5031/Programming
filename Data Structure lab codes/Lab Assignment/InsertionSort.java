import java.util.Scanner;
class InsertionSort
{
 public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
            printNumbers(array);
        }
    }
public static void main(String [] args)
	{
	Scanenr scan=new Scanner(System.in);
	System.out.println("Enter number of inputs");
	int n=scan.nextInt();
	int []arr=new int[n];
	System.out.println("Enter numbers");
	for(int i=0;i<n;i++)
		arr[i]=scan.nextInt();
	insertionSort(arr);
	for(int i=0;i<n;i++)
		System.out.print(arr[i]+" ");
	}
}
