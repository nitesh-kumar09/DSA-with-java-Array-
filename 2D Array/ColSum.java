// program to read and calculate sum of all the elements present in the matrix.

import java.util.*;



class ColSum {

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

        
        for(int i = 0 ; i <rSize ; i++)
        {
            int sum = 0 ;
            for(int j = 0 ; j < cSize ; j++)
            {
                sum = sum+a[j][i]; //Transpose and then add.
                
            }
            System.out.println("The sum of all the element present "+ i +" col is : "  +sum);
        }

        
    }
    
}
