import java.util.*
import java.io.*


class InsertionSort


{
 public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j=1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ((i > -1) & & (array[i] > key)) {
                array[i+1] = array[i];
                i--;}
            array[i+1] = key;}
    }
    public static void main(String[] args)throws Exception
    {
    int n = 2000;
    int[]arr = new int[n];
    long start = System.currentTimeMillis() % 1000;
    Read(arr);
    insertionSort(arr);
    long end = System.currentTimeMillis() % 1000;
        long total = end-start;
        System.out.println("Execution time: "+total+"milli seconds");}
    public static void Read(int arr[])throws Exception
    {
        int i = 0;
        Scanner in = new Scanner(new FileReader("/home/student/Desktop/MONAL/Data Structure/Input Files/InputFile10.txt"));
        while (in.hasNext())
     {arr[i] = in.nextInt(); }
        in.close();}

}
