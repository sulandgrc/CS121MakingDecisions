public class MakeDecisions {

    public static void main(String[] args) {
        // throughly test evenOdd
        // call the method with an even number
        evenOdd(4);  // expect EVEN
        
        //call the method with an odd number
        evenOdd(5);  // expect ODD

        //call the method with negative methods
        evenOdd(-8);
        evenOdd(-5);


    } // end of main

    /**
     * This method prints EVEN if num is even, otherwise odd
     * @param num - whole number
     */
    public static void evenOdd(int num){
        // if even num
        if (num % 2 == 0){
            //print EVEN
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

    } // end of evenOdd

} // end of class