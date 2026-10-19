package backtracking.problems;

/*
    Find permutation(arrangement)
    Find and print all permutation of a string
    n : n! : permutation
*/

public class Second {

    static int count = 0;

    static void findPermutation(String str, String result) {


        if (str.isEmpty()) {
            System.out.println(result);
            count++;
            return;
        }


        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newStr, result + curr);

        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
        System.out.println("count : " + count);
    }
}