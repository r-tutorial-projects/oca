import java.util.*;
import java.time.*;

public class TimerTests {
	public static void main(String... args) {
		MyTask task = new MyTask();
		Timer timer = new Timer();
		System.out.println("Starting execution at " + Instant.now());

		timer.schedule(task, Date.from(Instant.now().plusSeconds(5)));	
	}
}

class MyTask extends TimerTask {
	@Override
	public void run() {
		System.out.println("Test-Task executed at " + Instant.now());
	}
}
