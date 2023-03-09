
import java.util.Arrays;

public class NumberMatriix {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(getRowValue(6)));
        printPattern(6);
        printTringle(7);
    }


    public static void printTringle(int num){
        int count = 1;
        for(int i=1;i<=num;i++){
            if(i%2 !=0){
                for(int j=0;j<i;j++){
                    System.out.print(count+" ");
                    count++;
                }
            }
            else{
                for(int j=count+i-1;j>=count;j--){
                    System.out.print(j+" ");
                }
                count += i;
            }
            System.out.println();
        }
    }

    public static  void printPattern(int num){
        int[] arr = getRowValue(num);
        for(int i=0;i<num;i++){
            for(int j=(arr[i]*num)+1;j<=(arr[i]*num)+num;j++){
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }

    public static int[] getRowValue(int num){
        int[] arr= new int[num];
        int start = 0;
        int end = num-1;
        for(int i=0;i<num;i++){
            if(i%2==0){
                arr[start] = i;
                start++;
            }else{
                arr[end] = i;
                end--;
            }
        }
        return arr;
    }
}
