package greedy.problems;

/*

Job Sequencing Problem
    Given an array of jobs where every job has a deadline and profit if the job is finished
    before the deadline. It is also given that every job takes a single unit of time, so the
    minimum possible deadline for any job is 1. Maximize the total profit if only one job can
    be scheduled at a time.
    Job A = 4, 20
    Job B = 1, 10
    Job C = 1, 40
    Job D = 1, 30
    ans = C, A

*/

import java.util.ArrayList;
import java.util.Collections;

public class JobSequence {

    static class Job {
        int id;
        int deadline;
        int profit;


        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int[][] jobsInfo = {{4, 20}, {1, 10}, {1, 40}, {1, 13}};

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        // descending order
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;

        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        // print seq
        System.out.println("max jobs  : " + seq.size());
        for (int i : seq) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}