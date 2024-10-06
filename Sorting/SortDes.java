import java.util.Scanner;

public class SortDes {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of an array : ");
        int size = input.nextInt();

        int[] sort = new int[size];

        System.out.println("Enter the Element of an array : ");
        for(int i = 0 ; i < sort.length ; i++)
        {
            sort[i] =  input.nextInt();
        }

        for(int i = 0 ; i < sort.length ; i++)
        {
            for(int j = i+1 ; j<sort.length ; j++)
            {
                if(sort[i] < sort[j])
                {
                    int temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;
                }
            }
        }

        for(int i = 0 ; i <sort.length ; i++)
        {
            System.out.print(sort[i]+" ");
        }

    }
    
}
