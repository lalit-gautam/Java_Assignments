package JavaBasics;

import java.util.Scanner;

public class IfElseProgram {
    public static void main(String[] args) {
        findSmallest();
    }

//    Write a program that will read the value of x and evaluate the following function:
//            1 for x>0
//            y = 0 for x = 0
//            -1 for x<0
    public  static int Program1(int x){
        if(x>0) return 1;
        else if(x<0) return -1;
        return 0;
    }

//    Write a program to input a number and print “ODD” if the number is odd and “EVEN” if
//    the number is even.
    public static void evenOdd(int num){
        if(num %2==0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }

//    Write a program to input three numbers and find out the smallest.
    public static void findSmallest(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int b = sc.nextInt();
        System.out.println("Enter number 3 : ");
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("A is highest");
            }
            else{
                System.out.println("C is Highest");
            }
        }else{
            if(b>c){
                System.out.println("B is Highest");
            }
            else {
                System.out.println("C is highest");
            }
        }

    }


//    Write a program to print absolute vlaue of a number entered by use

    public static void printAbsolute(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int x = s.nextInt();
        if(x<0){
            System.out.println("Absolute value : "+(x*-1));
        }
        else{
            System.out.println("Absolute value : "+x);
        }
    }


//    A school has following rules for grading system:
//    a. Below 25 - F
//    b. 25 to 45 - E
//    c. 45 to 50 - D
//    d. 50 to 60 - C
//    e. 60 to 80 - B
//    f. Above 80 - A
//    Ask user to enter marks and print the corresponding grade.
    public static void printPercentage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int num = sc.nextInt();
        if(num<25){
            System.out.println("F");
        }
        else if(num<45){
            System.out.println("E");
        }
        else if(num<50){
            System.out.println("D");
        }
        else if(num<60){
            System.out.println("C");
        }
        else if(num<80){
            System.out.println("B");
        }
        else if(num<=100){
            System.out.println("A");
        }
        else{
            System.out.println("Not correct marks");
        }
    }

}
