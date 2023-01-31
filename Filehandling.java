import java.io.*;
public class Filehandling {
    public static void main(String[] args)throws Exception
    {
        //File f = new File("C:/Users/theprathyaksh/MyJava");
        File f = new File("C:/Users/theprathyaksh/MyJava/program.txt");
//        System.out.println(f.isDirectory());
//        
//        File list[] = f.listFiles();
//        for(File x:list)
//            System.out.println(x.getParent()+" "+x.getName());
          
          //f.setWritable(true);
          //f.createNewFile();
          System.out.println("Length:"+f.length());
          //FileOutputStream fos = new FileOutputStream("C:/Users/theprathyaksh/MyJava");
          
    }
    
}
