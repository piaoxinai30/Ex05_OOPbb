//자바에서의 다형성은 상속관계

class Pbase{
	int p = 100;
	}
class Cbase extends Pbase{
	int c = 200;
}
class Dbase extends Pbase{
	
}

public class Ex11_Inherit_poly {

	public static void main(String[] args) {
		Cbase c = new Cbase();
		System.out.println(c.toString());
		//다형성: 부모타입의 참조변수가 자식타입의 주소값을 가질 수 있다.(상속관계에서)
		//단 생성된 모든 객체에 접근하는 거싱 아니라, 자신타입의 객체만 접근 가능
		
		Pbase p = c; //다형성
		System.out.println("p 부모타입의 변수: " + p);
		System.out.println("c 변수: " + c);
		
		System.out.println(c.c + "/" + c.p);
		System.out.println("자신의 것(부모)만 접근:" + p.p);
		
		Dbase d = new Dbase();
		p = d;//가능
		//하나의 참조변수 P가 c의주소 값도 d의 주소갑을 가진다.
		
		Dbase dd = (Dbase)p;// 부모의 주소를 자식에게..
					 //  부모를 [상위 타입]... casting
		
	}

}
