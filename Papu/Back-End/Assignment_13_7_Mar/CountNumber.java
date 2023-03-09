public class CountNumber {
    public static void main(String[] args) {
        count(6);
    }

    public static void count(int num) {
        if (num == 0) {
            return ;
        }
        System.out.println(num);
        count(num - 1);
    }
}
