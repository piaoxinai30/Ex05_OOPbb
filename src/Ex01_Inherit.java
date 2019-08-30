
/*
 OOP언어의 3대 특징
 1. 상속    2. 캡슐화(은닉화)  3.다향성
 
  상속, 부모타입의 객체를 물려받아서, 다중상속이 안됨(복잡해서)=>
 java에서는 상속을 child extends Base
 C#에서는 상속을  child :Base
 
 상속의 특징:
 1. 다중상속은 불가능하다
 2. 단일상속 지원(여러개의 클래스를 상속 받으려면:계층적 상속)
 3. 다중상속을 지원하는 것 : interface (only way)
 
 4. 상속의 의미??? >> 재사용성!! >>>설계시 비용(시간, 공통자원(분모/추상화))이 높음
    단점은 초기비용(설계)가 많이 든다.
 5. 상속 관계에서 메모리에 대한 순서: GrandFather >> Father >> Child 순으로 힙메모리에 올라간다
 
 사용자가 만드는 모든 클래스는 디폴트로 Object를 상속한다
 class Child extends Object , Father (x) => 다중 불가능
 
  */

class GrandFather extends Object { //최상위 클래스에는 extendㄴ Object가 숨겨져있음
	public GrandFather() {
		System.out.println("할아버지 생성자");
	}
	public int gmoney = 5000;
	private int pmoney = 10000; //private 상속관계에서는 접근 불가
}
class Father extends GrandFather{
	public Father() {
		System.out.println("아버지 생성자");
	}
	public int fmoney = 1000;
}
class Child extends Father{
	public Child() {
		System.out.println("자식 생성자");
	}
	public int cmoney = 100;
}

public class Ex01_Inherit {

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.gmoney); //할아버지 돈 내돈
		System.out.println(child.fmoney); //아버지 돈 내돈
		System.out.println(child.cmoney); //내돈도 내돈
		//System.out.println(child.pmoney);
		
		
		
		
		
		
		
		
		

	}

}
