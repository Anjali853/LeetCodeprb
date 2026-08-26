import java.util.Scanner;

public class Leet2904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String answer = "";
        int minLength = Integer.MAX_VALUE;
        int k = sc.nextInt();

        for (int i = 0; i < s.length(); i++) {

            int ones = 0;

            for (int j = i; j < s.length(); j++) {

                if (s.charAt(j) == '1') {
                    ones++;
                }

                if (ones > k) {
                    break;
                }

                String current = s.substring(i, j + 1);

                if (ones == k) {

                    if (current.length() < minLength ||
                            (current.length() == minLength &&
                                    current.compareTo(answer) < 0)) {

                        answer = current;
                        minLength = current.length();
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
