import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;

class AtomiRef
{
	private int counter;
	
	private double price;

	public int getCounter() {
		return counter;
	}

	public void incCounter() {
		++this.counter;
	}

	public double getPrice() {
		return price;
	}

	public void addPrice(double price) {
		this.price += price;
	}
}
public class Stats {
	public static class StatisticsAggregatorImpl implements StatisticsAggregator {

		
		ConcurrentHashMap<String, AtomicReference<AtomiRef>> hMap = new ConcurrentHashMap<>();
        
		@Override
		public void putNewPrice(String symbol, double price) {

			try {
				AtomicReference<AtomiRef> ref = hMap.get(symbol);

				AtomiRef atomic = null;
				if (ref == null) {
					ref = new AtomicReference<AtomiRef>();
					atomic = new AtomiRef();
					atomic.incCounter();
					atomic.addPrice(price);
					ref.set(atomic);
				} else {
					atomic = ref.get();
					atomic.incCounter();
					atomic.addPrice(price);
				}
				ref.set(atomic);

				hMap.put(symbol, ref);

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		@Override
		public double getAveragePrice(String symbol) {
			AtomicReference<AtomiRef> ref = hMap.get(symbol);
			AtomiRef atomiRef = ref.get();
			
			if(atomiRef.getCounter() > 0)
				return atomiRef.getPrice()/atomiRef.getCounter();
			else
				return 0.0d;
		}

		@Override
		public int getTickCount(String symbol) {
			AtomicReference<AtomiRef> ref = hMap.get(symbol);
			AtomiRef atomiRef = ref.get();
			
			return atomiRef.getCounter() ;
		}
	}

	////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

	public interface StatisticsAggregator {
		// This is an input. Make note of this price.
		public void putNewPrice(String symbol, double price);

		// Get the average price
		public double getAveragePrice(String symbol);

		// Get the total number of prices recorded
		public int getTickCount(String symbol);
	}

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
		 {
			final StatisticsAggregator stats = new StatisticsAggregatorImpl();
			final Set<String> symbols = new TreeSet<>();

			String line = "1,IBM 22.22,APL 33.33";
			String[] inputs = line.split(",");
			int threads = Integer.parseInt(inputs[0]);
			ExecutorService pool = Executors.newFixedThreadPool(threads);
			for (int i = 1; i < inputs.length; ++i) {
				String[] tokens = inputs[i].split(" ");
				final String symbol = tokens[0];
				symbols.add(symbol);
				final double price = Double.parseDouble(tokens[1]);
				pool.submit(new Runnable() {
					@Override
					public void run() {
						stats.putNewPrice(symbol, price);
					}
				});

			}
			pool.shutdown();
			try {
				pool.awaitTermination(5000, TimeUnit.MILLISECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			for (String symbol : symbols) {
				System.out.println(String.format("%s %.4f %d", symbol,
						stats.getAveragePrice(symbol),
						stats.getTickCount(symbol)));
			}
		}
		

	}
}