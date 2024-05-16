import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionExceptionParametrizeTest {
    private final String sex;


    public LionExceptionParametrizeTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters (name = "Test {index}: {0}")
    public static Object[][] getSex() {
        return new Object[][] {
                {"Unknown"},
                {"неизвестный"},
                {null},

        };
    }

    @Test(expected = Exception.class)
    public void HaveMaleException() throws Exception {
        new Lion(sex, null);
    }
}
