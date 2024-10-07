
import java.util.Scanner;

class LinearSearch
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter Element in the array : ");
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter 'Element' to Search : ");
        int key = input.nextInt();

        int index = -1;
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(key == arr[i])
            {
                index = i+1;
            }
        }

        if(index == -1)
            System.out.println("Oh! Element not found : ");
        else
            System.out.println("Yah! Element found and it's number is : "+index);
    }
}