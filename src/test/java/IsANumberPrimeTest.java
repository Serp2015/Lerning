import org.junit.Assert;
import org.junit.Test;

public class IsANumberPrimeTest {

    @Test
    public void isPrimeShouldReturnTrue() {
        Assert.assertEquals(true, IsANumberPrime.isPrime(907));
        Assert.assertEquals(true, IsANumberPrime.isPrime(307));
        Assert.assertEquals(false, IsANumberPrime.isPrime(-401));
        Assert.assertEquals(false, IsANumberPrime.isPrime(-503));
        Assert.assertEquals(true, IsANumberPrime.isPrime(3557));
        Assert.assertEquals(false, IsANumberPrime.isPrime(-5));
        Assert.assertEquals(true, IsANumberPrime.isPrime(2));
        Assert.assertEquals(false, IsANumberPrime.isPrime(0));
    }
}
