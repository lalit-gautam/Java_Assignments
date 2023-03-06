
class Program {
    public static void main(String[] args) {
        System.out.println(toCamelCase("hello worl d"));
        System.out.println(getRevString("-123"));
    }
    //camelCase a string
    public static String toCamelCase(String sentense){
        // words = words.trim();
        String[] words = sentense.split(" ");
        String camelCase = words[0].toLowerCase();
        if(words.length < 1){
            return sentense;
        }
        for(int i=1;i<words.length;i++){
            camelCase =camelCase +  Character.toString(words[i].charAt(0)).toUpperCase() + words[i].substring(1).toLowerCase();
        }


        return camelCase;
    }

    //Reverse a negative or positive string number 
    public static String getRevString(String num){
        Integer n = Integer.parseInt(num);
        System.out.println(n);
        Integer temp = n;
        Integer rev = 0;
        while(temp != 0){
            rev = rev*10 + temp%10;
            temp = temp/10;
        }
        return rev.toString();
    }
    
    
}
