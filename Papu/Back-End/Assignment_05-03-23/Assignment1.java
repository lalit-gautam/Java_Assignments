/*to print the pattern
*************
  ***********
   *********
    *******
     *****
      ***
       *
       * */
class Assignment1{
    public static void main(String[] args) {
        int i,j,k;
        for( i = 7; i >= 1; i--)
    {
         
        // Inner loop print space
        for(j = i; j < 7; j++)
        {
            System.out.print(" ");
        }
         
        // Inner loop print star
        for(j = 1; j <= (2 * i - 1); j++)
        {
            System.out.print("*");
        }
         
        // Ending line after each row
        System.out.println("");
    }
    }
}