package innerclass;

public class Outer
{
    private int num;

     public void show()
     {
         class Inner
         {
             public void disp()
             {
                 num = 10;
                 System.out.println("num is " + num);
             }
         }

         Inner in = new Inner();
         in.disp();
     }


}
