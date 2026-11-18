package Array.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] num = {-1, 0, 1, -1, 2, -4};

        if (num.length < 3) {
            System.out.println("no triplet found");
        }

        Arrays.sort(num);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                break;
            }

            if (i > 0 && num[i] == num[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = num.length - 1;
            int remainingTarget = 0 - num[i];

            while (left < right) {
                int sum = num[left] + num[right];

                if (sum < remainingTarget) {
                    left++;
                } else if (sum > remainingTarget) {
                    right--;
                } else {
                    List<Integer> newList = new ArrayList<>(List.of(num[i], num[left], num[right]));
                    result.add(newList);
                    left++;
                    right--;
                    while (left < right && num[left] == num[left - 1]) {
                        left++;
                    }

                    while (left < right && num[right] == num[right + 1]) {
                        right--;
                    }
                }
            }

        }
        System.out.println(result);

    }
}