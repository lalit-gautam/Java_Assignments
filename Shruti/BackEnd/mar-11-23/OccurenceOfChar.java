import java.util.Arrays;
import java.util.List;

public class OccurenceOfChar {
    public static void main(String[] args) {
        String str = "Programming";
        String[] strArr = str.split("");

        List<String> list = Arrays.asList(strArr);
        System.out.println(list);
        charOccurence(list);
    }
    //Java Program to Find Occurrence of Each Character
    static void charOccurence(List<String> list){
        for (int i = 0; i < list.size(); i++) {
        int count = 1;
            for (int j = i+1; j < list.size(); j++) {
                
                if(list.get(i).equals(list.get(j))){
                    count++;
                    list.remove(j);
                } 
            }

            System.out.println("The occurence of " + list.get(i) + " is "+ count);
        }
    }
}
