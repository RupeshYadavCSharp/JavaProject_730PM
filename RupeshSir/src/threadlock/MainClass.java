package threadlock;

public class MainClass
{
    public static void main(String[] args) {
        try
        {
            Display display = new Display();
            Thread t1 = new Thread(display);
            Thread t2 = new Thread(display);
            Thread t3 = new Thread(display);

            t1.setName("tipu");
            t2.setName("jethalal");
            t3.setName("bapuji");

            t1.setPriority(Thread.MIN_PRIORITY);
            t3.setPriority(Thread.MAX_PRIORITY);



            t1.start();
            t2.start();
            t3.start();





        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
