import java.util.Arrays;

//find reverse of array using recursion
public class Assignement01 {

	public static void main(String[] args) {
		char[] arr= {'a','b','c','d'};
		System.out.println("Before reversing"+Arrays.toString(arr));
		reverse(arr, 0, arr.length-1);
		System.out.println("After reversing "+Arrays.toString(arr));

	}
	public static void reverse(char array[],int start,int end)
	{
		if(start>end)
		{
			return;
		}
		char temp=array[start];
		array[start]=array[end];
		array[end]=temp;	
		start++;
		end--;
		reverse(array, start, end);	
	}

}
