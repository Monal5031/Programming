import java.io.*
import java.lang.*
import java.util.*


class CreateFile
    {
        private Formatter x

        public void openFile()
        {
            try
            {
                x = new Formatter("/home/user/Desktop/College Data/Academics/Data Structure/InputFile3.txt")
            }
            catch(Exception e)
            {
                System.out.println("GOt an error")
                }
        }

        public void addRecords()
        {
            Random obj = new Random()
            int tmp = 1+obj.nextInt(10000)
            for(int i=0
                i < 1000
                i++)
            {
                x.format("%d\n", tmp)
                // x.format(format, args)
                tmp++
                }
        }

        public void closeFile()
        {
            x.close()
            }
    }


public class AlreadySortedCode
    {
        public static void main(String[] args)
        {
            CreateFile g = new CreateFile()
            g.openFile()
            g.addRecords()
            g.closeFile()
            }
    }
