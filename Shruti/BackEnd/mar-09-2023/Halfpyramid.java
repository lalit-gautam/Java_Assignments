
public class Halfpyramid {
    public static void main(String[] args) {
        int noOfRows = 5;
        solution(noOfRows);
    }
    static void solution(int noOfRows){
        for (int row = 1; row < 2 * noOfRows; row++) {
            
            int totalNoOfColumn = row < noOfRows ? row : 2 * noOfRows - row ;

            for (int column = 1; column <= totalNoOfColumn; column++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
