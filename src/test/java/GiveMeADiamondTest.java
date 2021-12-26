import org.junit.Assert;
import org.junit.Test;

public class GiveMeADiamondTest {

    @Test
    public static void printShouldReturnTrue() {
        Assert.assertEquals(" *\n***\n *\n", GiveMeADiamond.print(3));
        Assert.assertEquals("  *\n ***\n*****\n ***\n  *\n", GiveMeADiamond.print(5));
    }
}
