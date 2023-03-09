
public class Pattern1 {
    public static void main(String[] args) {
        int noOfrows = 4;
       
        numInc(1, 1, 1 , noOfrows);

    }
    static void numInc(int row, int column, int i , int no){
       if( row > no ){
            return;
        }  
       

       if (row % 2 != 0){
            if( row >= column){
                System.out.print(i + " ");            
                numInc(row, column + 1, i + 1, no);

            } else {
                System.out.println();
                numInc(row + 1, 1, i + row, no);
               
            }
       } else {
            if( row >= column){
                System.out.print(i+ " ");
                numInc(row, column + 1, i - 1 , no);
                
            } else {
                System.out.println();
                numInc(row + 1, 1, i + row + 1, no);
        }    
       }
       
    }
    
    
}
