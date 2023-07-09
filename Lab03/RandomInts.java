package Lab03;

import java.util.Random;

public class RandomInts 
{
    public static IntSequence randomInts(int maly, int wysoki) 
    {
        Random generator = new Random();

        class RandomSequence implements IntSequence {
            public int next() {
                return maly + generator.nextInt(wysoki - maly + 1);
            }

            public boolean hasNext() {
                return true;
            }
        }

        return new RandomSequence();
    }
}
