package OOPs;

import OOPExtendeds.A;

public class D extends A
{
    void methodOfClassD()
    {
        //System.out.println(j);   Default members can not be inherited outside package
        System.out.println(k);  //Protected member can be inherited to any subclass
        System.out.println(m);  //public member is always inherited to any subclass
 
        A a = new A();
        //System.out.println(a.i);   private member not visible outside the class
        //System.out.println(a.j);   Default members are not visible outside package
        //System.out.println(a.k);   Protected member can not be used outside the package.
        System.out.println(a.m);     //public member can be used anywhere
    }
}
 
class E extends D
{
    void methodOfClassE()
    {
        System.out.println(k);     //Protected member can be inherited to any subclass
        System.out.println(m);     //public member is always inherited
 
        D d = new D();
        System.out.println(d.k);     
        System.out.println(d.m);    //public member can be used anywhere
    }
}