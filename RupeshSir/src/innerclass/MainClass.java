package innerclass;

public class MainClass
{
    public static void main(String[] args) {


        Car car = () ->
        {
            System.out.println("Black ");
        };


        car.color();



    }
}
