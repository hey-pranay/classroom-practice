package Array.fundamentals;

public class FindMinimum {
    public static void main(String[] args){
        int[] arr = {12, 45, 23, 67, 89, 10};

        // find maximum
        int min = Integer.MAX_VALUE;

        for(int num : arr) {
            if(num < min){
                min = num;
            }
        }

        System.out.println(min);
    }
}