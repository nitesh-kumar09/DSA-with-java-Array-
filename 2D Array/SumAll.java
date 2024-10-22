// program to read and calculate sum of all the elements present in the matrix.

import java.util.*;



class SumAll {

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of row : ");
        int rSize = obj.nextInt();

        System.out.println("Enter size of column : ");
        int cSize = obj.nextInt();

        int[][] a = new int[rSize][cSize];

        System.out.println("Enter element of the matrix : ");
        for(int i = 0 ; i < rSize ; i++)
        {
            for(int j = 0 ; j < cSize ; j++)
            {
                a[i][j] = obj.nextInt();
            }
        }

        int sum = 0 ;
        for(int i = 0 ; i <rSize ; i++)
        {
            for(int j = 0 ; j < cSize ; j++)
            {
                sum = sum+a[i][j];
            }
        }

        System.out.println("The sum of all the element present is : "+sum);
    }
    
}
