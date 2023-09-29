import Clases.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;

import Tipos.Address;
import Tipos.Enumeration.UserState;
import Tipos.Price;
import Tipos.Supplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class WebUserTest {
    @Test
    public void WebUserCreationTest(){
        WebUser webUser = new WebUser("paco123", "asd123", UserState.NEW);
        Assertions.assertEquals("paco123", webUser.getLogin_id());
    }

    @Test
    public void WebUserAddsProductToShoppingCartTest(){
        //Crear address, account, supplier, product
        Address address = new Address("Av Mijas", 30, "Fuengirola", 2950, "Espana");
        Account account = new Account("paco123", address, false, LocalDateTime.now(), LocalDateTime.now());
        Supplier supplier = new Supplier("Porcelanosa");
        Product product = new Product("123", "Azulejo", supplier);

        // crear BigDecimal, Precio
        BigDecimal bdFromString = new BigDecimal("214.91");
        Price price = new Price(bdFromString);

        //se crea linkedhashset del line item
        LineItem lineItem = new LineItem(1, price, product);
        LinkedHashSet<LineItem> line1 = new LinkedHashSet<LineItem>();
        //se añade a la linea
        line1.add(lineItem);


        //se crea shoppingcart
        ShoppingCart shoppingCart = new ShoppingCart(account, LocalDateTime.now(), line1);
        // se añade al carro
        shoppingCart.setLineItems(line1);

        //se tesstea cantidad
        Assertions.assertEquals(lineItem.getQuantity(), 1);


        // LO MISMO CON PRODUCTO 2
        Product product2 = new Product("1234", "Losa", supplier);
        BigDecimal bdFromString2 = new BigDecimal("514.91");
        Price price2 = new Price(bdFromString2);
        LineItem lineItem2 = new LineItem(1, price2, product2);
        LinkedHashSet<LineItem> line2 = new LinkedHashSet<LineItem>();
        line2.add(lineItem);
        shoppingCart.setLineItems(line2);

        Assertions.assertEquals(lineItem2.getQuantity(), 1);


        //LO MISMO CON PRODUCTO 3
        Product product3 = new Product("12345", "Mosaico", supplier);
        BigDecimal bdFromString3 = new BigDecimal("34.91");
        Price price3 = new Price(bdFromString3);
        LineItem lineItem3 = new LineItem(1, price3, product3);
        LinkedHashSet<LineItem> line3 = new LinkedHashSet<LineItem>();
        line3.add(lineItem);
        shoppingCart.setLineItems(line3);


        Assertions.assertEquals(lineItem3.getQuantity(), 1);

    }

}
