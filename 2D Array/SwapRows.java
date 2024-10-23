// program to read and calculate sum of all the elements present in the matrix.

import java.util.*;



class SwapRows {

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
        System.out.println("Enter second row value for interchange: ");
        int m = obj.nextInt();

        System.out.println("Enter first row  value for interchange : ");
        int n = obj.nextInt();

        System.out.println("Before swapping of matrix : ");

        for (int i = 0; i < rSize; i++) {
            for (int j = 0; j < cSize; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        // logic 

        for(int i = 0 ;i < rSize ; i++)
        {
            int temp = a[m-1][i];
            a[m-1][i] =  a[n-1][i];
            a[n-1][i] = temp;

        }
        System.out.println("Before swapping of matrix : ");

        for (int i = 0; i < rSize; i++) {
            for (int j = 0; j < cSize; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }

}
