package Lab02;

public class Main 
{
    public static void main(String[] args) 
    {
        Greeter witanaKobieta = new Greeter("Alicja", 3);
        Greeter witanyMezczyzna = new Greeter("Staszek", 2);

        Thread thread1 = new Thread(witanaKobieta);
        Thread thread2 = new Thread(witanyMezczyzna);

        thread1.start();
        thread2.start();
    }
}
