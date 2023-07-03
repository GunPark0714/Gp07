package day24.thread;

public class User extends Thread{
	private PassBook pb;//통장
	private String name;//이름
	public User(String name, PassBook pb) {
		this.name = name;
		this.pb = pb;
	}
	@Override
	public void run() {
		pb.deposit(name, 10000);
	}
	
}


@Data
class PassBook{
	private int balance;
	//예금
	public synchronized void deposit(String name, int money) {
		this.balance += money;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " : " + money);
		System.out.println("balance : " + this.balance);
	}
}




