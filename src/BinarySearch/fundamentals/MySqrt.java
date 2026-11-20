package BinarySearch.fundamentals;

public class MySqrt {
    public static void main(String[] args) {
        int x = 8;

        int left = 0;
        int right = x;

        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int square = mid * mid;

            if (square <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
