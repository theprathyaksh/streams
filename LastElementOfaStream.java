import java.io.*;

public class LastElementOfaStream {
    
    public static void main(String[] args)throws Exception
    {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\theprathyaksh\\MyJava\\lastelement.txt");
        String str = "This is Java Programming";
        byte b[] = str.getBytes();
        fos.write(b);
        
        lastelement<String>lastelement = b.stream();
        lastelement.reduce((first, second) -> second)
        .orElse(null);
        
    }
    
}
