package day10.practice;

public class RectEx {

	public static void main(String[] args) {
		//그림판의 사각형을 그리기 위한 클래스를 생성하고 테스트 하는 코드를 작성하세요.
	       Rect1 r = new Rect1(0,0,10,10);
	       r.print();
	       r.move(10, 10);
	       r.print();
	       r.resize(10, 10, 20, 20);
	       r.print();
	       r.resize(0, 0, 30, 30);
	       r.print();
	}
}

class Rect1{
	//멤버변수
	/* 왼쪽 위의점 x좌표, 왼쪽 위의점 y좌표, 오른쪽 아래의 점 x좌표, 오른쪽 아래 점 y좌표
	 * 
	 */
	private int leftUpX, leftUpY;
	private int rightDownX, rightDownY;
	
	//생성자
	 public Rect1(int leftUpX, int leftUpY, int rightDownX, int rightDownY) {
		
			this.leftUpX = leftUpX;
			this.leftUpY = leftUpY;
			this.rightDownX = rightDownX;
			this.rightDownY = rightDownY;

	 }
	//getter, setter
	//생략. 여기서는 필요가 없음.
	//메서드
	/** 사각형 정보를 출력하는 메서드
	 *  매개변수 : 없음
	 *  리턴타입 : 없음 => void
	 *  메서드명 : print
	 */
	public void print() {
		System.out.println("================");
		System.out.println("Left Up : " + leftUpX + ", " + leftUpY);
		System.out.println("Right Up : " + rightDownX + "," + rightDownY);
	}
	/** 사각형을 이동시키는 메서드
	 * 매개변수 : 이동시킬 왼쪽 위의 점 => int x, int y
     * 리턴타입 : 없음 => void
     * 메서드명 : move
     * 0,0  =>  10, 10
     *      10, 10             20,20
	 */
	public void move(int x, int y) {
		int dx = leftUpX - x;//이동한 x좌표 거리, -10 
		int dy = leftUpY - y;//이동한 y좌표 거리, -10
	    leftUpX = x;
	    leftUpY = y;
	    rightDownX = rightDownX - dx; //10 - -10 => 20
	    rightDownY = rightDownY - dy; //
	    
	}
	/** 사각형의 크기를 변경하는 메소드
	 * 매개변수 : 변경된 사각형의 왼쪽 위의 x,y좌표와 
	 * 			가로, 세로가 주어지면 사각형의 크기를 변경하는 메서드
	 *         => int x, int y, int w, int h
	 * 리턴타입 : 없음 => void
	 * 메서드명 : resize
	 */
	public void resize(int x, int y, int w, int h) {
		leftUpX = x;
		leftUpY = y;
		rightDownX = x + w;
		rightDownY = x + h;
	}

}
class Rect2{
	//멤버변수
	private PointEx leftUp, rightDown;

	public Rect2(PointEx leftUp, PointEx rightDown) {
		this.leftUp = leftUp;
		this.rightDown = rightDown;
	
	}	
		/*public Rect2(int leftUpX, int leftUpY, int rightDownX, int rightDownY) {
			leftUp = new Point(leftUpX, leftUpY);
			rightDown = new Point(rightDownX, rightDownY); 
			
			public void print() {
				System.out.println("================");
				System.out.print("Left Up : "); leftUp.print();
				System.out.print("Right Up : ");rightDown.print();
				
				public void move(int x, int y) {
					int dx = leftUp.getX()-x;//이동한 x좌표 거리, -10 
					int dy = leftUp.getY()-y;//이동한 y좌표 거리, -10
				    leftUp.move(x, y);
				    rightDown.move(rightDown.getX() - dx, rightDown.getY() - dy);
				    
	    public void resize(int x, int y, int w, int h) {
		leftUp.move(x, y);
		rightDown.move(x+w, y+h);
	
		===========main ==========
		System.out.println( " R2 Start!");
		Rect2 r = new Rect2(new Point(0,0), new Point(10,10));
		r2.print();
		r2.move(10,10);
		r2.print();
		r2.resize(10,10,20,20);
		r2.print();
		r2.resize(0, 0, 30, 30);
		r2.print();
		*/		
	}
	

	
	

    
	

	
	
		

		
    
	
