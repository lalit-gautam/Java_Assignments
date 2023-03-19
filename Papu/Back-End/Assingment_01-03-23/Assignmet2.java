/* to print the pattern
0
21
432
6543
87654
 */
public class Assignmet2 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int j=i;j>=0;j--)
            { 
                System.out.print(i+j);
            }
            System.out.println();
        }
    }
}
