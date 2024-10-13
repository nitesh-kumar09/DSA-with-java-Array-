import java.util.*;

 class ReadDisaply {
    
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter size of row of 2D array : ");
        int rowSize = obj.nextInt();
        System.out.println("Enter size of column of 2D array : ");
        int columnSize = obj.nextInt();


        int i , j , arr[][] = new int[rowSize][columnSize];

        System.out.println("Enter Element of in the array one by one : ");
        for(i = 0 ; i < rowSize ; i++)
        {
            for(j = 0  ; j < columnSize ; j++)
            {
                arr[i][j] = obj.nextInt();
            }
        }

        for(i = 0 ; i < rowSize ; i++)
        {
            for(j = 0 ; j < columnSize ; j++)
            {
                System.out.print(arr[i][j]+"["+i+", "+j+"] ");
            }
            System.out.println();
        }

    }
}
