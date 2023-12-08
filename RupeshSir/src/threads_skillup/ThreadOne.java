package threads_skillup;

public class ThreadOne implements Runnable
{
    private boolean flag;

    public ThreadOne( )
    {
        flag = true;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        try
        {
                while (flag)
                {
                    System.out.println("hello ");
                    Thread.sleep(1000);
                }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
