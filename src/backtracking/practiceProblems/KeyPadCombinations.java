package backtracking.practiceProblems;

import java.util.ArrayList;
import java.util.List;

public class KeyPadCombinations {

    static String[] keypad = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "stuv",
            "wxyz"
    };

    static List<String> result = new ArrayList<>();

    static void solve(String digits, int idx, StringBuilder path) {

        // base case
        if (idx == digits.length()) {
            result.add(path.toString());
            return;
        }

        // get the current digit
        int digit = digits.charAt(idx) - '0';

        // get all letters mapped to this digit
        String letters = keypad[digit];

        // try each possible letter
        for (int i = 0; i < letters.length(); i++) {
            path.append(letters.charAt(i));

            solve(digits, idx + 1, path);

            path.deleteCharAt(path.length() - 1);
        }

    }


    public static void main(String[] args) {
        String digits = "897";

        solve(digits, 0, new StringBuilder());
        System.out.println(result);
        System.out.println("total combination : " + result.size());
    }
}