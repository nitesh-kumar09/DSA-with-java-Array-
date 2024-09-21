// WAP to take first input as size of an array and then tell user to input 5 Even number.
import java.util.Scanner;

public class Even {

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter size of an array : ");
        int size = obj.nextInt();

        int[] even = new int[size];

        System.out.println("Enter 5 even number : ");
        int i = 0;

        while(i>even.length)
        {
            even[i] = obj.nextInt();
            i++;
        }

        for(int item:even){
            System.out.println(item);
        }
    }

}