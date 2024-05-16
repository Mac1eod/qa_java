import com.example.Lion;
import com.example.Feline;
import org.junit.Test;
import org.mockito.Mock;

public class LionExceptionTest {
   // @Mock
   // Feline feline;
    Lion lion;

    @Test(expected = Exception.class)
    public void HaveMaleException() throws Exception {
        lion = new Lion("Unkown", null);

    }
}
