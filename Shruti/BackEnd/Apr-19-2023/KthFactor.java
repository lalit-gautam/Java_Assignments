import java.util.*;

public class KthFactor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
            System.out.print("n = ");
            int n = sc.nextInt();
            System.out.print("k = ");
            int k = sc.nextInt();
            System.out.println(kthFactor(n, k));
        
    }
    static int kthFactor(int n,int k){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(n % i == 0){        
                list.add(i); 
            }
        }
        if(list.size() >= k){
            return binarySearch(list, k, 0, list.size()-1);
        }
        return -1;
    }
    static int binarySearch(ArrayList<Integer> list, int k, int s, int e){    
        while(s <= e ){

            int mid = s - (s - e)/2 ;

            if(mid == k-1){
                return list.get(mid);
            }else if(k-1 < mid){
                return binarySearch(list, k, s, mid-1);
            }else{
                return binarySearch(list, k, mid+1, e);
            }
        }
        return -1;
    }
}