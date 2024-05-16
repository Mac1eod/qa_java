import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

 @Mock
 Feline feline;
 Cat cat;

 @Before
 public void setupCat() {
  cat = new Cat(feline);
   }
 @Test
 public void getSoundTest() {
  assertEquals("Мяу", cat.getSound());
 }

 @Test
 public void getFoodTest() throws Exception {
  List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
  Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
  assertEquals(expectedFood, cat.getFood());
 }

}
