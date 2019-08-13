package InheritanceSolu;

class ClassOne
{
     static int i, j = 191919;
 
     {
    	 System.out.println("pp");
         --i;
     }
 
     {
         j++;
     }
}
 
public class ClassTwo extends ClassOne
{
    static
    {
        i++;
    }
 
    static
    {
        --j;
    }

 
    public static void main(String[] args)
    {
        System.out.println(i);
 
        System.out.println(j);
    }
}
