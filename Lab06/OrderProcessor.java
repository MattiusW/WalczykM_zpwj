package Lab06;
import java.util.Optional;


public class OrderProcessor 
{
    public static class Order 
    {
        private Optional<Customer> konsument;

        public Order(Optional<Customer> konsument) 
        {
            this.konsument = konsument;
        }

        public Optional<Customer> getKonsument() 
        {
            return konsument;
        }
    }

    public static class Customer {
        private String city;

        public Customer(String city) {
            this.city = city;
        }

        public String getCity() {
            return city;
        }
    }
}