import kr.or.bit.Pclass;
/*
public , default , private , protected ����
��Ӱ��迡��  protected 
��鼺 : ���� (default , public)
���� : ����� ���� Ŭ���� �ȿ���  protected �����ڴ�  default �� ���ƿ�
why) ����� ���� ��Ȳ������ protected �����ڴ� �ǹ̰� ����, default�� �����ϱ�
*/
class Dclass{//Ex08_Inherit_Protected Ŭ������ ���� ����
	private int o;
	public int j;
	protected int k;
	int p;
}

class Child2 extends Pclass {
	void method() {
		this.k = 1000; //��Ӱ��迡���� public ó�� ��� ����
		System.out.println(this.k);
	}
}

public class Ex08_Inherit_Protected {
	public static void main(String[] args) {
		Dclass d = new Dclass();
		//d.j ok(public)
		//d.p ok(default)
		//d.k ok(protected ���� ���� �������� defaultó�� ��밡��)
		//in conclusion, ��Ӱ��谡 �ƴϸ� protected�� ���� �ʴ´�.
		
		
		Pclass p = new Pclass();
		Child2 c = new Child2();
		//c.k .. protected (default) ���ٺҰ�
		c.method();
	}

}
