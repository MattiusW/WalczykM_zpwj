package Lab04;
import java.util.stream.Stream;

public class StreamGenerator 
{   
    public static void main(String[] args) 
    {
        long a = 453454L;
        long b = 432L;
        long c = 12L;
        long seed = 12311323L;

        Stream<Long> strumien = generatorStrumienia(a, b, c, seed);
        strumien.limit(10).forEach(System.out::println);
    }
    
    public static Stream<Long> generatorStrumienia(long x, long y, long z, long ziarno) 
    {
        return Stream.iterate(ziarno, n -> (x * n + y) % z);
    }
}
