
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {


    public static int binarySearch(int arr[] , int key){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;

        while(low <= high)
        {
            mid = (low+high)/2;

            if(arr[mid] == key)
            {
                return mid;
            }
            else if(arr[mid] < key)
            {
                low = mid+1;
            }
            else
            {
                high  = mid-1;

            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        @SuppressWarnings({ "resource" })
        Scanner input = new Scanner(System.in);

        System.out.println("Enter array size : ");
        int size = input.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array Element : ");
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter element that you want to search : ");
        int key = input.nextInt();

        Arrays.sort(arr);

    int result = BinarySearch.binarySearch(arr , key);

    if(result == -1)
    {
        System.out.println("Element not found : "+result);
    }
    else{
        System.out.println("Element found at index : "+result);
    }


        

    }
    
}
