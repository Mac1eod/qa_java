import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;
    Lion lion;

    @Test
    public void getKittensTest() throws Exception {
        lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
       lion = new Lion("Самец", feline);
       String predator = "Хищник";
       List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
       Mockito.when(feline.getFood(predator)).thenReturn(expectedFood);
       assertEquals(expectedFood, lion.getFood());
    }


}
