package Assignment_27Feb23;

//Find the average of array elements.
public class AverageOfArrayElement{
	  public static void main(String [] args){
	    float []arrayElements = {23,45,75,99,345,234,45,35,0};
	    float sum = 0;
	    for(int i = 0; i < arrayElements.length; i++){
	      sum += arrayElements[i];
	    }
	    System.out.println("Length = "+arrayElements.length);
	    System.out.println("Sum = "+sum);
	    double average = sum / arrayElements.length;
	    System.out.println("Average of elements = "+average);
	  }
	}