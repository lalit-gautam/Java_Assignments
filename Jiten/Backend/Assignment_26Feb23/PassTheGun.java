package Assignment_26Feb23;

import java.util.Arrays;

public class PassTheGun {
    public static void main(String[] args) {
        Integer[] arr = {0,1,2,3,4,5,6,7,8,9};
        Integer pointer = 0;
//        System.out.println(Arrays.toString(removeIndex(arr, 1)));
        System.out.println(findTheAlive(arr , pointer));
    }
    public static int findTheAlive(Integer[] arr , Integer pointer)
    {
        while(arr.length>1){
            pointer = pointer+1;
//            System.out.println(Arrays.toString(arr));
//            System.out.println(pointer +"  " +arr.length);
            if(pointer >= arr.length){
            	pointer = arr.length%2;
                arr= removeIndex(arr , pointer);
            }
            else{
                arr = removeIndex(arr, pointer);
            }


        }
        return arr[0];
    }
    public static Integer[] removeIndex(Integer[] arr , int index){
        Integer[] ans = new Integer[arr.length-1];
        for(int i=0;i<index;i++){
            ans[i] = arr[i];
        }
        for(int i=index+1 ; i<arr.length;i++){
            ans[i-1] = arr[i];
        }
        System.out.println(Arrays.toString(arr) +" pointer : "+arr[index]);
        return ans;
    }




}