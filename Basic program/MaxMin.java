
class MaxMin
{
    public static void main(String[] args)
    {
        int[] num = {1,9,4,9,7,8};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max = num[i];
            }
            if(num[i]<min){
                min = num[i];
                
            }
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
        // System.out.println("Max : "+Integer.MAX_VALUE);
        // System.out.println("Min : "+Integer.MIN_VALUE);
    }
}