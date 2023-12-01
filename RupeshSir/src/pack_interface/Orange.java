package pack_interface;

public class Orange implements Fruits
{

    @Override
    public void color() {
        System.out.println("Orange ");
    }

    @Override
    public void taste() {
        System.out.println("sour ");
    }
}
