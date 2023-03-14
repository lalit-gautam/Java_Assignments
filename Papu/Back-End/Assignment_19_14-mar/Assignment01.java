//find square root without using predifined method
class Assignment01 {
    public static void main(String[] args) {
        System.out.println(squareRoot(4));
    }
//to calculate square root of  a number
    public static double squareRoot(int num) {
        double t;
        double sqrtroot = num / 2;
        do {
            t = sqrtroot;
            sqrtroot = (t + (num / t)) / 2;
        } while ((t - sqrtroot) != 0);
        return sqrtroot;
    }
}