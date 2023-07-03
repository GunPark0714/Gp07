package day24.thread;

public class SynchronizedEx1 {

	public static void main(String[] args) throws InterruptedException {
		PassBook pb = new PassBook();
		User user1 = new User("Hont gil dong", pb);
		User user2 = new User("Hong ga", pb);
		user1.start();
		user2.start();
		
	}

}

