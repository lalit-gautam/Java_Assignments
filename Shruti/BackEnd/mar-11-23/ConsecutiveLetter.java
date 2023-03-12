
public class ConsecutiveLetter {
    public static void main(String[] args) {
        String str = "letter";

        String[] strArr = str.split("");
        System.out.println(identicalLetter(strArr));

    }
    // Write a Java program to check whether there are two consecutive (following each other continuously.), identical letters in a given string.
    static boolean identicalLetter(String[] strArr){
        boolean flag = false;
        for (int i = 0; i < strArr.length - 1; i++) {
            
            if(strArr[i].equals(strArr[i+1])){
                flag = true;
                break;
            }
            
        }
        return flag;
    }
}
