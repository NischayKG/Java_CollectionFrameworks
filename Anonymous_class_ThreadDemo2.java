import java.util.*;
class Anonymous_class_ThreadDemo2
{
    public static void main(String srr[])
    {
        
        new Thread(new Runnable(){
            public void run()
            {
                for(int i=0;i<10;i++)
                    System.out.println("a ");
            }
        }).start();
    
       // System.out.print("\n");
        for(int i=0;i<10;i++)
            System.out.println("b ");

    }
}