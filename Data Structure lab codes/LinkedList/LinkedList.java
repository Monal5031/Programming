    import java.util.Scanner

    class Node
    {
        protected int data
        protected Node next

        public Node()
        {
            next = null
            data = 0
            }
        public Node(int d, Node n)
        {
            data = d
            next = n
            }
        public void setLink(Node n)
        {
            next = n
            }
        public void setData(int d)
        {
            data = d
            }
        public Node getLink()
        {
            return next
            }
        public int getData()
        {
            return data
            }
    }

    class linkedList
    {
        protected Node start
        protected Node end
        protected int size

        public linkedList()
        {
            start = null
            end = null
            size = 0
            }
        public boolean isEmpty()
        {
           return start == null
            }

        public int getSize()
        {
            return size
            }

        public void addToStart(int val)
        {
            Node nptr = new Node(val, null)
            size++
            if(start == null)
            {
                start = nptr
                end = start
                }
            else
            {
                nptr.setLink(start)
                start = nptr
                }
        }

        public void addToEnd(int val)
        {
           Node nptr = new Node(val, null)
            size++
            if(start == null)
            {
                start = nptr
                end = start
               }
            else
            {
                end.setLink(nptr)
                end = nptr
               }
        }

        public void add(int val, int pos)
        {
            Node nptr = new Node(val, null)
            Node ptr = start
            pos = pos - 1
            for (int i=0
                 i < size
                 i++)
            {
                if (i == pos)
                {
                    Node tmp = ptr.getLink()
                    ptr.setLink(nptr)
                    nptr.setLink(tmp)
                    break
                    }
                ptr = ptr.getLink()
                }
            size++
            }

        public void delete(int pos)
        {
            if (pos == 1)
            {
                start = start.getLink()
                size--
                return
                }
            if (pos == size)
            {
                Node s = start
                Node t = start
                while (s != end)
                {
                    t = s
                    s = s.getLink()
                    }
                end = t
                end.setLink(null)
                size - -

                return
                }

            Node ptr = start

            pos = pos - 1

            for (int i=0
                 i < size-1
                 i++)

            {

                if (i == pos)

                {

                    Node tmp = ptr.getLink()

                    tmp = tmp.getLink()

                    ptr.setLink(tmp)

                    break
                    }

                ptr = ptr.getLink()
                }

            size--
            }

        / *  Function to display elements * /

        public void display()

        {

            System.out.print("\nLinked List = ")

            if (size == 0)

            {

                System.out.print("empty\n")

                return
                }

            if (start.getLink() == null)

            {

                System.out.println(start.getData())

                return
                }

            Node ptr = start

            System.out.print(start.getData() + "->")

            ptr = start.getLink()

            while (ptr.getLink() != null)

            {

                System.out.print(ptr.getData() + "->")

                ptr = ptr.getLink()
                }

            System.out.print(ptr.getData() + "\n")
            }

    }

    public class LinkedList

    {

        public static void main(String[] args)

        {

            Scanner scan = new Scanner(System.in);

            / * Creating object of class linkedList * /

            linkedList list = new linkedList();

            System.out.println("Linked List Test\n");

            char ch;

            / *  Perform list operations * /

            do

            {

                System.out.println("\nLinked List Operations");

                System.out.println("1. add at begining");

                System.out.println("2. add at end");

                System.out.println("3. add at any position");

                System.out.println("4. delete at any position");

                System.out.println("5. check empty");

                System.out.println("6. get size");

                int choice = scan.nextInt();

                switch(choice)

                {

                    case 1:

                    System.out.println("Enter integer element to insert");

                    list.addToStart(scan.nextInt());

                    break;

                    case 2:

                    System.out.println("Enter integer element to insert");

                    list.addToEnd(scan.nextInt());

                    break;

                    case 3:

                    System.out.println("Enter integer element to insert");

                    int num = scan.nextInt();

                    System.out.println("Enter position");

                    int pos = scan.nextInt();

                    if (pos < 0 | | pos > list.getSize())

                    System.out.println("Invalid position\n");

                    else

                    list.add(num, pos);

                    break;

                    case 4:

                    System.out.println("Enter position");

                    int p = scan.nextInt();

                    if (p < 0 | | p > list.getSize())

                    System.out.println("Invalid position\n");

                    else

                    list.delete(p);

                    break;

                    case 5:

                    System.out.println("Empty status = " + list.isEmpty());

                    break;

                    case 6:

                    System.out.println("Size = " + list.getSize() + " \n");

                    break;

                    default:

                    System.out.println("Wrong Entry \n ");

                    break; }

                / *  Display List * /

                list.display();

                System.out.println(
                    "\nDo you want to continue (Type y or n) \n");

                ch = scan.next().charAt(0); } while (ch == 'Y'|| ch == 'y');         }

    }
