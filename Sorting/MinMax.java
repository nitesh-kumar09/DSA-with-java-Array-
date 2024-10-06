
class MinMax {

    public static void main(String[] args) {
        int[] sort = { 5, 1, 3, 4, 2 };

        for (int i = 0; i < sort.length; i++) {
            for (int j = i+ 1; j < sort.length; j++) {
                if (sort[i] > sort[j]) {
                    int temp = sort[i];

                    sort[i] = sort[j];

                    sort[j] = temp;

                }
            }
        }

       
          System.out.println("Smallest number is : " + sort[0]);
          System.out.println("Largest number is : " + sort[sort.length-1]);
        
    }
}


