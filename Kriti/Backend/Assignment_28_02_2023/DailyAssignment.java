

class DailyAssignment{
    public static void main(String[] args){
        printWeek(2);
        printMonth(2);
    }

    //7.Write a program to input week number and print week day.
    public static void printWeek(int i){
        String res = "";
        switch(i){
            case 1: res = "Monday";
            break;
            case 2: res = "Tuesday";
            break;
            case 3: res = "Wednesday";
            break;
            case 4: res = "Thursday";
            break;
            case 5: res = "Friday";
            break;
            case 6: res = "Saturday";
            break;
            case 7: res = "Sunday";
            break;
            default:
            System.out.println("Enter a valid Number");
        }
        if(res != ""){
            System.out.println(res);
        }
    }
    public static void printMonth(int i){
            switch(i){     
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("February");
            break;
            case 3: System.out.println("March");
            break;
            case 4: System.out.println("April");
            break;
            case 5: System.out.println("May");
            break;
            case 6: System.out.println("June");
            break;
            case 7: System.out.println("July");
            break;
            case 8: System.out.println("August");
            break;
            case 9: System.out.println("September");
            break;
            case 10: System.out.println("October");
            break;
            case 11: System.out.println("November");
            break;
            case 12: System.out.println("December");
            break;
            default:
            System.out.println("Please Enter a valid Month Number");
        }
    }

}