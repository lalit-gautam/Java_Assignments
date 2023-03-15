import java.util.Arrays;

//Find the index range of array which 3 consecutive elements have the highest sum

public class ConsecutiveSum {
    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 3, 7, 3, 9, 2, 8};
        int[] newArr;
        if(arr.length % 3 ==0){
            newArr = new int[arr.length / 3];
        } else {
            newArr = new int[(arr.length / 3) + 1];
        }
        sumOfconsecutive(arr, newArr, 0, 3, 0);
        System.out.println(Arrays.toString(newArr));
        System.out.println(highestSum(newArr));
        int index = highestSum(newArr);
        findIndex(index);

    }
    static void sumOfconsecutive(int[] arr, int[] newArr, int start, int end, int index){
        if(start == arr.length){
            return;
        }
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        newArr[index] = sum;

        sumOfconsecutive(arr, newArr, end, end + 3, index + 1);
    }
    static int highestSum(int[] newArr){
        int highest = newArr[0];
        int highestIndex = 0;
        for (int i = 0; i < newArr.length; i++) {           
            if(newArr[i] > highest){
                highest = newArr[i];
                highestIndex = i;
            }
        }
        return highestIndex;
    }

    static void findIndex(int index){
        int start = 3 * index;
        int end = 3 * index + 2;

        System.out.println("("+ start +", "+ end +")");
    }
}
