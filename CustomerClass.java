import java.io.*;
class customer implements Serializable
{
    String custId;
    String name;
    String phoneno;
    static int count =0;
    
    public customer()
    {
        
    }
    public customer(String n,String phno)
    {
        custId = "C"+count;
        count++;
        name = n;
        phoneno = phno;
    }
    
    public String toString()
    {
        return "Customer Details:\n "
                + "\n customer Id: "+custId
                +"\n Customer Name: "+name
                +"\n Customer Phone Number: "+phoneno;
    }
}
public class CustomerClass {
//    public static void main(String[] args)throws Exception
//    {
//        FileOutputStream fos=new FileOutputStream("C:\\Users\\theprathyaksh\\MyJava\\customer.txt");
//        ObjectOutputStream oos=new ObjectOutputStream(fos);
//        
//        customer list[] = {new customer("dj tillu","5670876567"),new customer("Pushpa Raj","8341"),new customer("Bheemla Nayak","100"),new customer("Agent Vikram","987898"),new customer("Agent dilli","34564345654"),new customer("sardar","1010101010")};
//        
//        
//        oos.write(list.length);
//        for(customer x:list)
//            oos.writeObject(x);
//        
//        oos.close();
//        fos.close();
//    }
    
      public static void main(String[] args)throws Exception
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        FileInputStream fis=new FileInputStream("C:\\Users\\theprathyaksh\\MyJava\\customer.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        int length = ois.readInt();
        
        customer list[] = new customer[length];
        for(int i=0;i<length;i++)
        {
            list[i] = (customer)ois.readObject();
            
        }
        System.out.println("Enter Customer Name: ");
        String name = sc.next();
        
        for(int i=0;i<length;i++)
        {
            if(name.equalsIgnoreCase(list[i].name))
                System.out.println(list[i]);
        }
       
        
        
        
        ois.close();
        fis.close();
    }
    
}
