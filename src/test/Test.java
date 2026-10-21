package test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
283 - done
495 - done
733 - no
888 - working
*/
public class Test {
    static void moveZeros(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                idx++;
            }
        }
    }

    // brute force; O(n*m)
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sumA = 0;
        int sumB = 0;

        for (int i : aliceSizes) {
            sumA += i;
        }

        for (int i : bobSizes) {
            sumB += i;
        }

        int diff = (sumA - sumB) / 2;

        for (int x : aliceSizes) {
            for (int y : bobSizes) {
                if (x - y == diff) {
                    return new int[]{x, y};
                }
            }
        }
        return new int[]{};
    }

    // optimised approach
    static int[] fairCandyOptimised(int[] A, int[] B) {

        int sumA = 0;
        int sumB = 0;

        for (int i : A) {
            sumA += i;
        }

        for (int i : B) {
            sumB += i;
        }

        int diff = (sumA - sumB) / 2;

        HashSet<Integer> set = new HashSet<>();

        for (int y : B) {
            set.add(y);
        }

        for (int x : A) {
            int y = x - diff;
            if (set.contains(y)) {
                return new int[]{x, y};
            }
        }
        return new int[]{};
    }

    // two pointer approach
    public int[] fairCandySwapTwoP(int[] aliceSizes, int[] bobSizes) {

        int sumA = 0, sumB = 0;

        for (int x : aliceSizes) sumA += x;
        for (int y : bobSizes) sumB += y;

        int targetDiff = (sumA - sumB) / 2;

        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);

        int i = 0, j = 0;

        while (i < aliceSizes.length && j < bobSizes.length) {

            int currentDiff = aliceSizes[i] - bobSizes[j];

            if (currentDiff == targetDiff) {
                return new int[]{aliceSizes[i], bobSizes[j]};
            } else if (currentDiff < targetDiff) {
                i++;
            } else {
                j++;
            }
        }

        return new int[]{};
    }

    static int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmail = new HashSet<>();

        for (String email : emails) {
            // split with '@'
            String[] parts = email.split("@");

            String local = parts[0];
            String domain = parts[1];

            // find the index of '+'
            int plusIndex = local.indexOf('+');

            // remove all after the '+'
            if (plusIndex != -1) {
                local = local.substring(0, plusIndex);
            }

            // remove all '.'
            local = local.replace(".", "");

            // store the normalized result
            uniqueEmail.add(local + "@" + domain);
        }
        return uniqueEmail.size();
    }

    public static void main(String[] args) {
        /*
            int[] nums = {0,1,0,3,12};
            moveZeros(nums);
            for(int i : nums){
                System.out.print(i + " ");
            }
        */

        /*
            int[] aliceSizes = {1, 2};
            int[] bobSizes = {2, 3};
            int[] res = fairCandyOptimised(aliceSizes, bobSizes);
            for (int i : res) {
                System.out.print(i + " ");
            }
        */

        String[] emails = {
                "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"
        };

        System.out.println(numUniqueEmails(emails));


    }


}