import java.util.ArrayList;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String S1 = "ADBC", S2 = "ACDBC";
        int n = 4, m = 5;
        ArrayList<String> Sp1 = subSequence(S1);
        System.out.println( Math.pow(2, n) );
        System.out.println(Sp1);
        ArrayList<String> Sp2 = subSequence(S2);
        System.out.println(Sp2);

        ArrayList<String> CS = commonSubstring(Sp1, Sp2, n, m);
        System.out.println(CS);

        System.out.println(longestSubstring(CS));
    }

    static int longestSubstring(ArrayList<String> Cs) {
        int maxLength = 0;
        for (String string : Cs) {
            if (string.length() > maxLength) {
                maxLength = string.length();
            }
        }
        return maxLength;
    }

    static ArrayList<String> commonSubstring(ArrayList<String> sp1, ArrayList<String> sp2, int n, int m) {
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < Math.pow(2, n) - 1; i++) {
            for (int j = 0; j < Math.pow(2, m) - 1 ; j++) {
                if (sp1.get(i).equals(sp2.get(j))) {

                    list1.add(sp1.get(i));
                    break;

                }
            }

        }
        return list1;
    }

    static ArrayList<String> subSequence(String p) {
        if (p.length() == 1) {
            ArrayList<String> outerList = new ArrayList<>();
            outerList.add(p);
            return outerList;
        }
        ArrayList<String> list = new ArrayList<>();
        list.add(p);

        ArrayList<String> left = subSequence(p.substring(0, p.length() - 1));
        ArrayList<String> right = subSequence(p.substring(1, p.length()));

        left.addAll(right);
        list.addAll(left);

        return list;
    }

}
