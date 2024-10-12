
import java.util.*;

public class InsertAtFirst {
    
    static int[] insertbegin(int arr[] , int element)
    {
        int[] newArr = new int[arr.length+1];
        int i ;
         newArr[0] = element;

        for(i = 0 ; i <arr.length ; i++)
        {
            newArr[i+1] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args)
    {
        int arr[] = {10 , 15 , 20 , 25};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(InsertAtFirst.insertbegin(arr , 5)));
    }
}
