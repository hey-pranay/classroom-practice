package Array.fundamentals;

public class FindMaximum {
    public static void main(String[] args){
        int[] arr = {12, 45, 23, 67, 89, 10};

        // find maximum
        int max = Integer.MIN_VALUE;

        for(int num : arr) {
            if(num > max){
                max = num;
            }
        }

        System.out.println(max);
    }
}
