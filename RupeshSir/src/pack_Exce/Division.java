package pack_Exce;

import java.util.InputMismatchException;
import java.util.Scanner;



/**
 * class to demo throws
 */

//region class
public class Division
{

    //region data

    //endregion

    //region method
    /**
     * This methods divide 2 int numbers
     * Programmer : Amit
     * Date : 12/2/2023
     * @throws ArithmeticException : when try to divide with 0
     * @throws InputMismatchException : when try to enter other than int
     */
    public void divide() throws ArithmeticException, InputMismatchException
    {
        int num, den, div;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num ");
        num = scan.nextInt();
        System.out.println("Enter den ");
        den = scan.nextInt();
        div = num / den;
        System.out.println("Division is " + div);
        System.out.println("Code completed ");  //code change by sakshi on date ..
    }
    //endregion

    //endregion
}
