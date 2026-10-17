package recursion.problems;


/*
    Question 2 :
    You are given a number (eg : 2019), convert it into a String of english like "two zero one nine".
    Use a recursive function to solve this problem.NOTE - The digits o: the number will only be in the range 0-9
    he last digit of a number can't be 0.

    Sample Input . 1947
    Sample Output : "one nine four seven"
*/

public class Second {

    static String[] words = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    static void printDigits(int n) {

        // base case
        if (n == 0) {
            return;
        }

        // recursive call
        printDigits(n / 10);

        int digit = n % 10;
        System.out.print(words[digit] + " ");
    }

    public static void main(String[] args) {
        int num = 2019;

        String str = "";

        // normal way
        while (num > 0) {
            int digit = num % 10;

            str = words[digit] + " " + str;

            num = num / 10;
        }

        System.out.println(str.trim());
        int n = 2015;
        printDigits(n);
    }
}