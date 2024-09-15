package bank;

import java.util.Arrays;

public class largestSmallestNum {

    public static void main(String[] args) {

        int [] numOfArray = {2, 3, 6, 7, 8};
        int [] largestSmallestNum = getNumbers(numOfArray);
        System.out.println(Arrays.toString(largestSmallestNum));

    }



    public static int[] getNumbers(int[] list) {
        int largest = list [0];
        int smallest = list [0];

       // for (int index = 0; index < list.length; index++) {
        for(int index : list){
            if (index > largest) {
                largest = index;
            }

            if (index < smallest) {
                smallest = index;
            }


        }
        return new int[]{largest,smallest};
}



}
