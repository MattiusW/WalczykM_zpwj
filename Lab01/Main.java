package Lab01;
import java.time.LocalDate;

public class Main {
  public static void main(String[] args) {
    Employee[] tab = {
        new Employee("Anatol", 21323.0, LocalDate.of(2020,01,10)),
        new Employee("Anton", 2144.0, LocalDate.of(2011, 12, 11)),
        new Employee("Anzelm", 5423.0, LocalDate.of(2007, 10, 29))
    };
    for (Employee e : tab)
      System.out.println(e);
    System.out.println("Średnia: " + Measurable.average(tab));
  }

}