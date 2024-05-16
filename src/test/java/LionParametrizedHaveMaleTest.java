import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParametrizedHaveMaleTest {
    private final String sex;
    private final boolean expected;


    public LionParametrizedHaveMaleTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;

    }

    @Parameterized.Parameters (name = "Test {index}: {0}, expected {1}")
    public static Object[][] getSex() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void shouldMaleTest() throws Exception {
        Lion lion = new Lion(sex, null);
        assertEquals(expected, lion.doesHaveMane());
    }
}
