public class RemoveLeadAndTrail {

    public static void main(String[] args) {
        String str = " Welcome to my world. Hi my name is shruti  ";
       
        char[] charArr = str.toCharArray();
        removeSpace(charArr, "", 0);
    }
    static void removeSpace(char[] charArr,String p, int i){
        if(i == charArr.length){
            System.out.println(p);
            return ;
        }
        if(i == 0 || i == charArr.length-1){
            if(charArr[i] == ' '){
                removeSpace(charArr, p , i+1);
            }
        } else {
            removeSpace(charArr, p + charArr[i], i + 1);
        }
    }
}
