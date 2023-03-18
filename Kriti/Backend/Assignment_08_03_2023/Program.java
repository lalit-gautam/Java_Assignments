

class Program{
    public static void main(String[] args){
        
        int[] arr = {111,222,333};
        System.out.println(palinArray(arr,arr.length));
        String st = "123Abcdksjdfn9322ndv00";
        System.out.println(removeCharacters(st));
    }

//https://practice.geeksforgeeks.org/problems/remove-characters-from-alphanumeric-string0648/1?page=2&difficulty[]=-2&sortBy=difficulty
 `  static String removeCharacters(String S) {
        // code here
        String num = "";

        for(int i=0;i<S.length() ; i++){
            try{
                num = num + Integer.parseInt(Character.toString(S.charAt(i)));
            }catch(Exception e){

            }

        }
        return num;
    }

// https://practice.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=1&difficulty[]=-2&sortBy=difficulty
    public static int palinArray(int[] a, int n)
           {
                  
                  for(int num : a){
                      if(!isPrime(num)){
                          return 0;
                      }
                  }
                  return 1;
           }
           
    public static boolean isPrime(int num){
        int temp = num;
        int num2=0;
        while(temp>0){
            num2 = (num2*10) + temp%10;
            temp= temp/10;
        }
        if(num == num2){
            return true;
        }
        return false;
    }
}