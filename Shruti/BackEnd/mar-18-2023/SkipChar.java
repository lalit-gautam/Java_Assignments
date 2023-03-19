public class SkipChar{
    public static void main(String[] args) {
        skipChar("", "baccad"); //skip character a
        System.out.println(skipChar2("baccadh"));
    }
    
    //without chaning the original string & adding the modified string into 'p' empty string
    static void skipChar(String processedString, String unprocessedString){
        if(unprocessedString.isEmpty()){
            System.out.println(processedString);
            return;
        }

        char ch = unprocessedString.charAt(0);

        if(ch == 'a'){
            skipChar(processedString, unprocessedString.substring(1));
        }else{
            skipChar( processedString + ch, unprocessedString.substring(1));
        }
    }
    //By modifying the original string
    static String skipChar2(String processedString){
        if(processedString.isEmpty()){
            return "";
        }

        char ch = processedString.charAt(0);

        if(ch == 'a'){
            return skipChar2( processedString.substring(1));
        }else{
            return ch + skipChar2(processedString.substring(1));
        }
    }
}

