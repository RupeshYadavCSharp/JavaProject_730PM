package pack_Exce;

public class OddNumberException extends Exception
{
    @Override
    public String getMessage() {
        return "Odd numbers are not allowed";
    }
}
