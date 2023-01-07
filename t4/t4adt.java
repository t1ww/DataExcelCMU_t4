/*
 * @author Narongchai Rongthong
 * 652115013
 * written on 06/01/2023
 * https://github.com/t1ww
 */


public class t4adt {
    public static void main(String[] args) {
        // iterate each row , print A 10 times with 2 spaces
        // init the array
        int size = 10;
        if(size%2 == 0)size++;
        String arr[][] = new String[size][size]; // array declaration
        // put A into every elements in the arry
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = "0";
            }
        }

        //use the array with for loop
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i == j){
                    System.out.printf("%3s", count);
                }else{
                    System.out.printf("%3s", arr[i][j]);
                }
            }
            count++;
            System.out.println();
        }

    }
}

    /*ouput example:

     * A  A  A  A  A  A  A  A  A  A
     * A  A  A  A  A  A  A  A  A  A
     * A  A  A  A  A  A  A  A  A  A
     * A  A  A  A  A  A  A  A  A  A
     * A  A  A  A  A  A  A  A  A  A
     * A  A  A  A  A  A  A  A  A  A
     * A  A  A  A  A  A  A  A  A  A
     * A  A  A  A  A  A  A  A  A  A
     * A  A  A  A  A  A  A  A  A  A
     * 
     */