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

import javax.sound.sampled.Line;
import javax.sound.sampled.LineEvent;

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

        // crear lineItem, arrayList y el linkedHashSet copiando el array list anadiendo el producot creado anteriormetne
        LineItem lineItem = new LineItem(5, price, product);
        ArrayList<LineItem> lineItemsArray = new ArrayList<LineItem>();
        lineItemsArray.add(lineItem);
        LinkedHashSet<LineItem> lineItems = new LinkedHashSet<LineItem>(lineItemsArray);

        // crear carro
        ShoppingCart shoppingCart = new ShoppingCart(account, LocalDateTime.now(), lineItems);
        Assertions.assertEquals(5, lineItem.getQuantity());


    }

}
