
import java.util.Scanner;

class SortAsc {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking size from user.
        System.out.println("Enter size of an array : ");
        int size = input.nextInt();

        int[] sort = new int[size];

        // input element from the user.
        System.out.println("Enter " + size + " Element in the array : ");
        for (int i = 0; i < size; i++) {
            sort[i] = input.nextInt();
        }

        // Array before sorting.
        System.out.println("**********Array before sort********");
        for (int i = 0; i < size; i++) {
            System.out.print(sort[i]+" ");
        }

        // Sort the array.
        for(int i = 0 ;i<size; i++)
        {
            for(int j=i+1;j<size;j++){
                if(sort[i] > sort[j])
                {
                    int temp = sort[i];
                    sort[i] = sort[j];
                    sort[j] = temp;
                }
            }
        }

        // Array After sorting.
        System.out.println("\n**********Array after sort********");
        for (int i = 0; i < size; i++) {
            System.out.print(sort[i]+" ");
        }
    }
}