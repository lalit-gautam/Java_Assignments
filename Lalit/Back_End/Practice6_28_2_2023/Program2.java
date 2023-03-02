package Practice6_28_2_2023;

public class Program2 {
    public static void main(String[] args) {

        // program to input angles of a triangle and check whether the triangle is valid or not

        /*
        A triangle is valid if sum of its two sides is greater than the third side.
        if three sides are a, b and c, then three conditions should be met.
        1. a + b > c
        2. a + c > b
        3. b + c > a
         */

        checkValidity(2, 3, 7);
        checkValidity(10, 5, 7);
        checkValidity(2, 3, 4);
    }
    public static void checkValidity(int len, int bre, int hyp)
    {

        if (len + bre <= hyp || len + hyp <= bre || bre + hyp <= len)
            System.out.println("Triangle is Invalid");
        else
            System.out.println("Triangle is valid ");
    }

}
