import java.util.Scanner;

class PostiveSum {

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the size of an array : ");
        int size = obj.nextInt();

        int[] positive = new int[size];

        System.out.println("Enter element in the array : ");

        int i = 0;

        // Take element from the user.
        while(i<positive.length)
        {
            positive[i] = obj.nextInt();
            i++;
        }

        // Calculating sum of positive number.
        int sum = 0;
        for(int item:positive)
        {
            if(item>0){
                sum +=item;
            }
        }
        System.out.println("The sum of positive number is : "+sum);
    }
    
}
