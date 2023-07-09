package Lab02;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DigitSequence implements Iterator<Integer> 
{
    private int numer;

    public DigitSequence(int numer) 
    {
        this.numer = numer;
    }

    public boolean hasNext() 
    {
        return numer != 0;
    }

    public Integer next() 
    {
        int digit = numer % 10;
        numer /= 10;
        return digit;
    }

    public void remove() 
    {
        System.out.println("Nic nie robie");
    }

    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) 
    {
        while (!czyPosortowana(strings, comp)) 
        {
            Collections.shuffle(strings);
        }
        
    }

    private static boolean czyPosortowana(ArrayList<String> strings, Comparator<String> comp) 
    {
        for (int i = 0; i < strings.size() - 1; i++) 
        {
            if (comp.compare(strings.get(i), strings.get(i + 1)) > 0) 
            {
                return false;
            }
            
        }
            return true;
    }

}