public class SkipAstring {
    public static void main(String[] args) {
        System.out.println(skipString("bapplefg"));
        System.out.println(skipAppNotApple("bappllefg"));
    }
    static String skipString(String p){
        if(p.isEmpty()){
            return "";  
        }
        char ch = p.charAt(0);

        if(p.startsWith("apple")){
            return skipString(p.substring(5));
        }else{
            return ch + skipString(p.substring(1));
        }
    }
    static String skipAppNotApple(String p){
        if(p.isEmpty()){
            return "";  
        }
        char ch = p.charAt(0);

        if(p.startsWith("app") && !p.startsWith("apple")){
            return skipAppNotApple(p.substring(3));
        }else{
            return ch + skipAppNotApple(p.substring(1));
        }
    }
}

