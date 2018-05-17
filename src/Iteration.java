public class Iteration extends iterationMain {

    public int calc(int x, int y, boolean add) {
        if (x==0) {
            return y;
        } else if (y==0) {
            return x;
        }

        if (add) {
            return x + y;
        } else {
            return x * y;
        }
    }
}
