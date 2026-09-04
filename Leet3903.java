import java.util.Scanner;

public class Leet3903 {

    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];

        // Maximum from 0 to i
        prefixMax[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
        }

        // Minimum from i to n-1
        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
        }

        // Find first stable index
        for (int i = 0; i < n; i++) {
            int instability = prefixMax[i] - suffixMin[i];

            if (instability <= k) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Leet3903 solution = new Leet3903();

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