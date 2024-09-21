import java.util.Scanner;
class OddSum {

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of an array: ")
        int size = obj.nextInt();

        int oddSum = 0 , i = 0;

        int[] odd = new int[size];

        System.out.println("Enter Element in the array : ");
        while(i<odd.length)
        {
            odd[i] = obj.nextInt();
            i++;
        }

        for(int item:odd)
        {
            if(item%2!=0){
                oddSum += item;
            }
        }
        System.out.println("The sum is :  "+oddSum);
    }
    
}
