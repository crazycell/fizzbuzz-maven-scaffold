import org.apache.commons.lang3.StringUtils;

public class FizzBuzz {
    public String print(int n) {
        String result = "";
        if (n % 3 == 0) {
            result += "fizz";
        }
        if (n % 5 == 0) {
            result += "buzz";
        }
        if (StringUtils.isEmpty(result)) {
            result += n;
        }
        return result;
    }
}
