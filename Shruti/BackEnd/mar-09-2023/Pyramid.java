public class Pyramid{
    public static void main(String[] args) {
        int noOfRows = 5;
        solution(noOfRows);
    }
    static void solution(int noOfRows){
        for (int row = 1; row < 2 * noOfRows; row++) {
            
            int totalNoOfColumn = row < noOfRows ? row : 2 * noOfRows - row;

            int totalNoOfSpaces = noOfRows - totalNoOfColumn ;

            for (int spaceColumn = 1; spaceColumn <= totalNoOfSpaces; spaceColumn++) {
                
                System.out.print(" ");
            }

            for (int starColumn = 1; starColumn <= totalNoOfColumn; starColumn++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}