package threadlock;

public class Display implements Runnable
{

    @Override
    public synchronized void run()
    {
        try {

            System.out.println(Thread.currentThread().getName() + " entered ");


            System.out.println("Java is ");
            Thread.sleep(1000);
            System.out.println("interesting");


            System.out.println(Thread.currentThread().getName() + " exit ");

        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }
}
