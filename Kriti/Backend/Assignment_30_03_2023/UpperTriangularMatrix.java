class UpperTriangularMatrix{
    public static void main(String[] args) {
        int[][] arr = new int[][] {{1,2,3} , {4,5,6} , {7,8,9}};
        printUpperTriangle(arr);
    }
    public static void printUpperTriangle(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i<=j){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void printLowerTriangle(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i>=j){
                    System.out.print(arr[i][j]+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}