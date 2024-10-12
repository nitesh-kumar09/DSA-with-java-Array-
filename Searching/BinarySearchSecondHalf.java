import java.util.Scanner;

public class BinarySearchSecondHalf {
    
    
    public static int binarySearch(int arr[] , int lower , int upper , int key)
    {
        while(lower <= upper)
        {
            int mid = (lower+upper)/2;

            if(arr[mid] == key)
                return mid;
            else if(arr[mid] < key )
                return binarySearch(arr , (mid+1) , upper , key );
            else
                return binarySearch(arr , lower , (mid-1) , key);

        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of an arrays : ");
        int size = input.nextInt();

        int [] arr = new int[size];

        // Inputing element in the array from the user.
        System.out.println("Enter Elmenent in the array : ");
        for(int i = 0 ; i <arr.length ; i++)
        {
            arr[i] = input.nextInt();
        }
        // sorting the array in ASC...

        for(int i = 0 ; i <arr.length ; i++)
        {
            for(int j = i+1 ;j < arr.length ;j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Enter Element to search : ");
        int key = input.nextInt();

        System.out.println("Element found at index : "+(BinarySearchSecondHalf.binarySearch(arr , (arr.length)/2 , (arr.length-1) , key)));

    }
}
