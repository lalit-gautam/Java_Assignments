package Assignment_07Mar23;

//Java Program to use 'this' Keyword in Inheritance Class.

class Parent 
{
  int x = 19;
}
 
public class Child extends Parent 
{
    int x = 20;
    
    public static void main(String [] args) 
    {
        Child obj = new Child();
        obj.valueShows();       
    }
    public void valueShows() 
    {
        System.out.println("The Parent class x  value:" + super.x);
        System.out.println("The child class x value :" + x);
 
    }
}