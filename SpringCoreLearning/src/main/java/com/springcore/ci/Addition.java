package com.springcore.ci;
// understanding constructor ambiguity
public class Addition {
    private int a;
    private int b;

   /* public Addition(int a, int b) {
        System.out.println("Constrctor int, int got invoked");
        this.a = a;
        this.b = b;
    }*/

    public Addition(double a, double b)
    {
        System.out.println("Double constctor got called");
        this.a=(int) a;
        this.b=(int) b;
    }
    // in this case constructor accepting double value will get called.
    public Addition(int a, int b) {
        System.out.println("Constrctor int, int got invoked");
        this.a = a;
        this.b = b;
    }
    // this is the default constructor, this will get executed by default.
public  Addition(String a, String b)
{
    System.out.println("String constructor");
    this.a=Integer.parseInt(a);
    this.b=Integer.parseInt(b);
}
    public void doSum()
    {
        System.out.println("Value of a :"+this.a);
        System.out.println("Value of b:"+this.b);
        System.out.println("Sum is :"+(this.a+this.b));
    }



}
