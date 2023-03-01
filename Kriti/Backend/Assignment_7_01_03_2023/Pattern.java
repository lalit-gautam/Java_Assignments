// * * * * * * 
//   * * * * 
//    * * * 
//     * * 
//      *


class Pattern{
    public static void main(String[] args){
        reverseTriangle(10);
        printTringle(0, 1 , 4);
        printPattern(8 , 2 , 1 , 4);
    }




    // 1 2 3 4
    // 9 10 11 12
    // 13 14 15 16
    // 5 6 7 8

    // num = number of elements 
    //n =  max element like num*n
    // start = starting point of the inner program
    // width = width of the row
    public static void printPattern(int num , int n , int start , int width){
        if(n<1){
            return;
        }
        // System.out.println(start + " - " + n + " - " + num);
        
        System.out.println();
        int i;
        for(i=start;i<=num-width;i++){
            System.out.print(i+" ");
        }
        printPattern(num+num , n-1 , start+num , width);
        System.out.println();
        for(;i<=num;i++){
            System.out.print(i+" ");
        }
    }



    // 1
    // 32
    // 456
    // 10987

    ///num =  records the count
    ///start = number of columns
    // rows = number of rows the array have
    public static void printTringle(int num , int start , int rows){
        if(rows<1){
            return;
        }
        int num1 = num;
        num = num+start;
        for(int i=num ; i>num1;i--){
            System.out.print(i + " ");
        }
        System.out.println();
        printTringle(num , start+1 , rows-1);
    }

    
    public static void reverseTriangle(int num){
        for(int i=0;i<num ; i++){
            for(int j = 0;j<i ; j++){
                System.out.print(" ");
            }
            for(int j = 0;j<num-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}