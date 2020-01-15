import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FizzBuzzTest {
    @ParameterizedTest
    @CsvSource({
            "1, '1'",
            "3, 'fizz'",
            "5, 'buzz'",
            "15, 'fizzbuzz'"
    })
    public void test(int n, String ex) {
        assertThat(new FizzBuzz().print(n)).isEqualTo(ex);
    }
}