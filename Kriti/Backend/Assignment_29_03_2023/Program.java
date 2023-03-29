package Assignment_23_03_2023;


import java.util.Scanner;

public class Program implements DailyRoutine {
    static int money = 0;
    static boolean eatAtHotel = false;

    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Wallet Balance ");
//        money = sc.nextInt();

        Program dailyRoutine = new Program();
        dailyRoutine.morningStart();
        dailyRoutine.freshCheck();
        dailyRoutine.morningFood();
        dailyRoutine.travelToOffice();




    }


    public void travelToOffice() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Prepared For Office ? (Y/n)");

        if (!getResult()) {
            System.out.println("Preparing For office...");
            printPercentage();
            System.out.println("Preparation Complete");
        }

        System.out.println("How Do you wanna go to office ? (private / public)");
        if (sc.next().toLowerCase().equals("private")) {
            System.out.println("Do You have enough fuel ? (Y/n)");
            if (!getResult()) {
                System.out.println("Going to refuel the vehicle...");
                printPercentage();
                System.out.println("how much you want to refuel the vehicle ? (100-500)");
                haveEnoughMoney(sc.nextInt(), "Fuel");

            }

        } else {
            System.out.println("How You wanna go to office ? (OLA or Bus)");
            if (sc.next().toLowerCase().equals("ola")) {
                System.out.println("Booking an OLA");
            } else {
                System.out.println("Going to Busstand...");
                printPercentage();

            }
        }

        System.out.println("Travelling");
        printPercentage();
        System.out.println("Reached near office");

        if (eatAtHotel) {
            System.out.println("You need to eat.");
            System.out.println("How much you would like to spend on eating ?(20-70)");
            haveEnoughMoney(sc.nextInt(), "Food");
            System.out.println("Eating Done");
        }

        System.out.println("Going to office");
        printPercentage();
        System.out.println("Reached at office");

    }


    public void morningFood() throws Exception{
        Scanner sc = new Scanner(System.in);

        if (sc.next().equals("hotel")) {
            eatAtHotel = true;
        } else {
            System.out.println("Eating at Home ");
            System.out.println("Checking for resource ");
            printPercentage();
            System.out.println("Is Enough Resource available ? (Y/n)");

            if (getResult()) {
                System.out.println("Done Making the FOod");
                System.out.println("Eating Foor");
                printPercentage();
            } else {
                System.out.println("Not enough resource so eating at hotel");
                eatAtHotel = true;
            }

        }
    }


    public void freshCheck() throws Exception {
        System.out.println("Is Bathroom Free  (Y/n)");

        if (!getResult()) {
            System.out.println("Wait For Bathroom To free");
            printPercentage();
        }

        System.out.println("Is Toothpaste available ? (Y/n)");

        if (!getResult()) {
            System.out.println("Going to buy one.");
            haveEnoughMoney(20, "Toothpaste");
            printPercentage();
            System.out.println("Buying Done");
        }

        System.out.println("Brushing Teeth");
        printPercentage();
        System.out.println("Where Do You wanna eat ? (hotel / home)");

    }

    public void morningStart() throws Exception {
        System.out.println("Are You awake ? (Y/n)");
        if (!getResult()) {
            System.out.println("Waiting for waking up ");
            printPercentage();
        }

        System.out.println("Do You Have office today ?(Y/n) ");
        if (!getResult()) {
            System.out.println("Go To Sleep");
            return;
        }
        ;
    }

    public static void printPercentage() throws Exception {
        for (int i = 0; i < 10; i++) {
            System.out.print("* ");
            Thread.sleep(200);
        }

        System.out.println();
    }

    public static boolean getResult() {
        Scanner sc = new Scanner(System.in);

        if (sc.next().toLowerCase().equals("y")) {
            return true;
        }

        return false;
    }

    public static void haveEnoughMoney(int requiredMoney, String itemToBuy) {

        if (requiredMoney > money) {
            money += requiredMoney;
            System.out.println("Added " + requiredMoney + " Money To Account ");
        }

        money = money - requiredMoney;
        System.out.println("Deducted money Current Balance : " + money + " Brought " + itemToBuy + " for " + requiredMoney);
    }
}
