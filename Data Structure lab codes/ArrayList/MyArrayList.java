simport java.util.*;
import java.io.*;

class CustomArrayList{
private int size;
private int arr[];

public CustomArrayList()
    {
    this.size=0;
    arr=new int[10];
    }

public CustomArrayList(int size)
    {
    this.size=size;
    arr=new int[this.size];
    }

public boolean isEmpty()
    {
    if(this.size==0)
        return true;
    else
        return false;
    }
public int length()
    {
    return this.size;
    }

public void addToFront(int element)
    {
    if(size<=arr.length)
        arr = Arrays.copyOf(arr,2*size);
    for(int i=size-1;i>=0;i--)
        arr[i+1]=arr[i];
    arr[0]=element;
    this.size++;
    }

public void addToRear(int element)
    {
    if(size<=arr.length)
        arr = Arrays.copyOf(arr,2*size);
    arr[size]=element;
    this.size++;
    }

public void add(int index,int element)
    {
    if(size<=arr.length)
        arr = Arrays.copyOf(arr,2*size);
    else if(index<0||index>=size)
        {
        throw new ArrayIndexOutOfBoundsException("this is my exception for the condition");
        }

    for(int i=size-1;i>=index;i--)
        arr[i+1]=arr[i];
    arr[index]=element;
    this.size++;
    }

public int deleteFromFront()
    {
    int copy=arr[0];
    for(int i=0;i<size-1;i++)
        arr[i]=arr[i+1];
    this.size--;
    return copy;
    }

public int deleteFromRear()
    {

    int copy=arr[size-1];
    this.size--;
    return copy;
    }

public int delete(int index)
    {
    if(index<0||index>=size)
        {
        throw new ArrayIndexOutOfBoundsException("this is my exception for the condition");
        }
    int copy=arr[index];
    for(int i=index;i<size-1;i++)
        arr[i]=arr[i+1];
    this.size--;
    return copy;
    }

public void display()
    {
    for(int i=0;i<size;i++)
        {
        System.out.print(arr[i]+" ");
        }
    }

public int get(int index)
    {
    return arr[index];
    }

public String toString()
    {
    StringBuffer s = new StringBuffer();
    s.append("[");
    for(int i=0;i<size;i++)
        s.append(arr[i]+",");
    s.delete(s.length()-1,s.length());
    s.append("]");
    return new String(s);
    }

}


public class MyArrayList{

public static void main(String []args)throws Exception
    {
    Scanner scan=new Scanner(System.in);
    CustomArrayList arr=new CustomArrayList();
    System.out.println("List of operations:\n1.Get a number from given index\n"
                + "2.add given Element to front\n"
                + "3.add given element to end\n"
                + "4.add given element to given index\n"
                + "5.get size of array\n"
                + "6.check if array is empty\n"
                + "7.Delete 1st element of array\n"
                + "8.Delete Last element of array\n"
                + "9.Delete Element of given index\n"
                + "10.Convert Array to string\n"
                + "11.exit");
    CustomArrayList obj=new CustomArrayList();
    boolean passer=true;
    while(passer)
        {
        int option=scan.nextInt();
        switch(option)
            {
        case 1:System.out.println("Enter the index");
            System.out.println(obj.get(scan.nextInt()));
                break;
            case 2:
                System.out.println("Enter the number to add in the front");
                obj.addToFront(scan.nextInt());
                break;
            case 3:
                System.out.println("Enter the number to add in the rear");
                obj.addToRear(scan.nextInt());
                break;
            case 4:
                System.out.println("Enter the index and then the element to be added");
                obj.add(scan.nextInt(),scan.nextInt());
                break;
            case 5:
                System.out.println("Size of ArrayList:"+obj.length());
                break;
            case 6:
                                System.out.println("ArrayList empty Status:"+obj.isEmpty());
                break;
            case 7:
                System.out.println("Element Deleted:"+obj.deleteFromFront());
                break;
            case 8:
                                System.out.println("Element Deleted:"+obj.deleteFromRear());
                break;
            case 9:
                                System.out.println("Enter the index of element to be deleted");
                                System.out.println("Element deleted:"+obj.delete(scan.nextInt()));
                break;
            case 10:
                break;
                        case 11:
                            System.out.println("The String form of ArrayList is:"+obj.toString());
                            passer=false;
                            break;
            }

        }
    }

}
