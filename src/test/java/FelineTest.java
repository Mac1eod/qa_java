import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;


public class FelineTest {

    private Feline feline;

    @Before
    public void setupFeline() {
        feline = new Feline();
    }

    @Test
    public void getKittensTestReturnInt() {
        int expected = 5;
        assertEquals(expected, feline.getKittens(expected));
    }

    @Test
    public void getKittensTestReturnDefault() {
        int expected = 1;
        assertEquals(expected, feline.getKittens(1));
    }


    @Test
    public void eatMeatTest() throws Exception {
       List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
       assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }

}
