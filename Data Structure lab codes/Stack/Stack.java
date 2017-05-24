/*
    * To change this license header, choose License Headers in Project Properties.
    * To change this template file, choose Tools | Templates
    * and open the template in the editor.
    */

/**
    *
    * @author user
    */
import java.util.*
import java.io.*


class StackList < T >


{
    protected int top = -1
    protected T[] arr
    protected int size
    public StackList()
    {
        this.size = 1
        this.top = 0
        arr = (T[])new Object[this.size]
        }
    public StackList(int size)
    {
        this.size = size
        arr = (T[])new Object[size]
        this.top = 0
        }

    public void push(T element)
    {
        if(this.size <= arr.length)
        arr = Arrays.copyOf(arr, 2*this.size)
        this.arr[top] = element
        this.top++
        this.size++
        }
    public T pop()
    {
        if(size < 0)
        throw new ArrayIndexOutOfBoundsException("Stack Empty")
        this.top--
        this.size--
        return arr[top]
        }

    public int getSize()
    {
        return this.size-1
        }

    public void printStack()
    {
        for(int i=top-1
            i >= 0
            i--)
        {
            String s = new String("|"+arr[i]+" ")
            System.out.println(s+"|")
            System.out.print("|")
            for(int j=0
                j < s.length()-2
                j++)
            System.out.print("--")
            System.out.println("|")
            }
    }
    public boolean isEmpty()
    {
        return (top == 0 | |top == -1)
        }
}

public class Stack
{
    public static void main(String[]args)throws Exception
    {
        StackList list = new StackList();
        Scanner scan = new Scanner(System.in);
        int passer = 1;
        while(passer == 1)
        {
            System.out.println(
                "1.check Empty status\n2.Push\n3.POP\n4.Print size of stack\n5.Print whole stack");
            System.out.println("Enter choice");
            switch(scan.nextInt())
            {
                case 1:
                System.out.println("Stack empty status="+list.isEmpty());
                break;
                case 2:
                System.out.println("Enter the element to be pushed");
                list.push(scan.nextInt());
                break;
                case 3:
                System.out.println("Element popped is:"+list.pop());
                break;
                case 4:
                System.out.println("Size of stack is:"+list.getSize());
                break;
                case 5:
                list.printStack();
                break; }
            System.out.println("Do you wish to continue? 1-->Yes 0--->No");
            passer = scan.nextInt(); }

    }
}
