
class DeclareAndGiveSize {

    public static void main(String[] array) {

        String[] fruits; // Declare size of an array.
        fruits = new String[3]; // Allocate size to the array.

        System.out.println(fruits); // [Ljava.lang.String;@372f7a8d

        // we can also create an array of int, bollean ,float etc..
        int[] even;
        even = new int[4];

        System.out.println(even);// [I@2f92e0f4

        // In java if we don't store any value in an array then by default it store
        // default values.

        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);

        // for object it store null.
        System.out.println(even[0]);
        System.out.println(even[1]);
        System.out.println(even[2]);
        System.out.println(even[3]);

        // for int it store 0 


        // for boolean it store false
        // for float it store 0.0

    }
}
