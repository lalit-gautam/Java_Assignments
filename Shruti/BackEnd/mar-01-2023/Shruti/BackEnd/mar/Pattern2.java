public class Pattern2 {
    public static void main(String[] args) {
        int noOfrows = 4;
        pattern2(1, 1, 1, noOfrows);
    }
    // r = row
    // c = column
    static void pattern2(int r, int c , int i, int no){
        if( r > no ){
            return;
        }
        if( r % 2 != 0){
            if( c <= no){

                System.out.print(i + " ");
                pattern2(r, c + 1 , i + 1, no);

            } else if ( r < no){  

                System.out.println();
                pattern2(r + 1, 1 , i + no - 1, no);
            } 
        } else {
            if( c <= no){

                pattern2(r, c + 1 , i - 1, no);
                System.out.print(i + " ");
               
            } else {
                
                pattern2(r + 1, 1 , i + no + 1 , no);

                if ( r != no){                
                    System.out.println();
                }
               
            }
        }

    }
}

