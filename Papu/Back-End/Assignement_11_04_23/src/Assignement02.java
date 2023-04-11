import java.util.Arrays;

//using recursion check a string is palidrom or not
public class Assignement02 {

	public static void main(String[] args) {
		char[] arr= {'a','c','a','a'};
		System.out.println("The array is "+isPalidrom(arr, 0, arr.length-1));

	}
	public static boolean isPalidrom(char array[],int start,int end)
	{
		if(array[start]!=array[end])
		{
			return false;
		}
		if(start<end)
		{
			start++;
			end--;
			isPalidrom(array, start, end);	
			
		}
		return true;
		
	}

}
