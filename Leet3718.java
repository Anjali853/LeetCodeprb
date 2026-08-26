import java.util.HashSet;
import java.util.Scanner;

public class Leet3718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int nums[] = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int num : nums) {
            set.add(num);
        }
        int multiple = k;
        while (set.contains(multiple)) {
            multiple += k;
        }
        System.out.println(multiple);
    }
}