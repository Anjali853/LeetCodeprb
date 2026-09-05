import java.util.Scanner;

public class Leet3904 {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];

        // Calculate prefix maximum
        prefixMax[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
        }

        // Calculate suffix minimum
        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
        }

        // Find first stable index
        for (int i = 0; i < n; i++) {
            int score = prefixMax[i] - suffixMin[i];

            if (score <= k) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Leet3904 solution = new Leet3904();

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = solution.firstStableIndex(nums, k);

        System.out.println(result);

        sc.close();
    }
}