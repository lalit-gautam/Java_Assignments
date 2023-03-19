package practice20_3_3_2023;

public class IndexOfElementsHavingEvenDigits {
    public static void main(String[] args) {

        // Index of elements having even number of digits in the array
        int [] arr = {23, 2, 452, 4567};
        evenDigitsIndex(arr);

    }

    public static void evenDigitsIndex(int [] arr) {

        int length_of_array = arr.length;

        for (int i = 0; i < length_of_array; i++) {

            if ((arr[i] > 9 && arr[i] < 100) || (arr[i] > 999 && arr[i] < 10000)) {
                System.out.println("Index of elements having even no. digits : " + i);
                System.out.println("The element is : " + arr[i]);
            }
        }
    }
}
