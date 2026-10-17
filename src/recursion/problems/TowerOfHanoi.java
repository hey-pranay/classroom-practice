package recursion.problems;


public class TowerOfHanoi {
    static void towerOfHanoi(int n, char source, char helper, char destination) {

        // base case
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // step 1 : Move n-1 disks from source to helper
        towerOfHanoi(n - 1, source, destination, helper);

        // step 2 : Move the largest dist to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // step 3 : Move n-1 disks form helper to destination
        towerOfHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, 'A', 'B', 'C');
    }
}