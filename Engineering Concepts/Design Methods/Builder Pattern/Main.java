public class Main
{
    public static void main(String args[])
    {
        Computer gamingPC=new Computer.Builder()
                .setCpu("Intel i5")
                .setRam("8GB")
                .setStorage("512GB SSD")
                .build();

        Computer officePC=new Computer.Builder()
                .setCpu("Intel i3")
                .setRam("4GB")
                .setStorage("1TB HDD")
                .build();

        System.out.println("Gaming PC:");
        gamingPC.display();

        System.out.println();

        System.out.println("Office PC:");
        officePC.display();
    }
}