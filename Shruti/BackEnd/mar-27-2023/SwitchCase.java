
enum Level{
    LOW,
    MEDIUM,
    HIGH
}
public class SwitchCase {
    public static void main(String[] args) {
        String str = "sony";
        switchInString(str);
        Level myLevel = Level.LOW;
        switchInEnum(myLevel);
    }
    static void switchInString(String str){
        // the comparison of String objects in switch statements is case sensitive.
        switch(str){
            case "shruti":
            System.out.println("Shruti");
            break;
            case "Sony":
            System.out.println("Sony");
            break;
            default:
            System.out.println("No match");
        }
    }
    static void switchInEnum(Level myLevel){
        switch(myLevel){
            case LOW:
            System.out.println("Low");
            break;
            case MEDIUM:
            System.out.println("Medium");
            break;
            default:
            System.out.println("No match");
        }
    }

    //boolean is not supported in switch case we can use boolean in if else statement
    // static void swichInBoolean(boolean bool){
    //     switch(bool){
    //         case "shruti":
    //         System.out.println("Shruti");
    //         break;
    //         case "Sony":
    //         System.out.println("Sony");
    //         break;
    //         default:
    //         System.out.println("No match");
    //     }
    // }
}
