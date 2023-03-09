
import java.util.ArrayList;

public class FindSubsequence {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3};
        ArrayList<Integer> path = new ArrayList<>();
        findSub(arr , 0  , path);
    }
    public static void findSub(Integer[] arr , int index , ArrayList<Integer> path){
        if(index == arr.length ){
            if(path.size()>0) {
                System.out.println(path);
            }
        }
        else{
            findSub(arr , index+1 , path);
            path.add(arr[index]);
            findSub(arr, index+1 , path);
            path.remove(path.size()-1);

        }
        return;
    }
}
