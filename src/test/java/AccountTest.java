import Clases.*;
import Tipos.Address;
import Tipos.Enumeration.UserState;
import Tipos.Phone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Date;

import java.util.LinkedHashSet;


public class AccountTest {

    @Test
    public void AccountCreationTest() {
        Address address = new Address("Av Mijas", 30, "Fuengirola", 2950, "Espana");
        Account account = new Account("paco123", address, false, LocalDateTime.now(), LocalDateTime.now());

        Assertions.assertEquals("paco123", account.getId());



    }
}
