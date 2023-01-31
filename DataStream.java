import java.io.*;
class student
{
    int rollno;
    String name;
    String dept;
}
public class DataStream {
    public static void main(String[] args)throws Exception
    {
        FileInputStream fis = new FileInputStream("C:\\Users\\theprathyaksh\\MyJava\\student2.txt");
        DataInputStream dis = new DataInputStream(fis);
        student s = new student();
        
        s.rollno = dis.readInt();
        s.name = dis.readUTF();
        s.dept = dis.readUTF();
        
        System.out.println("Roll No:"+s.rollno);
        System.out.println("Name:"+s.name);
        System.out.println("Department:"+s.dept);
        
        fis.close();
        dis.close();
        
      
        
        
    }
    
}
