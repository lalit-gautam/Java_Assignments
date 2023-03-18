package Assignment_20_15_03_2023;

public class LookAndSaySequence {
    public static void main(String[] args) {
        int n = 5;
        lookAndSay(n);
    }

    private static void lookAndSay(int n) {
        int num = 1;
        while(n>0){




            n--;
        }
    }


    public  static int getFrequency(int num , int n){
        int c = 0;
        while(num>0){
            if(num%10 == n){
                c++;
                num/=10;
            }
        }
        return c;
    }
}
