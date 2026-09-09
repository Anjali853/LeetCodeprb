public class Leet3871 {
    public long countCommas(long n) {
        long ans = 0;

        long start = 1000;
        long commas = 1;

        while (start <= n) {
            long end = start * 1000 - 1;

            // Only count up to n
            long count = Math.min(n, end) - start + 1;

            ans += count * commas;

            start *= 1000;
            commas++;
        }

        return ans;
    }

    public static void main(String[] args) {
        Leet3871 solution = new Leet3871();

        long n = 1000000;

        long result = solution.countCommas(n);

        System.out.println(result);
    }
}
