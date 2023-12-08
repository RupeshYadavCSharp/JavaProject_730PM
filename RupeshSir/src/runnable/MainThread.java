package runnable;


public class MainThread
{
    public static void main(String[] args) {

        try
        {
            System.out.println("Main Thread Starts ");
            ThreadOne one = new ThreadOne();
            ThreadTwo two = new ThreadTwo();

            Thread t1 = new Thread(one);
            Thread t2 = new Thread(two);

            t1.start();
            t2.start();

            t1.join();

            t2.join();

            System.out.println("Main ends");


        }
        catch (Exception e){

            System.out.println("Main class : main() error "  + e.getMessage());
        }


    }
}
