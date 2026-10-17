package recursion.problems;

/*
 Find length of string using recursion.
*/
public class Three {

    static int findLength(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        return 1 + findLength(str.substring(1));


    }

    public static void main(String[] args) {
        String str = "pranay";
        System.out.println(findLength(str));
    }
}