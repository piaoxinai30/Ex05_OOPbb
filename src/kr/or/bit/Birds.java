package kr.or.bit;

//공통: 새는 날수 있다, 새는 빠르다
public class Birds {
//공통기능
	public void fly() {
		System.out.println("i am flying");
	}
	//재정의를 해주면 좋겠다라는 바람이 내포
	protected void moveFast() {
		fly();
	}
}
