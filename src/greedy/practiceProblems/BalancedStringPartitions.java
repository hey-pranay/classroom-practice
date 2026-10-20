package greedy.practiceProblems;

public class BalancedStringPartitions {

    static int balancedStringPartitions(String str) {
        int balance = 0;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'L') {
                balance++;
            } else if (ch == 'R') {
                balance--;
            }

            if (balance == 0) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        String str = "LRRRRLLRLLRL";

        System.out.println("Max balanced partitions : " + balancedStringPartitions(str));
    }

}