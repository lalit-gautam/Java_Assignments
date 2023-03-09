package Assignment_07Mar23;

//Counting number of objects created in a class.

public class CountingNumberObjectsCreatedInAClass
{
    static int count=0;
    CountingNumberObjectsCreatedInAClass()
    {
        count++;
    }
    public static void main(String[] args) 
    {
    	CountingNumberObjectsCreatedInAClass object1 = new CountingNumberObjectsCreatedInAClass();
    	CountingNumberObjectsCreatedInAClass object2 = new CountingNumberObjectsCreatedInAClass();
    	CountingNumberObjectsCreatedInAClass object3 = new CountingNumberObjectsCreatedInAClass();
    	CountingNumberObjectsCreatedInAClass object4 = new CountingNumberObjectsCreatedInAClass();
        System.out.println("Number of objects created:"+count);
    }
}