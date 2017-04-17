import java.util.Scanner;

public class TowerHanoi {

public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
System.out.println("Enter the number of disks in the tower of hanoi");
int n;
n=scan.nextInt();
hanoi(n,'A','B','C');
    }

public static void hanoi(int n,char frompeg,char topeg,char auxpeg){
    if(n==1){
        System.out.println("Move disk 1 from "+frompeg+" to "+topeg);
        return;
        }
    hanoi(n-1,frompeg,auxpeg,topeg);
    System.out.println("Move disk "+n+" from "+frompeg+" to "+topeg);
    hanoi(n-1,auxpeg,topeg,frompeg);
    }
}
