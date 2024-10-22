// program to read and calculate sum of all the elements present in the matrix.

import java.util.*;

class CheckIdentity {

    static boolean isIdentity(int a[][]) {
        // Check if the matrix is square
        if (a.length != a[0].length) {
            return false;
        }
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j && a[i][j] != 1) {
                    return false;
                }
                if (i != j && a[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

class IdentityMatrix {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of row : ");
        int rSize = obj.nextInt();

        System.out.println("Enter size of column : ");
        int cSize = obj.nextInt();

        int[][] a = new int[rSize][cSize];

        System.out.println("Enter element of the matrix : ");
        for (int i = 0; i < rSize; i++) {
            for (int j = 0; j < cSize; j++) {
                a[i][j] = obj.nextInt();
            }
        }

        System.out.println(CheckIdentity.isIdentity(a));

    }

}
