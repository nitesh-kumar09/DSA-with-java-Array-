import java.util.Scanner;
import java.util.Arrays;

class BinarySearchLoweHigh {
    

    static int binarySearch(int arr[] , int low , int end , int key)
    {

        while(low <= end)
        {
            int mid = (low+end)/2;

            if(arr[mid] == key)
            {
                return mid;
            }
            else if(arr[mid] < key )
            {
                return binarySearch(arr , (mid+1) , end , key);
            }
            else
            {
                return binarySearch(arr , (mid-1) , end , key);
            }
        }

        return -1;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of an array : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        int i = 0;
        System.out.println("Enter element in the array : ");

        while(i<arr.length)
        {
            arr[i] = input.nextInt();
            i++;
        }
        Arrays.sort(arr);

        System.out.println("Enter starting location : ");
        int low = input.nextInt();

        System.out.println("Enter End location  : ");
        int end = input.nextInt();

        System.out.println("Enter elemenet to search : ");
        int key = input.nextInt();

        int result = BinarySearchLoweHigh.binarySearch(arr , low , (end-1) , key );

        System.out.println("Element found at index : "+result);
    }
}
