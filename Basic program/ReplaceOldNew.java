import java.util.Scanner;

class ReplaceOldNew {
    
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of an Array : ");
        int size = obj.nextInt();

        int[] num = new int[size];

        System.out.println("Enter "+size+" Element in the array : ");
        for(int i=0;i<num.length;i++){
            num[i] = obj.nextInt();
        }


        System.out.println("Enter old Element : ");
        int old = obj.nextInt();
        System.out.println("Enter new Element : ");
        int newe= obj.nextInt();

       for(int i = 0;i<num.length;i++){
            if(num[i] == old)
            {
                num[i] = newe;
            }
       }
       for(int i = 0;i<num.length;i++){
       System.out.print(num[i]+" ");
   }
    }
}
