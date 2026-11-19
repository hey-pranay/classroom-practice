package Array.fundamentals;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int left = 0;
        int right = height.length - 1;
        int maximumWaterCanHoldCapacity = 0;


        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);

            int currentWaterCanHoldCapacity = width * h;
            maximumWaterCanHoldCapacity = Math.max(maximumWaterCanHoldCapacity, currentWaterCanHoldCapacity);

            if (height[left] < height[right]) {
                left++;
            } else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }

        System.out.println(maximumWaterCanHoldCapacity);
    }
}