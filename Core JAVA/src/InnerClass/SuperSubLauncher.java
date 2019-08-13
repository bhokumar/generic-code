package InnerClass;

/**
 * Created by manishasingh on 7/27/2017.
 */
public class SuperSubLauncher {

    public static void main(String[] args) {
        MemberClass memberClass = new MemberClass();
        memberClass.ss();

        BestInnerClassExample ex = new BestInnerClassExample();

//        MemberClass.MemberSubClass m = memberClass.new MemberSubClass();
//        m.display();

        LocalClass localClass = new LocalClass();
        localClass.display();
    }
}
