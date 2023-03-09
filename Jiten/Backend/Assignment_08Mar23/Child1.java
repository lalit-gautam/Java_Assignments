package Assignment_08Mar23;

//Java Program to Access Super Class in a Method Overriding


class Parent
{
    void print()
    {
        System.out.println("Base class method called by 'Super' keyword in child class.");
    }
}
public class Child1 extends Parent
{
    void print()
    {
       super.print();
       System.out.println("\nChild class method called.");
    }
    public static void main(String... a)
    {
    	Child1 obj1 = new Child1();
       obj1.print();
    }
}

