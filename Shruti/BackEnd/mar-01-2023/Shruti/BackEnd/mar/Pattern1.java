public class Pattern1 {
    public static void main(String[] args) {
        int noOfrows = 4;
       
        numInc(1, 1, 1 , noOfrows);

    }
    // r = row
    // c = column
    static void numInc(int r, int c, int i , int no){
       if( r > no ){
            return;
        }  
       

       if (r % 2 != 0){
            if( r >= c){
                System.out.print(i + " ");            
                numInc(r, c + 1, i + 1, no);

            } else {
                System.out.println();
                numInc(r + 1, 1, i + r, no);
               
            }
       } else {
            if( r >= c){
                System.out.print(i+ " ");
                numInc(r, c + 1, i - 1 , no);
                
            } else {
                System.out.println();
                numInc(r + 1, 1, i + r + 1, no);
        }    
       }
       
    }
    
    
}

