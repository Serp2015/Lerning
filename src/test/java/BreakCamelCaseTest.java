import org.junit.Assert;
import org.junit.Test;

public class BreakCamelCaseTest {

    @Test
    public void breakCamelCaseShouldReturnTrue() {
        Assert.assertEquals("qwe Rtyu", BreakCamelCase.camelCase("qweRtyu"));
        Assert.assertEquals("identifier", BreakCamelCase.camelCase("identifier"));
        Assert.assertEquals("", BreakCamelCase.camelCase(""));
        Assert.assertEquals("camel Casing Test", BreakCamelCase.camelCase("camelCasingTest"));
    }
}
