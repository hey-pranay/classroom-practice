package Array.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KSum {
    static List<List<Integer>> kSum(int[] arr, int start, int k, int target) {

        List<List<Integer>> result = new ArrayList<>();


        if (k == 2) {
            int left = start;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[left] + arr[right];

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {

                    result.add(Arrays.asList(arr[left], arr[right]));

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

        } else {
            for (int i = start; i < arr.length - k + 1; i++) {

                if (i > start && arr[i] == arr[i - 1]) {
                    continue;
                }

                List<List<Integer>> combinations =
                        kSum(arr, i + 1, k - 1, target - arr[i]);

                for (List<Integer> combination : combinations) {

                    List<Integer> newList = new ArrayList<>();

                    newList.add(arr[i]);
                    newList.addAll(combination);

                    result.add(newList);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 0, -1, 0, -2, 2};

        Arrays.sort(arr);

        System.out.println(kSum(arr, 0, 4, 0));


    }

}
