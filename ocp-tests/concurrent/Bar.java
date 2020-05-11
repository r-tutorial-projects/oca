import java.util.concurrent.*;

class Bar {
	public static void main(String... args) {
		var barrier = new CyclicBarrier(5, () -> System.out.println("barrier finished!"));

		for(int i = 0; i <= 10; i++)
			new Thread(new Worker(barrier, i)).start();
	}
}

class Worker implements Runnable {
	CyclicBarrier barrier;
	String name;
	int i;

	Worker(CyclicBarrier barrier, int i) {
		this.barrier = barrier;
		this.name = "Worker " + i;
		this.i = i;
	}

	public void run() {
		System.out.println(name + " is working");
		
		try {
		Thread.sleep(i * 100);
		System.out.println(name + " reached barrier");
		barrier.await(5, TimeUnit.SECONDS);
		System.out.println(name + " passed barrier");
		} catch(InterruptedException|BrokenBarrierException|TimeoutException e) {
			System.out.println(e);
		}
	}
}
