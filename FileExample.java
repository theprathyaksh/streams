import java.io.*;
public class FileExample {
    public static void main(String[] args)
    {
        try{
            FileInputStream fis = new FileInputStream("C:/Users/theprathyaksh/MyJava/Test.txt");
            
            int x;
            do
            {
                x = fis.read();
                if(x!=-1)
                    System.out.print((char)x);
            }while(x!=-1);
            byte b[] = new byte[fis.available()];
            fis.read(b);
            
            String str = new String(b);
            System.out.println(str);
          
          }
        catch(FileNotFoundException e){
            System.out.println(e);     
    }
        catch(IOException e)
        {
            System.out.println(e);
        }}
    
}
