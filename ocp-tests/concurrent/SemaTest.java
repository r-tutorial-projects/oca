import java.util.concurrent.*;

class SemaTest {
	public static void main(String... args) {
		Semaphore s = new Semaphore(1);
		Shared res = new Shared();

		for(int i = 0; i < 10; i++)
			new Thread(new MyWorker(s, res, i)).start();
	}
}


class MyWorker implements Runnable {
	Semaphore semaphore;
	Shared ressource;
	String name;

	MyWorker(Semaphore sema, Shared res, int i) {
		this.semaphore = sema;
		this.ressource = res;
		this.name = "Worker " + i;
	}

	public void run() {
		try {
			System.out.println(name + " is getting it's locks...");
			semaphore.acquire();
			System.out.println(name + " got its locks!");
			ressource.i++;
			Thread.sleep(100);
			System.out.println(ressource.i);
		} catch (InterruptedException e) {
			System.out.println(name + " was interrupted!");
		} finally {
			System.out.println(name + " is realising it's locks.");
			semaphore.release();
		}
	}

}

class Shared {
	public int i = 0;
}
