import Clases.WebUser;
import Tipos.Enumeration.UserState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WebUserTest {
    @Test
    public void WebUserCreationTest(){
        WebUser webUser = new WebUser("paco123", "asd123", UserState.NEW);
        Assertions.assertEquals("paco123", webUser.getLogin_id());
    }

}
