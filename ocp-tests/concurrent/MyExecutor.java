import java.util.concurrent.*;
import java.util.*;

class MyExecutor {

	public static void main(String... args) throws Exception {


	CountDownLatch cdl0 = new CountDownLatch(10), cdl1 = new CountDownLatch(5), cdl2 = new CountDownLatch (5), cdl3 = new CountDownLatch(5);

	var l = List.of(cdl0, cdl1, cdl2, cdl3);

	ExecutorService es = Executors.newFixedThreadPool(3);

	System.out.println("Starting threads...");

	es.execute(new MT(cdl0, "A"));
	es.execute(new MT(cdl1, "B"));
	es.execute(new MT(cdl2, "C"));
	es.execute(new MT(cdl3, "D"));

	for(var e : l)
		e.await();
	es.shutdown();
	System.out.println("finished!");
	
	}
}

class MT implements Runnable {
	CountDownLatch cdl;
	String name;

	MT(CountDownLatch cdl, String name) {
		this.cdl = cdl;
		this.name = "MT-"+name;
	}

	public void run() {
		for(int i = 0; cdl.getCount() > 0; i++) {
			System.out.println(name + ": " + i);
			cdl.countDown();
			try {
			Thread.sleep(100);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
