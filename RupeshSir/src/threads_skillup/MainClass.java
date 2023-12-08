package threads_skillup;

public class MainClass
{
    public static void main(String[] args) {
        try
        {
            ThreadOne one = new ThreadOne();
            ThreadTwo two = new ThreadTwo(one);
            Thread t1 = new Thread(one);
            Thread t2 = new Thread(two);
            t1.start();
            t2.start();


        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
