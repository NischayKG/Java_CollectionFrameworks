import java.util.*;
import java.io.*;
class PropertiesDemo
{
    public static void main(String arr[]) throws Exception
    {
        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("abc.properties");
        p.load(fis);
        System.out.println(p);  // {PN=PV,...}
        String s=p.getProperty("venki");
        System.out.println(s);// 9999
        p.setProperty("nag","8888");
        FileOutputStream fos=new FileOutputStream("abc.properties");
        p.store(fos,"hell yeeee");

        
    }
}