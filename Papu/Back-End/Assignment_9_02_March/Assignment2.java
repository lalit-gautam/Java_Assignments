/*print X pattern 

x              x 
 x            x
  x          x
   x        x
    x      x
     x    x
      x  x
       x
      x  x
     x    x
    x      x     
   x        x
  x          x
 x            x
x              x
*/
public class Assignment2 {
    public static void main(String[] args) {
        printStar(5);
    }
    public static void printStar(int row )
    {
        for(int i=0;i<2*row-1;i++)
        {
            for(int j=0;j<2*row-1;j++)
            {
                if(i==j || i+j==2*row-2)
                {
                    System.out.print("*");
                }    
                System.out.print(" ");         
            }
            System.out.println();
        }
    }
}
