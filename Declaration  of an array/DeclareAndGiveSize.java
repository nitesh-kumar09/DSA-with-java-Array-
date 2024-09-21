

 class DeclareAndGiveSize {
    
    public static void main(String[] array){
        
        String[] fruits; //Declare size of an array.
        fruits = new String[3]; //Allocate size to the array.

        System.out.println(fruits); //[Ljava.lang.String;@372f7a8d

        // we can also create an array of int, bollean ,float etc..
        int[] even;
        even = new int[4];

        System.out.println(even);//[I@2f92e0f4
        
    }
}
