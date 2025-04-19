//public class ThreeDArrayExample {
//    public static void main(String[] args) {
//        // Declare and initialize a 3D array
//        int[][][] threeDArray = {
//                {
//                        {1, 2, 3}, {4, 5, 6}
//                },
//                {
//                        {7, 8, 9}, {10, 11, 12}
//                }
//        };
//
//        // Iterate through the 3D array and print the values
//        for (int i = 0; i < threeDArray.length; i++) {
//            for (int j = 0; j < threeDArray[i].length; j++) {
//                for (int k = 0; k < threeDArray[i][j].length; k++) {
//                    System.out.print(threeDArray[i][j][k] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//    }
//}
public class SimpleRecursionExample {
    public static void main(String[] args) {
        int num = 8
                ; // Example number
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }

    public static int factorial(int n) {
        if (n <= 1) return 1; // Base case
        return n * factorial(n - 1); // Recursive call
    }
}