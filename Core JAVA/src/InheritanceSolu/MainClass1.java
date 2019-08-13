package InheritanceSolu;

class MM
{
    int i;
 
    public MM(int i)
    {
        this.i = i--;
    }
}
 
class NN extends MM
{
    public NN(int i)
    {
        super(++i);
 
        System.out.println(i);
    }
}
 
public class MainClass1
{
    public static void main(String[] args)
    {
        NN n = new NN(26);
    }
}