package recursion.problems;

/*
    Question 4 : we are given string S, we need to find the count of all contiguous substrings starting and ending with
    same character.

    Sample Input 1 : S = "abcab"
    Sample Output I : 7

    There are 15 substrings of "abcabi' : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
    Out of the above substrings, there are 7 substrings : a, abca, b, bcab, c, a and b. So, only 7
    contiguous substrings start and end with the same character.

    Sample Input 2 S = "aba"
    Sample Output 2 : 4
    The substrings are a, b, a and aba.
*/
public class Four {

    static int countSubstrings(String str, int start, int end) {
        if (start == str.length()) {
            return 0;
        }

        if (end == str.length()) {
            return countSubstrings(str, start + 1, start + 1);
        }

        int count = 0;
        if (str.charAt(start) == str.charAt(end)) {
            count = 1;
        }

        return count + countSubstrings(str, start, end + 1);
    }

    public static void main(String[] args) {
        String s = "aba";
        System.out.println(countSubstrings(s, 0, 0));
    }
}