package Practice_39_1_4_2023;

public class Program2 {
    public static void main(String[] args) {

        // program to find the least occurring element in the array
        int [] arr = {34, 5, 6, 89, 4, 35, 5, 89};
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

