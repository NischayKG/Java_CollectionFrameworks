import java.util.*;
class Anonymous_class_ThreadDemo
{
    public static void main(String srr[])
    {
        Runnable r=new Runnable(){
            public void run()
            {
                for(int i=0;i<10;i++)
                    System.out.print("a ");
            }
        };
        Thread t=new Thread(r);
        t.start();
       // System.out.print("\n");
        for(int i=0;i<10;i++)
            System.out.print("b ");

    }
}