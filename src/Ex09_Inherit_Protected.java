import kr.or.bit.Birds;

//protected 접근자는 상속관계에서 사용합니다
//사용목적은? 상속관계에서 재정의의 목적을 가짐
//'당신이 재정의를 해주었으면 좋겠어요' 라는 의도가 내포

//새의 공통사항?
class Ostrich extends Birds {
	void run() {
		System.out.println("달린다!");
	}


@Override
protected void moveFast() {
	run();
	}
}


class bi extends Birds{

	@Override
	protected void moveFast() {
		super.moveFast();
	}

	
	}

public class Ex09_Inherit_Protected {
//구체화 특수화 표현
	public static void main(String[] args) {
		Ostrich o = new Ostrich();
		o.moveFast();
		
		bi b = new bi();
		b.moveFast();

	}

}
