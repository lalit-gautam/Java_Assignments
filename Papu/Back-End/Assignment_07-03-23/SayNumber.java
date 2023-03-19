public class SayNumber {
    public static void main(String[] args) {
        String[] word={"zero","one","two","three","four","five","six","seven","eight","nine"};
        getNumberInWord(1254, word);
    }
    public static void getNumberInWord(int num,String[] word)
    {
        if(num==0)
        {
            return;
        }
        getNumberInWord(num/10, word);
        System.out.println(word[num]);
        num=num%10;
    }
}
