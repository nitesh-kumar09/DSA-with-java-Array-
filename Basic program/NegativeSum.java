 import java.util.Scanner;

class NegativeSum {

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the size of an array : ");
        int size = obj.nextInt();

        int[] negative = new int[size];

        System.out.println("Enter element in the array : ");

        int i = 0; 

        // Take element from the user.
        while(i<negative.length)
        {
            negative[i] = obj.nextInt();
            i++;
        }

        // Calculating sum of negative number.
        int sum = 0;
        for(int item:negative)
        {
            if(item<0){
                sum +=item;
            }
        }
        System.out.println("The sum of negative number is : "+sum);
    }
    
}
