package Array.fundamentals;

public class KokoEatingBananas {

    static int calculateTotalHours(int[] piles, int k) {
        int totalHours = 0;

        for (int pile : piles) {
            totalHours += (pile + k - 1) / k;
        }

        return totalHours;
    }

    static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int totalHours = calculateTotalHours(piles, mid);

            if (totalHours <= h) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};

        System.out.println(minEatingSpeed(piles, 8));

        int[] piles2 = {30, 11, 23, 4, 20};
        System.out.println(minEatingSpeed(piles2, 5));
    }
}
