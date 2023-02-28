public class Assignment2 {
    public static void main(String[] args) {
        // year to be checked
        int year = 2016;
        boolean leap = false;

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            leap = true;
        }
        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
