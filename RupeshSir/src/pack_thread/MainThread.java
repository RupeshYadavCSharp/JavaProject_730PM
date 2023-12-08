package pack_thread;

public class MainThread
{
    public static void main(String[] args) {

        try
        {
            System.out.println("Main Thread Starts ");
            ThreadOne one = new ThreadOne();
            ThreadTwo two = new ThreadTwo();

            one.start();
            two.start();

            one.join();
            two.join();

            System.out.println("MainThread Ends");


        }
        catch (Exception e){

            System.out.println("Main class : main() error "  + e.getMessage());
        }


    }
}
