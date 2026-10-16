package recursion;

public class RecursionBasics {
    // Print numbers from 1 to N
    static void printNumber(int n) {
        // base condition
        if (n == 0) {
            return;
        }

        // recursive call
        printNumber(n - 1);

        // work after recursion
        System.out.print(n + " ");
    }

    // print numbers from n to 1
    static void printDec(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);

    }

    // factorial of number =>
    // space -> O(n)
    // time -> O(n) -> each call stack has its variable so we call n times that is why n .
    static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    // sum of first n natural numbers
    static int sumOfFNatural(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + sumOfFNatural(n - 1);
        return sum;
    }

    // print nth fibonacci number
    // space = O(n)
    // time = (2^n) exponential
    static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    // check if array is sorted
    // space =
    // time =
    static boolean isSorted(int[] arr, int i) {
        if (arr[i] == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // find the first occurrence of an element in an array
    static int firstOcc(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (arr[i] == key) {
            return i;
        }

        return firstOcc(arr, key, i + 1);
    }

    // find the last occurrence of an element in an array
    static int lastOcc(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOcc(arr, key, i + 1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }


    // print x power to n
    // time : O(n)
    static int xPowerTOn(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int xnm1 = xPowerTOn(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }

    // optimised version
    static int optimisedPower(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimisedPower(x, n / 2) * optimisedPower(x, n / 2);

        if (n % 2 != 0) {
            halfPower = x * halfPower;
        }
        return halfPower;
    }

    public static void main(String[] args) {
        System.out.print("increasing numbers : ");
        printNumber(5);
        System.out.println();
        System.out.print("decreasing numbers : ");
        printDec(5);
        System.out.println();
        System.out.print("factorial of 5 : " + fact(5));
        System.out.println();
        System.out.println("sum of first 5 natural numbers : " + sumOfFNatural(5));
        System.out.println("fib of 10 : " + fib(10));
        int[] arr = {1, 2, 9, 3, 4, 5, 45, 2, 84, 5};
        System.out.println("Is array sorted : " + isSorted(arr, 0));
        System.out.println(firstOcc(arr, 9, 0));
        System.out.println(lastOcc(arr, 5, 0));
        System.out.println(xPowerTOn(2, 4));
        System.out.println(optimisedPower(2, 5));
    }
}