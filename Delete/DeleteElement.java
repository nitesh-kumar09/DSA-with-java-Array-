    import java.util.Arrays;

public class DeleteElement {

    static int[] deleteElement(int arr[] , int element)
    {

        
        int i , k=0 , index=-1;
        for( i = 0 ; i<arr.length ; i++)
        {
            if(arr[i] == element)
            {
                index =i;
                break;
            }
        }

        int[] newArr = new int[arr.length-1];

        if(index!=-1)
        {
            for(i = 0 ; i <arr.length  ; i++)
            {
                if(i ==  index)
                    continue;
                newArr[k++] = arr[i];
    
            }
            return  newArr;

        }
       
        

        return  arr;
    }
    
    public static void main(String[] args)
    {
        int[] arr = {2 , 4 , 6 , 8};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(DeleteElement.deleteElement(arr , 4)));
    }
}

