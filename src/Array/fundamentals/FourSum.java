package Array.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;

        Arrays.sort(arr);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length - 3; i++) { // for first fixed no

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < arr.length - 2; j++) { // for second fixed no

                if (j > i + 1 && arr[j] == arr[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = arr.length - 1;

                int remainingTarget = target - arr[i] - arr[j];

                while (left < right) {
                    int sum = arr[left] + arr[right];

                    if (sum < remainingTarget) {
                        left++;
                    } else if (sum > remainingTarget) {
                        right--;
                    } else {
                        List<Integer> quadruplets = Arrays.asList(
                                arr[i], arr[j], arr[left], arr[right]
                        );

                        result.add(quadruplets);

                        left++;
                        right--;

                        while (left < right && arr[left] == arr[left - 1]) {
                            left++;
                        }

                        while (left < right && arr[right] == arr[right + 1]) {
                            right--;
                        }

                    }
                }

            }
        }

        System.out.println(result);
    }
}
