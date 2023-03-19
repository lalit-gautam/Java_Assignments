package Practice26_19_3_2023;

import org.w3c.dom.ls.LSOutput;

public class Practice1 {
    public static void main(String[] args) {

        // program to find the least occurring number in the array
        int [] arr = {2, 45, 3, 45, 3, 4, 4, 3, 45};
        leastOccurringNumber(arr);
    }

    public static void leastOccurringNumber(int [] arr){

        int count = 0;
        int minCount = Integer.MAX_VALUE;
        int leastElement = -1;
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if(count < minCount){
                minCount = count;
                leastElement = arr[i];
            }
        }
        System.out.println(leastElement);
    }
}
