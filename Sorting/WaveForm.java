// print all the element in the wave form:
// 1 2 3 4 5
// output: - 1 3 2 5 4


import java.util.Scanner;
import java.util.Arrays;

class WaveForm {
    
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");

        int size = obj.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array : ");

        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = obj.nextInt();
        }

        Arrays.sort(arr);

       int i = 1;
       int j = i+1;
       
       while(j<size && i<size)
      {
            int temp =  arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i+=2;
            j+=2;
       }

       for(int k = 0; k < arr.length ; k++)
       {
        System.out.print(arr[k]+" ");
       }
    }

}
