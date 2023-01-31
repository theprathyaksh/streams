import java.io.*;
public class CopyFile {
    public static void main(String[] args)throws Exception
    {
        
        FileInputStream fis1 = new FileInputStream("C:/Users/theprathyaksh/MyJava/source1.txt");
        FileInputStream fis2 = new FileInputStream("C:/Users/theprathyaksh/MyJava/source2.txt");
        FileOutputStream fos = new FileOutputStream("C:/Users/theprathyaksh/MyJava/Destination.txt"); 
        
        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
        int i;
        while((i=sis.read())!=-1)
        {
            fos.write(i);
        }
                
        sis.close();
        fis1.close();
        fis2.close();
    }
}
