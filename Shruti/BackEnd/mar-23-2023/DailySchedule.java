import java.util.Scanner;

public class DailySchedule {
    public static void main(String[] args) {
        System.out.println("press y for yes or press n for no");
        System.out.println("Are you Wake up ? ");

        if (getInput()) {
            homeToOffice();
        } else {
            System.exit(0);
        }
    }

    static void brushTeeth() {
        System.out.println("Did you brush your teeth ?");
    }

    static void goToSleep() {
        System.out.println("Go to sleep !");
    }

    static void breakfastCompleteOrNot() {
        System.out.println("Have you had your breakfast ?");
    }

    static void goToOffice() {
        System.out.println("Do you want to go to office ? ");
    }

    static void askingForBreakfast() {
        System.out.println("Do you want to have it now ? ");
    }

    static void placeOfBreakfast() {
        System.out.println("Where do you want to have your breakfast ? press 1 for home, press 0 for hotel");
    }

    static void haveMoney() {
        System.out.println("Do you have money for breakfast?");
    }

    static void greet() {
        System.out.println("Have a great day !");
    }

    static void completeBreakfast() {
        goToOffice();
        if (getInput()) {
            greet();
        } else {
            goToSleep();
        }
    }

    static void breakfastInHome() {
        breakfastCompleteOrNot();
        if(getInput()){
            completeBreakfast();
        } else {
            completeBreakfast();
        }
    }

    static void breakfastInHotel() {
        haveMoney();
        if (getInput()) {
            System.out.println("Have your breakfast !");
        } else {
            takeMoney();
            System.out.println("Have your breakfast !");
            breakfastCompleteOrNot();
            if (getInput()) {
                completeBreakfast();
            } else {
                goToOffice();
                if (getInput()) {
                    greet();
                } else {
                    System.out.println("Go to home");
                }
            }
        }
    }

    static void homeToOffice() {
        brushTeeth();
        if (getInput()) {
            breakfastCompleteOrNot();
            if (getInput()) {
                completeBreakfast();
            } else {
                askingForBreakfast();
                if (getInput()) {
                    placeOfBreakfast();
                    Scanner sc = new Scanner(System.in);
                    int input = sc.nextInt();
                    if (input == 1) {
                        breakfastInHome();
                    } else if (input == 0) {
                        breakfastInHotel();
                    }
                } else {
                    completeBreakfast();
                }
            }
        } else {
            System.out.println("Wash Your Face and brush your teeth.");
            homeToOffice();
        }
    }
    static int wallet = 200;
    static void takeMoney() {
        System.out.println("How much money do you want ?");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(input + "/- has transferred to your account");
        System.out.println( "Now You have "+ input + wallet + " in your account. Have your breakfast !");
    }

    static boolean getInput() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("y")) {
            return true;
        } else if (input.equalsIgnoreCase("n")) {
            return false;
        } else {
            System.out.println("Please provide correct input !");
            if(getInput()){
                return true;
            } else {
                return false;
            }
        }
        
    }
}