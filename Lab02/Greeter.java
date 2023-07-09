package Lab02;

public class Greeter implements Runnable 
{
    private String target;
    private int licznik;

    public Greeter(String target, int licznik) 
    {
        this.target = target;
        this.licznik = licznik;
    }

    @Override
    public void run() 
    {
        for (int i = 0; i < licznik; i++) 
        {
            System.out.println("Witaj, " + target);
        }
    }
}
