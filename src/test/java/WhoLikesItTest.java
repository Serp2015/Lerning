import org.junit.Assert;
import org.junit.Test;

public class WhoLikesItTest {
    @Test
    public void whoLikesItShouldReturnTrue() {
        Assert.assertEquals("Alex, Jacob and 2 others like this",
                WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        Assert.assertEquals("Alex, Jacob and 3 others like this",
                WhoLikesIt.whoLikesIt("Alex", "Jacob", "Mark", "Max", "Mike"));
        Assert.assertEquals("Alex likes this",
                WhoLikesIt.whoLikesIt("Alex"));
        Assert.assertEquals("no one likes this",
                WhoLikesIt.whoLikesIt());
    }
}
