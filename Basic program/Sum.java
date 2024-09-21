import java.util.Scanner;
class Sum {
    
    public static void main(String[] args)
    {
        int i = 0 ,sumOfNum = 0;
        Scanner obj = new Scanner(System.in);

        // take size from user.
        System.out.println("Enter size of an array: ");
        int size = obj.nextInt();

        int[] sum = new int[size];
        
        // Take element from user.
       
        
        System.out.println("Enter Element : ");
        while(i<sum.length){
            sum[i] = obj.nextInt();
            i++;
        }
        
        for(i=0;i<sum.length;i++){
            sumOfNum +=sum[i];
        }

        System.out.println("The sum of element present in array is : "+sumOfNum);
    }
}
