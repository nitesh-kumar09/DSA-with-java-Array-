import java.util.Arrays;

public class AnyLocation {

    static int[] deleteElement(int arr[] , int location)
    {
        int[] newArr = new int[arr.length-1];
        int i , k=0;
        for(i = 0 ; i <arr.length  ; i++)
        {
            if(i ==  location)
                continue;
            newArr[k++] = arr[i];

        }

        return newArr ;
    }
    
    public static void main(String[] args)
    {
        int[] arr = {2 , 4 , 6 , 8};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(AnyLocation.deleteElement(arr , 0)));
    }
}
