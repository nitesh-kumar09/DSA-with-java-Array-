// program to read and calculate sum of all the elements present in the matrix.

import java.util.*;



class Transpose {

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of row : ");
        int rSize = obj.nextInt();

        System.out.println("Enter size of column : ");
        int cSize = obj.nextInt();

        int[][] a = new int[rSize][cSize];
        int[][] b = new int[rSize][cSize];

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
            
            for(int j = 0 ; j < cSize ; j++)
            {
                b[i][j] = a[j][i]; //Transpose
                
            }
           
        }
        System.out.println();
        for(int i = 0 ; i <rSize ; i++)
        {
            
            for(int j = 0 ; j < cSize ; j++)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
           
        }

        
    }
    
}
