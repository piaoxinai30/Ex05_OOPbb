/*
 this: 객체 자신을 가르키는 this (this.empno, this.age..)
 this: 생성자를 호출하는 this (this(100, "홍길동""))
 
 상속
 부모: 자식
 super(자식입장에서 보는 [부모의 주소]): 상속관계에서 부모자원에 접근할 수 있는 keyword
 this랑 역할은 동일함
 -> 상속관계에서 부모자원 접근
 ->상속관계에서 부모자원의 생성자 명시적으로 호출
 
 cf, C#에서는 super와 같은 역할을 하는게 [base()]
 */

class Base{
	String basename;
	Base(){
		System.out.println("Base 기본생성자 호출");
	}
	void baseMethod() {
		// TODO Auto-generated method stub
		
	}
	Base(String basename){
		this.basename = basename;
		System.out.println("basename: " + this.basename);
	}
	void basemethod() {
		System.out.println("baseMethod()");
	}
	}

class Derived extends Base{
	String dname;
	Derived(){
		System.out.println("Derived 기본 생성자 호출");
	}
	Derived(String dname){
		//super
		super(dname);
		this.dname = dname;
		System.out.println("dname: " + this.dname);
	}
	void derivedMethod() {
		System.out.println("derivedMethod()");
		
	}
	//부모가 가지는 baseMethod()를 재정의(override)
	@Override
	void baseMethod() {
		//안쪽은 내마음대로
		System.out.println("부모함수를 재정의 하였습니다.");
		}
	//어느날 부모님의 자원이 그리우면?  재정의할 방법이 없어
	//유일한 방법은 super의 사용! (자식 클래스 내부에서)
	void p_method() {
		//super 부모 객체의 주소
		//부모가 가진 자원에 접근
		super.basemethod(); //부모함수 호출
	}
}
public class Ex06_Inherit_Super {
	public static void main(String[] args) {
		
		//Derived d = new Derived();
		//d.derivedMethod();
		//d.basemethod();
		
		Derived d2 = new Derived("홍길동");
		//부모쪽에도 내가 처리하는 홍길동이라는 데이터를 넘겨서 오버로딩된 생성자 호출??
		d2.baseMethod(); //재정의 한 함수만 호출
		
		//어느날 부모님의 자원이 그리우면?  재정의할 방법이 없어
		//유일한 방법은 super의 사용! (자식 클래스 내부에서)
		d2.p_method();
	}

}
