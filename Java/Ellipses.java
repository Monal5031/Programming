import java.lang.*
import java.util.Scanner


class Ellipses


{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter How many numbers you want to input");
        int t = scan.nextInt();
        System.out.println("Enter Numbers");
        int[]nums = new int[t];
        for(int i=0; i < t; i++)
        nums[i] = scan.nextInt();
        System.out.println("Average is="+average(nums)+" of  the numbers");
        display(nums);}
    public static int average(int...nums)
    {
        int total = 0;
        for(int x: nums)
        total += x;
        return total/nums.length;}
    public static void display(int...nums)
    {
        for(int x: nums)
        System.out.print(x+" "); }
}
