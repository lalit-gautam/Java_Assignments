package Assignment_20_03_2023;

import java.util.Arrays;

public class NumberToWord {
    public static void main(String[] args) {
        long num = 1234;
        wordFromNumber("12,30,56,789");
    }

    public static void wordFromNumber(String number) {
        String[] tenPower = {"", "thousand", "Lac", "Crores"};
        String[] numList = number.split(",");
//        System.out.println(Arrays.toString(numList));
        String word = "";
//        for(int i = numList.length-1 ; i>0 ; i--){
//            word = getNumberToWord(numList[i])+tenPower[numList.length-1-i]+" "+word;
//        }
        int count = numList.length - 1;
        for (int i = 0; i < numList.length; i++) {
            word = word +" "+ getNumberToWord(numList[i]) + tenPower[count--] +" ";
        }
        System.out.println(word);
    }

    public static String getNumberToWord(String num) {
        String[] wordOneDigit = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] wordTwoDigit = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] wordTwoDigitOver20 = {"", "", "Twenty", "Thirty", "Fourty", "Fivety", "sixty", "Seventy", "Eighty", "Ninty"};

        if (num.length() == 1) {
            return wordOneDigit[Integer.parseInt(num)];

        }
        if (num.length() == 2 && Integer.parseInt(num) < 20) {
            return wordTwoDigit[Integer.parseInt(num) % 10];
        }
        if (num.split("")[1].equals("0")) {
            return wordTwoDigitOver20[Integer.parseInt(num)/10];
        }
        if (num.length() == 2 && Integer.parseInt(num) >= 20) {
//            System.out.println((Integer.parseInt(num)%100)/10);
            return wordTwoDigitOver20[(Integer.parseInt(num) % 100) / 10] + wordOneDigit[Integer.parseInt(num) % 10];
        }

        if (num.length() == 3) {
            String fnum = num.split("")[0];
            if (!fnum.equals("0")) {
                return getNumberToWord(fnum) + "Hundred" + getNumberToWord(num.substring(1));
            }
        }
        return "";
    }

}

