
public class GetChar {
    public static void main(String[] args) {
        String str = "Shruti";
        char target = 's';
        getCharFromString(target, str);
        System.out.println(getCharFromString(target, str));
    }
    //To get a Character from the given String

    static char getCharFromString(char target, String processed){
        if(processed.isEmpty()){
            System.out.println("There is no target char in the string");
            return ' ';
        }

        char ch = processed.charAt(0);

        if( ch == target || Character.toUpperCase(ch) == target || Character.toLowerCase(ch) == target){
            return ch;
        } else {
            return getCharFromString(target, processed.substring(1));
        }
        
    }
}
