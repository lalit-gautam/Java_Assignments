//Find the numbers greater than the average of the number present in the array
public class Assignment02 {
    public static void main(String[] args) {
        int[] myArray= {13, 14, 15,-8,18,25,-10};
        double ave=getAverage(myArray);
        System.out.println("The average is "+ave);
        getNumbers(myArray, ave);

    }
    public static double getAverage(int[] arr)
    {
        double average=0;
        for(int i=0;i<arr.length;i++)
        {
            average+=arr[i];
        }
        return average/arr.length;
    }
    public static void getNumbers(int[] arr,double avg)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>avg)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
