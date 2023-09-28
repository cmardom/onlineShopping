import Clases.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    @Test
    public void CustomerCreationTest() {
        Customer customer = new Customer("paco123", "paco@gmail.com");
        Assertions.assertEquals("paco123", customer.getId());
    }
    
}
