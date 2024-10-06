// WAP to find 1st min, 2nd min, 1st max, 2nd max ....... element of an array.

import java.util.Scanner;
import java.util.Arrays;

class MinMaxMinMax {

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter size of an array : ");
        int size = obj.nextInt();

        System.out.println("Enter elements of an array : ");

        int[] arr = new int[size];

        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = obj.nextInt();
        }

        Arrays.sort(arr);

        int  Min = 0;
        int Max = arr.length-1;
        while(Min<=Max)
        {
            System.out.print(arr[Min]+ " "+ arr[Max]+ " ");
            Min++;
            Max--;
        }
    }

}
