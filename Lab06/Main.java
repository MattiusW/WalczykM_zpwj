package Lab06;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main 
{
    public static void main(String[] args) 
    {
        Stream<ArrayList<Integer>> stream = Stream.of
        (
                new ArrayList<>(List.of(4, 6, 7)),
                new ArrayList<>(List.of(23, 11, 45)),
                new ArrayList<>(List.of(45, 123, 34))
        );

        ArrayList<Integer> rezultat1 = stream.reduce(new ArrayList<>(), (list1, list2) -> 
        {
            list1.addAll(list2);
            return list1;
        });

        System.out.println(rezultat1);

        ArrayList<Integer> rezultat2 = stream.reduce
        (
            new ArrayList<>(),
            (list1, list2) -> {
                list1.addAll(list2);
                return list1;
            },
            (list1, list2) -> {
                list1.addAll(list2);
                return list1;
            }
        );

        System.out.println(rezultat2);
    }
}

