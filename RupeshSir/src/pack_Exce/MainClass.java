package pack_Exce;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args)
    {
         Scanner scan =  null;
          try
          {
              int num;
              scan = new Scanner(System.in);
              System.out.println("Enter any number ");
              num = scan.nextInt();

              if(num % 2 == 1)
              {
                  //OddNumberException ex = new OddNumberException();
                  //throw ex;

                  throw  new OddNumberException();
              }
              else
              {
                  System.out.println("num is " + num);
              }

          }
          catch (OddNumberException ex)
          {
              System.out.println(ex.getMessage());
          }
          catch (InputMismatchException ex)
          {
              System.out.println("please enter only int");
          }
          catch (Exception e)
          {
              System.out.println("unknown error");
          }
          finally
          {
               scan.close();
          }
    }
}
