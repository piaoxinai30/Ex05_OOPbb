import kr.or.bit.Pclass;
/*
public , default , private , protected 등장
상속관계에서  protected 
양면성 : 박쥐 (default , public)
증명 : 상속이 없는 클래스 안에서  protected 접근자는  default 와 같아요
why) 상속이 없는 상황에서는 protected 접근자는 의미가 없음, default가 있으니까
*/
class Dclass{//Ex08_Inherit_Protected 클래스와 같은 폴더
	private int o;
	public int j;
	protected int k;
	int p;
}

class Child2 extends Pclass {
	void method() {
		this.k = 1000; //상속관계에서는 public 처럼 사용 가능
		System.out.println(this.k);
	}
}

public class Ex08_Inherit_Protected {
	public static void main(String[] args) {
		Dclass d = new Dclass();
		//d.j ok(public)
		//d.p ok(default)
		//d.k ok(protected 같은 폴더 내에서는 default처럼 사용가능)
		//in conclusion, 상속관계가 아니면 protected는 쓰지 않는다.
		
		
		Pclass p = new Pclass();
		Child2 c = new Child2();
		//c.k .. protected (default) 접근불가
		c.method();
	}

}
