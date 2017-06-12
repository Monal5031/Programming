// Divide and Conquer rules!!!
// Always works man! Always Works!!
// Divide and Conquer is lubh  :smiling_imp:  :cupid: 
 
import java.util.Scanner;
import java.util.Vector;
import java.math.BigInteger;
import java.util.Collections;
 
class ChefAndSubsequence {
 
    static Vector<Long> calculateOnlyOneHalf(Vector<Long> arr, int start, int end) {
        Vector<Long> product = new Vector<Long>();
        int tmp = end - start;
        for (int i = 1; i < (1<<tmp) ; ++i) {
            long multipy = 1;
            boolean passer = true;
            for (int j = 0; j < end; ++j) {
                if ( ( i & (1<<j) ) != 0) {
                    if (Math.log10(multipy) + Math.log10(arr.get(j + start)) <= 18.0)
                        multipy *= (arr.get(j + start));
                    else {
                        passer = false;
                        break;
                    }
                }
            }
            if (passer)
            product.add(multipy);
        }
        return product;
    }
 
    static int modifiedBinarySearch(Vector<Long> arr, long k, long item) {
        int start = 0;
        int end = arr.size() - 1;
        int index = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            long y = arr.get(mid);
            if (Math.log10(y) + Math.log10(item) <= 18.0) {
                if (y * item <= k){
                    start = mid + 1;
                    index = mid;
                }
                else
                    end = mid - 1;
            }
            else
                end = mid - 1;
        }
        return index;
    }
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        long k;
        n = scan.nextInt();
        k = scan.nextLong();
        int tmp = 0;
        Vector<Long> arr = new Vector<Long>();
        for(int i = 0;i < n; ++i){
            long item; 
            item = scan.nextLong();
            if( item <= k ) {
                arr.add(item);
                tmp++;
            }
        }
        n = tmp;
        // Divide
        Vector<Long> left = calculateOnlyOneHalf(arr, 0, n / 2);
        Vector<Long> right = calculateOnlyOneHalf(arr, n / 2, n);
        // Conquer
        Collections.sort(right);
        long uttar = 0;
        uttar = modifiedBinarySearch(right, k, 1) + 1;
        for (int i = 0; i < left.size(); ++i) {
        long item = left.get(i);
            if(item <= k ){
                tmp = modifiedBinarySearch(right, k, item);
                if( tmp != -1)
                    uttar +=  (tmp + 1);
                uttar++;
            }
        }
        System.out.print(uttar);
    }
}
