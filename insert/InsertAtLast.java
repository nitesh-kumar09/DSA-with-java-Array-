
import java.util.*;


public class InsertAtLast
{
    static int[] insertAtLast(int arr[] , int item)
    {
        int[] newArr = new int[arr.length+1];

        int i = 0;
        for(i = 0 ; i <arr.length ; i++)
        {
            newArr[i] = arr[i];
        }
        newArr[i] = item;

        return newArr;
    }
    public static void main(String[] args)
    {
        int[] arr = {5 , 10 , 15 , 20};
        System.out.println(Arrays.toString(arr));
        System.out.println((Arrays.toString(InsertAtLast.insertAtLast(arr , 25))));
    }
}
