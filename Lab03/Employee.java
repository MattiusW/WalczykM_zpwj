package Lab03;

public class Employee 
{
    private String nazwisko;
    private int wynagrodzenie;

    public Employee(String nazwisko, int wynagrodzenie) 
    {
        this.nazwisko = nazwisko;
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getNazwisko() 
    {
        return nazwisko;
    }

    public int getWynagrodzenie() 
    {
        return wynagrodzenie;
    }
    
}
