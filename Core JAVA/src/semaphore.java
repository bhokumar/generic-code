import java.util.HashMap;
import java.util.concurrent.Semaphore;

public class semaphore {

	public static void main(String[] args) {
		
		Key k = new Key();
		k.p = "manisha";
		
		Key k1 = new Key();
		k1.p = "manisha";
		HashMap m = new HashMap<>();
		m.put("nn", "ss");
		
		m.put("nn", "gg");
		
		m.put("nn", "ff");
		
		m.put("nn", "mm");
		
		m.put("nn", "nn");
		
		
		m.put("nn", "bb");
		System.out.println(m);
		
		System.out.println(m.get("nn"));
	}

}
