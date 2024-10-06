import java.util.Scanner;

class DivisibleSum {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int size = input.nextInt();

        int[] divisible = new int[size];

        System.out.println("Enter the elements of an array : ");
        for(int i = 0; i<divisible.length;i++){
            divisible[i] = input.nextInt();
        }
        int sum =0;
        for(int i = 0; i<divisible.length;i++){
            if(divisible[i] % 2 == 0 && divisible[i] % 3 ==0){
                sum += divisible[i];
            }
        }
        System.out.println("The sum is : "+sum);
        
    }
}
