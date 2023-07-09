package Lab03;

import java.util.Arrays;
import java.util.Comparator;

public class Main 
{
    public static void main(String[] args) 
    {
        Employee[] employees = 
        {
                new Employee("Bryant", 706700),
                new Employee("Ronaldo", 76676500),
                new Employee("Jordan", 54676900),
                new Employee("Lincoln", 4356900),
                new Employee("Wayne", 1237000),
        };

        Arrays.sort(employees, Comparator.comparing(Employee::getWynagrodzenie).thenComparing(Employee::getNazwisko));

        System.out.println("Sortowanie wedlug wynagrodzenia: ");

        for (Employee employee : employees) 
        {

            System.out.println(employee.getNazwisko() + " - " + employee.getWynagrodzenie());
        }

        for (Employee employee : employees) 
        {
            System.out.println(employee.getNazwisko() + " - " + employee.getWynagrodzenie());
        }
    }    
}
