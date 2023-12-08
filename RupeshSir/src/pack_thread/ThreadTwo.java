package pack_thread;

public class ThreadTwo extends Thread
{
    @Override
    public void run()
    {
        try
        {
            System.out.println("ThreadTwo starts ");

            for (int i = 1; i <=10 ; i++)
            {
                System.out.println("ThreadTwo i  = " + i );

                Thread.sleep(1000);
            }

            System.out.println("ThreadTwo Ends ");
        }
        catch (Exception e)
        {
            System.out.println("ThreadTwo : run() : error " + e.getMessage());
        }

    }
}
