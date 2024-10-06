import java.util.Scanner;
import java.util.Arrays;
class SecMinMax {

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter size of an array : ");
        int size = obj.nextInt();

        System.out.println("Enter elements of an array : ");

        int[] sort = new int[size];

        for(int i = 0 ; i < sort.length ; i++)
        {
            sort[i] = obj.nextInt();
        }

        Arrays.sort(sort);

       System.out.println("Second smallest number is : " +sort[1]);

       System.out.println("Second larget number is : " + sort[sort.length-2]);



    }
    
}
