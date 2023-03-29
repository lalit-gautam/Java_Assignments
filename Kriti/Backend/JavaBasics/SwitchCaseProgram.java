package JavaBasics;

import java.util.Scanner;


class Student{
    int roll = 10;
    public String toString(){
        return " : "+roll;
    }
}
class Child extends Student{

}
public class SwitchCaseProgram {



    public static void main(String[] args) {
        Student st = new Student();


        System.out.println(st);





//        int x = 20;
//        while(x<30){
//            System.out.println("sdsdsd");
//        }
//        System.out.println("adsfdsf");

//        int x =10;
//        boolean y = false;
//        if(y = true){
//            System.out.println("sdjkaffj");
//        }


//        byte b = 10;
//        switch (b){
//            case (byte) 10000:
//                System.out.println("Kkkk");
//        }













    }


    public static void printMonth(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = sc.nextInt();

        String monthName;

        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month";
        }

        System.out.println("Month is " + monthName);
    }

    public static void printWeekDay() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Day Number : ");
        int num = sc.nextInt();
        String result;

        switch (num) {
            case 1:
                result = "Monday";
                break;

            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
            default:
                result = "Invalid Day";
                break;
        }
        System.out.println(result);
    }

    public static void isEvenOdd() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result;

        switch (num % 2) {
            case 0:
                result = "even";
                break;
            default:
                result = "odd";
        }

        System.out.println(num + " is " + result);
    }

}
