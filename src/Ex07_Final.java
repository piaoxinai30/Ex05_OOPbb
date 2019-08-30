/*
 변수 <-> 상수
 상수: 한번 값이 초기화되면 변경 불가
 상수자원: 고유값(주민번호), 시스템 고유변호, 수학적인 값PI=3.14...
 상수는 관용적으로  [대문자]로 표기한다
 
 java : final int NUM = 10;
 C# : const int NUM = 10;
 
 final 키워드
 클래스 앞에 붙으면 final class Car {}.. >> final Math >> 상속불가
 함수앞에: public final void print(){} >> 상속관계애서 재정의 하지마
        public static final void print(){}
 */
class Vcard{
	final String KIND ="heart";
	final int NUM = 10;
	void method() {
		//java도 API 시스템 상수
		System.out.println(Math.PI);
	}
}
//Vcard타입으로 만든 모든 객체는 KIND라는 함수 값이 고정되어있나?
//카드10장 >> KIND >> heart
//10장의 카드가 다른 상수값을 가지면 안되나?
//한번 설정되면 값을 못바꾸지만, 그 시점을 바꾸면 됨: new 할때, 생성자 오버로딩

class Vcard2{
	final String KIND;
	final int NUM;
	
	//Vcard2(){
		//this.KIND = "heart";
		//this.NUM = 1;
		 //}
	Vcard2(String kind, int num){
		this.KIND = kind;
		this.NUM = num;
		
	}
	@Override
	public String toString() {
		return "Vcard2 [KIND=" + KIND + ", NUM=" + NUM + "]";
	}
}

public class Ex07_Final {
	public static void main(String[] args) {
		Vcard vcard = new Vcard();
		System.out.println(vcard.KIND);
		//vcard.KIND = "AAA"; => 불가능
		vcard.method();

		//객체마다 다른 상수값을 제공..
		
		Vcard2 c2 = new Vcard2("spade", 1); //객체 생성시 상수값을 제공
		System.out.println(c2.toString());
		Vcard2 c3 = new Vcard2("heart", 2);
		System.out.println(c3.toString());
		
	}

}
