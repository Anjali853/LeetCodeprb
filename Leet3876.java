import java.util.Scanner;

public class Leet3876 {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;
        for (int num : nums1) {
            if (num % 2 == 1) {
                minOdd = Math.min(minOdd, num);
            }
        }
        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }
        for (int num : nums1) {
            if (num % 2 == 0 && num < minOdd) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Leet3876 obj = new Leet3876();
        System.out.println(obj.uniformArray(nums));
    }

}
