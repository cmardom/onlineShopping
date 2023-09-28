import Clases.Product;
import Tipos.Supplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {
    @Test
    public void ProductCreationTest(){
        Supplier supplier = new Supplier("Porcelanosa");
        Product product = new Product("123", "Azulejo", supplier);
        Assertions.assertEquals("Azulejo", product.getName());
    }
}
