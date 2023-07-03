package day24.thread;

public class ThreadEx1 {

	public static void main(String[] args) {
		ChildThread1 chTread = new ChildThread1();
		chTread.start();
		for(int i = 0;i<10;i++) {
			System.out.println(" work1 ");
		}
		/*for(int i = 0;i<10;i++) {
			System.out.println(" work2 ");
		}
		*/
	}
}

class ChildThread1 extends Thread{
	@Override
	public void run() {
		for(int i = 0;i<10;i++) {
			System.out.println(" work2 ");
		}
	
	}
}