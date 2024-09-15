package bank;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray1 {

    public static void main(String[] args) {

        int[] getReversed = {1, 2, 3, 4, 5};
        int [] getReturnedList = reverseNum(getReversed);
        System.out.println(Arrays.toString(getReturnedList));
    }


        public static int[] reverseNum(int[] list){
            int[] reversedArray = new int[list.length];
            int number = 0;

            for(int index=0; index < list.length; index++){
              number = list.length - index - 1;
              reversedArray[number] = list[index];
              }
              return reversedArray;

        }

}





