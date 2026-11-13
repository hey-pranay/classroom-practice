package Array.fundamentals;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] arr = {12, 45, 23, 67, 89, 10};

        // print all elements
        System.out.println("all elements");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        // reverse orders
        System.out.println("reverse order");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // sum of array
        System.out.println("sum");
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println(sum);
        System.out.println();

    }

}
