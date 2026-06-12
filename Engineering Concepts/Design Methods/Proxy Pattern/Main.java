public class Main
{
    public static void main(String args[])
    {
        Image image=new ProxyImage("sample.jpg");
        
        System.out.println("First call:");
        image.display();

        System.out.println();

        System.out.println("Second call:");
        image.display();
    }
}