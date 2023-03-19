import java.util.ArrayList;

public class SubStringOfAString {
        public static void main(String[] args) {
            ArrayList<String> w = generate("abcde");
            System.out.println(w);
            System.out.println(Math.pow(2, 5)-1);
        }
    
        public static ArrayList<String> generate(String word) {
            if (word.length() == 1) {
                ArrayList<String> list = new ArrayList<>();
                list.add(word);
                return list;
            }
            ArrayList<String> list = new ArrayList<>();
            list.add(word);
            
            ArrayList<String> left = generate(word.substring(0, word.length()-1)); 
            ArrayList<String> right = generate(word.substring(1, word.length())); 

            left.addAll(right);
            list.addAll(left);

            return list;
        }
}
