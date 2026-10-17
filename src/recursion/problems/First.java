package recursion.problems;

/*
    Question 1 : For a given integer array of size N. You have to find all the occurrences
    (indices) of a given element (Key) and print them. Use a recursive function to solve this
    problem.

    Sample Input : arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2
    Sample Output : 1 5 7 8
*/


public class First {

    // by recursion
    /*
        Complexity	Value	Reason
        Time	    O(N)	Visit every element once
        Space	    O(N)	Recursive call stack
    */
    static void findOcc(int[] arr, int idx, int key) {
        // base case
        if (idx == arr.length) return;

        // check if the current element matches the key
        if (arr[idx] == key) {
            System.out.print(idx + " ");
        }


        findOcc(arr, idx + 1, key); // if we move this recursive call before the check it prints in reverse order.
        // recursive call

    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;

        // normal way
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        findOcc(arr, 0, key);

    }
}