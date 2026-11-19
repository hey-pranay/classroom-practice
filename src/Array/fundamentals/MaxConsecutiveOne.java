package Array.fundamentals;

public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int[]  arr =  {};

        int count = 0 ;
        int maxCount = 0;

        for(int i : arr){
            if(i == 1){
                count++;
            } else{
                count = 0;
            }
            maxCount = Math.max(maxCount,count);
        }
        System.out.println(maxCount);
    }
}
