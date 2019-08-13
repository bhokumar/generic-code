package InheritanceSolu;

class XA
{
    void calculate(int a, int b)
    {
        System.out.println("Class X");
    }
}
 
class YA extends XA
{
    @Override
    void calculate(int a, int b)
    {
        System.out.println("Class Y");
    }
}
 
class ZA extends YA
{
    @Override
    void calculate(int a, int b) 
    {
        System.out.println("Class Z");
    }
}
 
public class MainClass3 
{    
    public static void main(String[] args)
    {
        XA x = new YA();
         
        x.calculate(10, 20);
         
        YA y = (YA) x;
         
        y.calculate(50, 100);
         
//        Z z = (Z) y;
//         
//        z.calculate(100, 200);
    }
}