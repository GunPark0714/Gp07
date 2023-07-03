package day24.thread;

public class ThreadEx3 {

	public static void main(String[] args) {
		Thread thread = new Thread(()->{
			for(int i = 0; i<10; i++) {
				System.out.println(" - ");
				}
			});
			thread.start();
			for(int i = 0; i<10; i++) {
				System.out.println(" + ");
			}
		}

	}

