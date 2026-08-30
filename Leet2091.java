import java.util.Scanner;

public class Leet2091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }

            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);
        int fromFront = right + 1;

        // Both from back
        int fromBack = n - left;

        // One from front and one from back
        int fromBoth = (left + 1) + (n - right);

        int result = Math.min(fromFront, Math.min(fromBack, fromBoth));

        System.out.println(result);

        sc.close();
    }
}