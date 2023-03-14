import java.util.Arrays;
import java.util.List;

public class OccurenceOfChar {
    public static void main(String[] args) {
        String str = "Programming";
        String [] strArr = str.split("");
        
        charOccurence(strArr);
    }
    //Java Program to Find Occurrence of Each Character
    static void charOccurence(String[]strArr){
        for (int i = 0; i < strArr.length; i++) {
        int count = 1;
            for (int j = i+1; j < strArr.length; j++) {
                
                if(strArr[i].equals(strArr[j])){
                    count++;
                    if( j == strArr.length-1){
                        break;
                    } else{
                        for (int k = j; k < strArr.length - 1; k++) {
                            strArr[k] = strArr[k+1];
                        }
                        break;
                    }
                } 
            }

            System.out.println("The occurence of " + strArr[i] + " is "+ count);
        }
    }
}
