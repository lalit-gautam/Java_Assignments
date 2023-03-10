
public class EvenLengthWords {
    public static void main(String[] args) {
        String[] strArr = {"Sony", "Shruti", "Sonu", "Sudhanshu", "krishna"};

        evenLengthWords(strArr);

    }

    // print even length words
    static void evenLengthWords(String[] strArr){
        for(String str : strArr){
            if(str.length() % 2 == 0){
                System.out.println(str);
            } 
        }
    }
}
