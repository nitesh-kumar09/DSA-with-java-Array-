import java.util.Scanner;
import java.util.Arrays;
class BinarySearchRecursion {

    static int binarySearch(int arr[] , int lower, int higher , int key)
    {
        while(lower <= higher)
        {
            int mid = (lower+higher)/2;

            if(arr[mid] ==  key)
            {
                return mid;
            }
            else if(arr[mid] < key){
                return binarySearch(arr , mid+1 , higher , key );
            }
            else{
                return binarySearch(arr , lower , mid-1 , key);
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of array : ");

        int size = obj.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array Element : ");
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = obj.nextInt();
        }

        System.out.println("Enter size of an arrays : ");
        int key = obj.nextInt();

        int result = BinarySearchRecursion.binarySearch(arr , 0 , arr.length-1 , key);

        System.out.println("Element found at index : "+result);


    }
    
}
