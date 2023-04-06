import java.util.Arrays;

public class LookAndSay {
    public static void main(String[] args) {
        lookAndSay();
    }
    static void lookAndSay(){
        String arr[] = new String[10];
        arr[0] = "1";
        for (int i = 0; i < 9 ; i++) {
            String[] strArr = arr[i].split("");
            int count = 0;
            String str = "";
            String str2 = "";
            for (int j = 0; j <= strArr.length - 1; j++) {  
                if( j < strArr.length - 1)  {                         
                    if(strArr[j].equals(strArr[j+1])){
                        count = 1;
                        count ++;
                        str2 = "" + count + ""+ strArr[j];  
                        str = str.concat(str2);                  
                    }
                } else {
                    count = 0;
                    count++; 
                    str2 = "" + count + ""+ strArr[j]; 
                    str = str.concat(str2); 
                }   
            }
            arr[i+1] = str;         
        }
        System.out.println(Arrays.toString(arr));
    }

}
