package backtracking.problems;

/*
    find subsets
    find and print all subsets of a given string : "abc"
    n->2^n : subsets
*/
public class First {

    static void findSubset(String str, String result, int idx) {
        // base case
        if (idx == str.length()) {
            if (result.isEmpty()) {
                System.out.println("null");
            } else {
                System.out.println(result);
            }
            return;
        }

        // recursion
        // yes choice
        findSubset(str, result + str.charAt(idx), idx + 1);

        // no choice
        findSubset(str, result, idx + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubset(str, "", 0);
    }
}