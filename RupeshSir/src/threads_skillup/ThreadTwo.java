package threads_skillup;

import java.util.Scanner;

public class ThreadTwo implements Runnable
{
    ThreadOne one = null;

    public ThreadTwo(ThreadOne one)
    {
        this.one = one;
    }


    @Override
    public void run() {
        try
        {
            char ch;
            Scanner scanner = new Scanner(System.in);

            while(true)
            {
                ch = scanner.next().charAt(0);

                if(ch == 'e')
                {
                    one.setFlag(false);
                    break;
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
