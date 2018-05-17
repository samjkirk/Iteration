public class iterationMain {
    public static void main(String[] args) {
        Iteration ite = new Iteration();

        for (int i = 0; i < 10; i++) {
            System.out.println(ite.calc(i, 4, true));
        }
    }
}
