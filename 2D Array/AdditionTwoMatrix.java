import java.util.*;
 class AdditionTwoMatrix {
    
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Row size of matrix A..");
        int rA = obj.nextInt();
        System.out.println("Enter Column size of matrix A..");
        int cA = obj.nextInt();
        System.out.println("Enter Row size of matrix B..");
        int rB = obj.nextInt();
        System.out.println("Enter Row size of matrix B..");
        int cB = obj.nextInt();

        

       
        if(rA == rB &&  cA == cB)
        {
            int i,j, arrOne[][] = new int[rA][cA];
            int arrTwo[][] = new int[rB][cB];
            int arrThree[][] = new int[rB][cB];

        System.out.println("Enter Element of matrix A one by one : ");
        for(i = 0 ; i < rA ; i++)
        {
            for(j = 0 ; j < cA ; j++)
            {
                arrOne[i][j] = obj.nextInt();
            }
        }
        System.out.println("Enter Element of matrix B one by one : ");
        for(i = 0 ; i < rB ; i++)
        {
            for(j = 0 ; j < cB ; j++)
            {
                arrTwo[i][j] = obj.nextInt();
            }
        }
        // addition logic
        for(i = 0 ; i < rA ; i++)
        {
            for(j = 0 ; j < cA ; j++)
            {
                arrThree[i][j] = arrOne[i][j] + arrTwo[i][j];
            }
        }
        System.out.println();
        // Display all the matrix
        for(i = 0 ; i < rA ; i++)
        {
            for(j = 0 ; j < cA ; j++)
            {
                System.out.print(arrOne[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(i = 0 ; i < rB ; i++)
        {
            for(j = 0 ; j < cB ; j++)
            {
                System.out.print(arrTwo[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(i = 0 ; i < rB ; i++)
        {
            for(j = 0 ; j < cB ; j++)
            {
                System.out.print(arrThree[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        }
        else
            System.out.println("Matrix addition is not possible..");
       
        
    }
}
