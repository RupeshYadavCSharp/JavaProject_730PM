package runnable;

public class ThreadOne implements Runnable
{
    @Override
    public void run()
    {
        try
        {
            System.out.println("ThreadOne starts ");

            for (int i = 1; i <=10 ; i++)
            {
                System.out.println("ThreadOne i  = " + i );

                Thread.sleep(1000);
            }

            System.out.println("ThreadOne Ends ");
        }
        catch (Exception e)
        {
            System.out.println("ThreadOne : run() : error " + e.getMessage());
        }

    }
}
