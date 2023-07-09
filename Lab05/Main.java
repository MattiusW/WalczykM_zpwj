package Lab05;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main 
{
    public static void main(String[] args) 
    {
        Stream<String> string1 = Stream.of("Ala ma kota i psa", "ma", "kota", "psa");
        Stream<String> string2 = Stream.of("Pieklo pocztowe", "Straz Straz", "Wiedzmin", "Zapraszamy do klubu ToastMaster Czestochowa");
        
        OptionalDouble averageLength = string1
                .mapToInt(String::length)
                .average();
        
        averageLength.ifPresentOrElse
        (
                length -> System.out.println("Srednia dlugosc: " + length),
                () -> System.out.println("Nie znaleziono żadnych stringów.")
        );

        List<String> longestStrings = string2

                .collect(Collectors.groupingBy(String::length))
                .entrySet()
                .stream()
                .max(Comparator.comparingInt(entry -> entry.getKey()))
                .map(entry -> entry.getValue())
                .orElse(List.of());

        System.out.println("Najdluzszy ciag znakow: " + longestStrings);
    }

    public static <T> Stream<T> zip(Stream<T> jeden, Stream<T> dwa) 
    {
        Iterator<T> iterator1 = jeden.iterator();
        Iterator<T> iterator2 = dwa.iterator();
        
         Spliterator<T> spliterator = Spliterators.spliteratorUnknownSize
         (
                new Iterator<T>() 
                {
                    boolean kolejny = true;

                    @Override
                    public boolean hasNext() 
                    {
                        return iterator1.hasNext() || iterator2.hasNext();
                    }

                    @Override
                    public T next() 
                    {
                        T element = null;
                        if (kolejny && iterator1.hasNext()) 
                        {
                            element = iterator1.next();
                        } 
                        else if (!kolejny && iterator2.hasNext()) 
                        {
                            element = iterator2.next();
                        }
                        kolejny = !kolejny;
                        return element;
                    }
                },
                Spliterator.ORDERED
        );

        return StreamSupport.stream(spliterator, false);
    }

}
