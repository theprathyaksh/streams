import java.io.*;
public class BufferedDemo {
    public static void main(String[] args)throws Exception
    {
        FileReader fis = new FileReader("C:/Users/theprathyaksh/MyJava/Test.txt");
        BufferedReader bis = new BufferedReader(fis);
        
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.mark(10);
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        bis.reset();
        System.out.println((char)bis.read());
        System.out.println((char)bis.read());
        
        System.out.println(bis.readLine());
       
    }
    
}
