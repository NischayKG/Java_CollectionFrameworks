import java.util.*;
class Anonymous_class2
{
    public static void main(String srr[])
    {
        Thread t=new Thread(){
            public void run()
            {
                for(int i=0;i<10;i++)
                    System.out.print("a ");
            }
        };
        
        t.start();
        System.out.print("\n");
        for(int i=0;i<10;i++)
            System.out.print("b ");

    }
}