import org.junit.Assert;
import org.junit.Test;

public class SumOfDigitsTest {
    @Test
    public void SumOfDigitsShouldReturnTrue() {
        Assert.assertEquals(7, SumOfDigits.digital_root(16));
        Assert.assertEquals(6, SumOfDigits.digital_root(132189));
    }
}
