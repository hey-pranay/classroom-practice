package greedy.problems;
/*

Activity Selection :
    You are given n activities with their start and end times. Select the maximum number of activities
    that can be performed by a single person, assuming that a person can only work on a single
    activity at a time. Activities are sorted according to end time.

    start [10, 12, 201]
    end = [20, 25, 301]

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ActivitySelection {

    // for sorted end time
    /*
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        // end time basis sort
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];

        for (int i = 1; i < end.length; i++) {
            // activity select
            if (start[i] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("max activities : " + maxAct);
        for (int i : ans) {
            System.out.print("A" + i + " ");
        }
        System.out.println();
    }
    */

    // for unsorted end time

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {9, 4, 6, 7, 9, 9};

        int n = start.length;

        // store start , end , original activity number
        int[][] activities = new int[n][3];

        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i];
            activities[i][1] = end[i];
            activities[i][2] = i;
        }

        // sort by ending time, asc
        Arrays.sort(
                activities, Comparator.comparingInt(a -> a[1])
        );

        int maxAct = 0;
        int lastEnd = Integer.MIN_VALUE;

        List<Integer> selected = new ArrayList<>();

        for (int[] activity : activities) {
            int s = activity[0];
            int e = activity[1];
            int id = activity[2];

            if (s >= lastEnd) {
                maxAct++;
                selected.add(id);
                lastEnd = e;
            }
        }
        System.out.println("Maximum activities  : " + maxAct);
        System.out.println("Selected activities  : " + selected);


    }

}