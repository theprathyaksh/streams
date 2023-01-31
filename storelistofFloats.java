import java.io.*;
public class storelistofFloats {
    public static void main(String[] args)throws Exception
    {
        
//        FileOutputStream fos = new FileOutputStream("C:\\Users\\theprathyaksh\\MyJava\\listofFloats.txt");
//        DataOutputStream dos = new DataOutputStream(fos);
//        float list[] = {2.4f,33.5f,22.5f,12.4f};
//        
//        dos.writeInt(list.length);
//        for(float x:list)
//            dos.writeFloat(x);
        
        FileInputStream fis = new FileInputStream("C:\\Users\\theprathyaksh\\MyJava\\listofFloats.txt");
        DataInputStream dis = new DataInputStream(fis);
        int length = dis.readInt();
        float data;
        for(int i=0;i<length;i++)
        {
            data = dis.readFloat();
            System.out.println(data);
        }
        dis.close();
        fis.close();
    }
    
}
