import java.io.*;
public class ByteArray_CharArray {
    public static void main(String[]args)throws Exception
    {
//        byte b[] = {'a','b','c','d','e','f','g','h','i','j'};
//        ByteArrayInputStream bis = new ByteArrayInputStream(b);
//        
//        String str = new String(bis.readAllBytes());
//        System.out.println(str);
////        int x;
////        while((x=bis.read())!=-1)
////        {
////            System.out.println((char)x);
////        }
 
        
        
//        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
//        bos.write('a');
//        bos.write('b');
//        bos.write('c');
//        bos.write('d');
//        bos.write('e');
//        
//        bos.writeTo(new FileOutputStream("C:/Users/theprathyaksh/MyJava/Test.txt"));
//        bos.close();
        
        
        
        char c[] = {'a','b','c','d','e','f','g','h','i','j'};
        CharArrayReader cr = new CharArrayReader(c);
        
        int x;
        while((x=cr.read())!=-1)
        {
            System.out.println((char)x);
        }
        cr.close();
    }
    
}
