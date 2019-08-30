/*
시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다
A라는 전자제품 매장이 오픈되면 
[클라이언트 요구사항]
가전제품은  제품의 [가격] , 제품의 [포인트] 정보를 "공통적"으로 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름을 가지고 있다
ex)
각각의 전자제품은 이름을 가지고 있다(ex: Tv , Audio , Computer)  => 제품 각각이 클래스임 => 총 4개의 클래스 (+가전제품)
각각의 전자제품은 다른 가격을 가지고 있다(Tv:5000, Audio:6000 ....) => 클래스 안에 기입 (가전제품이라는 부모쪽에)
제품의 포인트는 가격의 10% 적용한다
 
시뮬레이션 시나리오
구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다 
예를 들면 : 10만원  , 포인트 0
구매자는 제품을 구매할 수 있다 , 구매행위를 하게되면 가지고 있는 돈은  감소하고 포인트는 올라간다
구매자는 처음 초기 금액을 가질 수 있다
*/
class Buyer{
	int money=1000;
	int bonuspoint;
	
	//구매행위
	//구매행위 (잔액 - 제품의 가격 , 포인트 정보 갱신)
	//구매자는 매장에 있는 모든 제품을 구매할 수 있다
	//구매함수 (매장 >> KtTv , Audio , NoteBook)
	
	
	/* 1차 코드 배포
    void kttvBuy(KtTv n) {  //함수가 제품객체를 parameter 받아야  POINT
    	if(this.money < n.price) {
    		System.out.println("고객님 잔액이 부족합니다^^! " + this.money);
    		return; //함수 종료 (구매행위 대한 종료)
    	}
    	//실 구매 행위
    	this.money -= n.price; //잔액
    	this.bonuspoint += n.bonuspoint; //누적  +=
    	System.out.println("구매한 물건은 : " + n.toString());
    }
    
	void audioBuy(Audio n) { //함수가 제품객체를 parameter 받아야  POINT
    	if(this.money < n.price) {
    		System.out.println("고객님 잔액이 부족합니다^^! " + this.money);
    		return; //함수 종료 (구매행위 대한 종료)
    	}
    	//실 구매 행위
    	this.money -= n.price; //잔액
    	this.bonuspoint += n.bonuspoint; //누적  +=
    	System.out.println("구매한 물건은 : " + n.toString());
		
	}
    
	void notebookBuy(NoteBook n) { //함수가 제품객체를 parameter 받아야  POINT
    	if(this.money < n.price) {
    		System.out.println("고객님 잔액이 부족합니다^^! " + this.money);
    		return; //함수 종료 (구매행위 대한 종료)
    	}
    	//실 구매 행위
    	this.money -= n.price; //잔액
    	this.bonuspoint += n.bonuspoint; //누적  +=
    	System.out.println("구매한 물건은 : " + n.toString());
		
	}
}
*/ 
	//2차 개선 코드(리펙토링)
	//하나의 이름으로 여러가지 기능(parameter type과 개수를 달리해서 쓰면 됨)
	//method overloading를 가지고 개선 한다면? =하나의 이름으로 여러가지 기능을 할 수 있다. 그래서 함수 이름을 buy로 변경시킴
	//그렇지만 코드량이 주는건 아님
	
	
	

