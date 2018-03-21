public class MaxSquarePolyRoot {
    private SquarePolynomial sp;

    public MaxSquarePolyRoot(SquarePolynomial sp) {
        this.sp = new SquarePolynomial(sp);
    }

    public double maxRoot() throws MaxRootException {
        double[] roots;
        roots = sp.findRoots();
        if (roots == null) {
            throw new MaxRootException("This polynomial has infinite number of roots or doesn't have any");
        }
        if (roots.length == 0) {
            throw new MaxRootException("This polynomial has infinite number of roots or doesn't have any");
        }
        if (roots.length == 1) {
            return roots[0];
        }
        if (roots[0] > roots[1]) {
            return roots[0];
        } else {
            return roots[1];
        }
    }
}
