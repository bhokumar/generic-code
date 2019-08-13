package OOPExtendeds;

public class A
{
    private int i;
    int j;
    protected int k;
    public int m;
}
 
class B extends A
{
    void methodOfClassB()
    {
        //System.out.println(i);        Private member can not be inherited
        System.out.println(j);           //Default member can be inherited within package
        System.out.println(k);         //protected member can be inherited to any subclass
        System.out.println(m);       //public member can be inherited to all sub classes
    }
}
 
class C extends B
{
    void methodOfClassC()
    {
        System.out.println(j);     //Default member can be inherited within package
        System.out.println(k);    //protected member can be inherited to any subclass
        System.out.println(m);    //public member can be inherited to any subclass
 
        B b = new B();
        System.out.println(b.j);   //Default member can be used within package
        System.out.println(b.k);   //Protected member can be used anywhere in the package
        System.out.println(b.m);  //Public member can be used anywhere
    }
}