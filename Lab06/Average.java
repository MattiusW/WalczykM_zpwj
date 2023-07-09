package Lab06;

import java.util.stream.Stream;

public class Average 
{   

     public static void main(String[] args) {
        Stream<Double> strumien = Stream.of(5.0, 7.0, 10.0, 12.0, 4.0);

        double average = strumien.reduce
        (
                new AverageAccumulator(),
                AverageAccumulator::accumulate,
                AverageAccumulator::combine
        ).getAverage();

        System.out.println("Average: " + average);
    }

    private static class AverageAccumulator 
    {
        private int licznik;
        private double suma;

        public AverageAccumulator()
        {
            this.licznik = 0;
            this.suma = 0.0;
        }

        public AverageAccumulator accumulate(Double value) 
        {
            licznik++;
            suma += value;
            return this;
        }

        public AverageAccumulator combine(AverageAccumulator other) 
        {
            licznik += other.licznik;
            suma += other.suma;
            return this;
        }

        public double getAverage() 
        {
            return suma / licznik;
        }
    }    
}
