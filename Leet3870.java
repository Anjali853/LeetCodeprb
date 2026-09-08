public class Leet3870 {
    public int countCommas(int n) {
        if (n < 1000) {
            return 0;
        }

        return n - 999;
    }

    public static void main(String[] args) {
        Leet3870 solution = new Leet3870();

        int n = 10000;

        int result = solution.countCommas(n);

        System.out.println(result);
    }
}
