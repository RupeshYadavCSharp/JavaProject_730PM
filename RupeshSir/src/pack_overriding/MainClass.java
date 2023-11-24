package pack_overriding;

public class MainClass
{
    public static void main(String[] args) {
        Class2 class2 = new Class2();
        class2.show();

        Class1 class1 = class2;
        class1.show();

    }
}