	/*
	void Buy(KtTv n) {  //함수가 제품객체를 parameter 받아야  POINT
    	if(this.money < n.price) {
    		System.out.println("고객님 잔액이 부족합니다^^! " + this.money);
    		return; //함수 종료 (구매행위 대한 종료)
    	}
    	//실 구매 행위
    	this.money -= n.price; //잔액
    	this.bonuspoint += n.bonuspoint; //누적  +=
    	System.out.println("구매한 물건은 : " + n.toString());
    }
    
	void Buy(Audio n) { //함수가 제품객체를 parameter 받아야  POINT
    	if(this.money < n.price) {
    		System.out.println("고객님 잔액이 부족합니다^^! " + this.money);
    		return; //함수 종료 (구매행위 대한 종료)
    	}
    	//실 구매 행위
    	this.money -= n.price; //잔액
    	this.bonuspoint += n.bonuspoint; //누적  +=
    	System.out.println("구매한 물건은 : " + n.toString());
		
	}
    
	void Buy(NoteBook n) { //함수가 제품객체를 parameter 받아야  POINT
    	if(this.money < n.price) {
    		System.out.println("고객님 잔액이 부족합니다^^! " + this.money);
    		return; //함수 종료 (구매행위 대한 종료)
    	}
    	//실 구매 행위
    	this.money -= n.price; //잔액
    	this.bonuspoint += n.bonuspoint; //누적  +=
    	System.out.println("구매한 물건은 : " + n.toString());
		
	}
} */
	//3차 개선 (중복 코드 제거) >> 조건(동일코드)
		//제품이 계속적으로 추가되더라도 구매행위 기능은 추가적으로 만들지 않는다
		//Why: 즐거운 휴가를 보내야 되니까
		//하나의 이름으로 , 반복코드를 제거 ...
		//KEY POINT : 모든 제품은 Product 상속하고 있다 
		//모든 제품의 부모는  Product
		//Product p;
		//Audio audio = new Audio();
		//p =audio; [단 부모는 자신의 것만 접근] 가능
		
		void Buy(Product n) { //함수가 제품객체를 parameter 받아야  POINT
	    	if(this.money < n.price) {
	    		System.out.println("고객님 잔액이 부족합니다^^! " + this.money);
	    		return; //함수 종료 (구매행위 대한 종료)
	    	}
	    	//실 구매 행위
	    	this.money -= n.price; //잔액
	    	this.bonuspoint += n.bonuspoint; //누적  +=
	    	System.out.println("구매한 물건은 : " + n.toString());
	    	System.out.println("잔액 : " + this.money);
	    	System.out.println("포인트 : " + this.bonuspoint);
			
		}
	}
class Product{
	int price;
	int bonuspoint;
	
	//Product() {	}
	Product(int price) {
		this.price = price;
		this.bonuspoint = (int)(this.price /10.0);
	}
}
class KtTv extends Product{  //KtTv tv = new KtTv();  tv.toString();
	KtTv() {
		super(500);
	}
	//KtTv(int price){ super(price);}
	//이름 리턴 하는 기능
	@Override
	public String toString() {
		return "KtTv";
	}
	
}
class Audio extends Product{  //KtTv tv = new KtTv();  tv.toString();
	Audio() {
		super(100);
	}
	//KtTv(int price){ super(price);}
	//이름 리턴 하는 기능
	@Override
	public String toString() {
		return "Audio";
	}
	
}

class NoteBook extends Product{  //KtTv tv = new KtTv();  tv.toString();
	NoteBook() {
		super(150);
	}
	//KtTv(int price){ super(price);}
	//이름 리턴 하는 기능
	@Override
	public String toString() {
		return "NoteBook";
	}
	
}
public class Ex12_Inherit_KeyPoint {
	public static void main(String[] args) {
		KtTv kttv = new KtTv();
		System.out.println(kttv.toString());
		
		Audio audio = new Audio();
		System.out.println(audio.toString());
		
		NoteBook notebook = new NoteBook();
		System.out.println(notebook.toString());

		Buyer buyer = new Buyer();
		
		//1차 오픈 테스트
		//구매행위
		/*
		buyer.audioBuy(audio);
		buyer.notebookBuy(notebook);
		buyer.kttvBuy(kttv);
		buyer.kttvBuy(kttv);
		*/
		
		//2차 개선 코드 테스트
		//구매행위
		//3차 개선 코드 테스트
		buyer.Buy(audio);
		buyer.Buy(notebook);
		buyer.Buy(kttv);
		buyer.Buy(kttv);
	}

}

