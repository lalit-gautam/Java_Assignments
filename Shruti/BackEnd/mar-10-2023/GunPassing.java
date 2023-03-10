public class GunPassing {
    public static void main(String[] args) {
        int[] arr = {3, 4, 9, 8, 2, 1, 8};
        System.out.println(gunPassing(arr, 0));

    }
    static int gunPassing(int[]arr, int gunHolder){
        if(arr.length % 2 == 0){
            if(gunHolder == arr.length - 2){
                return arr[gunHolder];
            }
        } else {
            if(gunHolder == arr.length - 1 ){
                return arr[gunHolder];
            }
        }
        
        if(gunHolder % 2 == 0){
            int killAndPass = gunHolder + 2;
            return gunPassing(arr, killAndPass);
        } else {
            return gunPassing(arr, gunHolder);
        }
        
    }
}
