package Lab04;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Striming 
{
      public static Stream<String> codePoints(String str) 
      {
        return IntStream.range(0, str.length()).mapToObj(i -> str.substring(i, str.offsetByCodePoints(i, 1)));
      }        
}
