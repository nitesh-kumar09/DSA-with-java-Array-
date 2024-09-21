 import java.util.Scanner;
class EvenSum {

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = obj.nextInt();

        int evenSum = 0 , i = 0;

        int[] even = new int[size];

        System.out.println("Enter Element in the array : ");
        while(i<even.length)
        {
            even[i] = obj.nextInt();
            i++;
        }

        for(int item:even)
        {
            if(item%2==0){
                evenSum += item;
            }
        }
        System.out.println("The sum is :  "+evenSum);
    }
    
}
