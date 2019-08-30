//다형성(상속관계에서 나옴)
//다형성: 여러가지 성질(형태)를 가질 수 있는 능력
//C# : 다형성 안에 overloading, override포함

//JAVA : [상속관계]에서 [하나의 참조변수]가 [여러개의 타입]을 가질 수 있다.
//단 하나의 참조변수는 [부모타입]이어야 한다
//부모클래스 타입의 참조변수로 여러개의 자식클래스 객체를 참조 가능하다

//JAVA: 자식은 부모에게 조건없이 드린다.(현실세계와 반대)
class Tv2{
	boolean power;
	int ch;
	void power() {
		this.power = !this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}
class CapTv extends Tv2{ //CapTv 특수화, 구체화, 고유한 구현
	String text;
	String caption(){
		return this.text ="현재 자막  처리 중....";
	}
	
}

//class ComTv extends Tv2{}
public class Ex10_Inherit_Poly {
	public static void main(String[] args) {
		CapTv tv = new CapTv();
		tv.power();
		System.out.println("전원: " + tv.power);
		tv.chUp();
		System.out.println("채널정보: " + tv.ch);
		System.out.println("자막처리: " + tv.caption());
		
		Tv2 tv2 = tv; //tv2 변수에 CapTv타입의 주소값을 할당
		//Tv2타입은 Captv의 부모타입
		//자바: 상속관계에서 부모타입은 자식타입의 주소를 가질 수 있다!!!!!!!!
		//단, 부모는 자식타입의 객체는 보지 못하고 부모타입의 객체만 볼 수 있다.
		//Tv2 tv3 = new Tv2(); (x)
		
		//Tv2 tv2 = new ...
		System.out.println("주소값: " + tv.toString());
		System.out.println("주소값: " + tv.toString());
		
	}

}