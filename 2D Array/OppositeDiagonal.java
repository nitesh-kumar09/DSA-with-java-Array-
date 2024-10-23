// program to read and calculate sum of all the elements present in the matrix.

import java.util.*;

class DiagonalSum {

    static int diagonalMatrix(int a[][]) {
        int sum = 0;
        // Check if the matrix is square
        if (a.length != a[0].length) {
            return -1;
        }
        
        for (int i = 0; i < a.length; i++) {
            
            for (int j = 0; j < a[i].length; j++) {
                if (i+j ==  a.length-1) {

                    sum += a[i][j];
                }
               
            }
        }
        return sum;
    }
}

class OppositeDiagonal {

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

       int result = DiagonalSum.diagonalMatrix(a);

       if(result == -1)
       {
        System.out.println("Please  enter a square matrix");
       }
       else
       {
        System.out.println("The sum of opposite diagonal element is : "+result);
       }

    }

}
