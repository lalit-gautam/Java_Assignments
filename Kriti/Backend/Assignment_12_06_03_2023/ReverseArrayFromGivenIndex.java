import java.util.ArrayList;
import java.util.Arrays;


class ReverseArrayFromGivenIndex{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        int m = 6;
        reverseArray(arr , m);
        System.out.println(arr);
    }

    //https://www.codingninjas.com/codestudio/problems/reverse-the-array_1262298
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        if(m>=arr.size()){
            return;
        }
        int e = arr.size()-1;
        int s = m ;
        while(s<e){
            int temp = arr.get(s);
            arr.set(s,arr.get(e));
            arr.set(e,temp);
            s++;
            e--;
        }
    }
}