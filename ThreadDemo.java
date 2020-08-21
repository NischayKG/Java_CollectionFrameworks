import java.util.*;
class MyRunnable implements Runnable
{
    public void run()
        {
            for(int i=0;i<10;i++)
                System.out.print("a ");
        }
}
class ThreadDemo
{
    public static void main(String srr[])
    {
        MyRunnable r=new MyRunnable();
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<10;i++)
                System.out.print("b ");

    }
}