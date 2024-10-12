
import java.util.*;

public class InsertAtAnyLocation {
    
    static int[] inserAtAnyLocation(int arr[] , int element , int location)
    {
        int[] newArr = new int[arr.length+1];
        int i ,k =0;
         
        for(i = 0 ; i<location ; i++)
        {
         newArr[k++] = arr[i];
        }
        newArr[k++] = element;

        for(i = location ; i<arr.length ; i++)
        {
         newArr[k++] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args)
    {
        int arr[] = {10 , 15 , 20 , 25};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(InsertAtAnyLocation.inserAtAnyLocation(arr , 5 , 0)));
        System.out.println(Arrays.toString(InsertAtAnyLocation.inserAtAnyLocation(arr , 5 , 1)));
        System.out.println(Arrays.toString(InsertAtAnyLocation.inserAtAnyLocation(arr , 5 , 2)));
        System.out.println(Arrays.toString(InsertAtAnyLocation.inserAtAnyLocation(arr , 5 , 3)));
        System.out.println(Arrays.toString(InsertAtAnyLocation.inserAtAnyLocation(arr , 5 , 4)));
    }
}
