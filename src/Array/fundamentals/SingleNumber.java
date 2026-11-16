package Array.fundamentals;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3};

        int ans = 0;
        for (int i : arr) {
            ans ^= i;
        }

        System.out.println(ans);
    }
}
