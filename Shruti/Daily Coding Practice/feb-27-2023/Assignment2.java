public class Vowels {
    public static void main(String[] args) {
      
      // check whether a string contains a vowel or not
        String str = new String("snypo");
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u') {
                System.out.println(true);
                flag = true;
                break;
            }    
        }
        if(!flag){
            System.out.println("There is no vowel present in the string");
        }
        
        
    }
}
