package advanceThread;

public class AtomicRef implements Runnable {
	public static void main(String[] args) {
		AtomicRef ref = new AtomicRef();
		Thread t = new Thread(ref);
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
