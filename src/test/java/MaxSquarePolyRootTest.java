import org.testng.Assert;
import org.testng.annotations.Test;


public class MaxSquarePolyRootTest {
    @Test
    public void maxRootTest() throws MaxRootException {
        MaxSquarePolyRoot maxSquarePolyRoot = new MaxSquarePolyRoot(new SquarePolynomial(1, -4, 0));

        Assert.assertEquals(4, maxSquarePolyRoot.maxRoot(), 0.000000001);
    }
    @Test
    public void equalRootsTest() throws MaxRootException {
        MaxSquarePolyRoot maxSquarePolyRoot = new MaxSquarePolyRoot(new SquarePolynomial(1, 0, 0));

        Assert.assertEquals(0, maxSquarePolyRoot.maxRoot(), 0.000000001);
    }
    @Test(expectedExceptions = MaxRootException.class)
    public void infiniteRootsTest() throws MaxRootException {
        MaxSquarePolyRoot maxSquarePolyRoot = new MaxSquarePolyRoot(new SquarePolynomial(0, 0, 0));
        maxSquarePolyRoot.maxRoot();
    }
    @Test(expectedExceptions = MaxRootException.class)
    public void noneRootsTest() throws MaxRootException {
        MaxSquarePolyRoot maxSquarePolyRoot = new MaxSquarePolyRoot(new SquarePolynomial(4, 4, 4));
        maxSquarePolyRoot.maxRoot();
    }
}
