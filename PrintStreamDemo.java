import java.io.*;
class student
{
    int rollno;
    String name;
    String dept;
}
public class PrintStreamDemo {
    public static void main(String[] args)throws Exception
    {
        FileInputStream fis = new FileInputStream("C:\\Users\\theprathyaksh\\MyJava\\student1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        student s = new student();
        
        s.rollno = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();
        
        System.out.println("Roll No:"+s.rollno+" "+"Name:"+s.name+" "+"department:"+s.dept);
        
        
    }
    
}
