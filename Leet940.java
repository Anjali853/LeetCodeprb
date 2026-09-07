public class Leet940 {
    public int distinctSubseqII(String s) {
        final int MOD = 1_000_000_007;
        int[] dp = new int[s.length() + 1];

        dp[0] = 1;
        int[] last = new int[26];

        for (int i = 1; i <= s.length(); i++) {

            int c = s.charAt(i - 1) - 'a';
            dp[i] = (int) ((2L * dp[i - 1]) % MOD);
            dp[i] = (int) ((dp[i] - last[c] + MOD) % MOD);
            last[c] = dp[i - 1];
        }
        return (dp[s.length()] - 1 + MOD) % MOD;
    }

    public static void main(String[] args) {
        Leet940 solution = new Leet940();

        String s = "abcab";

        int result = solution.distinctSubseqII(s);

        System.out.println(result);
    }
}
