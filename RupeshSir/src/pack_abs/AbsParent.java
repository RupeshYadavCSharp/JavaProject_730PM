package pack_abs;

public abstract class AbsParent
{
    private int num;
    public AbsParent()
    {
        num  = 10;
    }
    public void show4()
    {
        System.out.println("show4 called ");
    }

    public abstract void show1();
    public abstract void show2();
}
