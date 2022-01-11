import org.testng.Assert;
import org.testng.annotations.Test;

public class StringUtilTest {

    @Test
    public void shouldGetLengthOfAString(){

        String testString = "New test";
        Assert.assertEquals(testString.length(),8);
    }
}
