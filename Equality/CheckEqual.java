

import java.util.*;

class CheckEqual
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of first array : ");
        int sizeOne = input.nextInt();

        System.out.println("Enter size of second array : ");
        int sizeTwo = input.nextInt();

        int[] arrOne = new int[sizeOne];
        int[] arrTwo = new int[sizeTwo];

        System.out.println("Enter element in the second array : ");
        for(int i = 0 ;i <arrOne.length ; i++)
        {
            arrOne[i] = input.nextInt();
          
        }
        System.out.println("Enter element in the second array : ");
        for(int i = 0 ;i <arrTwo.length ; i++)
        {
            arrTwo[i] = input.nextInt();
          
        }
        boolean isResult = true;
        int i=0 , j =0;

        if(arrOne.length ==  arrTwo.length)
        {
            while(i<arrOne.length)
            {
               while(j<arrTwo.length)
               {
                    
                        if(arrOne[i] !=  arrTwo[j])
                        {
                           isResult = false;
                        }
                    j++;
                    i++;
    
               }
            }
        }
    else{
        isResult = false;
    }
       if(isResult == true)
            System.out.println("All Element are equal..");
        else
            System.out.println("All Element are not equal..");

    }

}