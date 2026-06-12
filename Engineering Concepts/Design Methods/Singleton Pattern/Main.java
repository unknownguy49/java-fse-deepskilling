public class Main
{
    public static void main(String args[])
    {
        Logger a=Logger.getInstance();
        Logger b=Logger.getInstance();

        System.out.println(a==b);
    }
}