//������(��Ӱ��迡�� ����)
//������: �������� ����(����)�� ���� �� �ִ� �ɷ�
//C# : ������ �ȿ� overloading, override����

//JAVA : [��Ӱ���]���� [�ϳ��� ��������]�� [�������� Ÿ��]�� ���� �� �ִ�.
//�� �ϳ��� ���������� [�θ�Ÿ��]�̾�� �Ѵ�
//�θ�Ŭ���� Ÿ���� ���������� �������� �ڽ�Ŭ���� ��ü�� ���� �����ϴ�

//JAVA: �ڽ��� �θ𿡰� ���Ǿ��� �帰��.(���Ǽ���� �ݴ�)
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
class CapTv extends Tv2{ //CapTv Ư��ȭ, ��üȭ, ������ ����
	String text;
	String caption(){
		return this.text ="���� �ڸ�  ó�� ��....";
	}
	
}

//class ComTv extends Tv2{}
public class Ex10_Inherit_Poly {
	public static void main(String[] args) {
		CapTv tv = new CapTv();
		tv.power();
		System.out.println("����: " + tv.power);
		tv.chUp();
		System.out.println("ä������: " + tv.ch);
		System.out.println("�ڸ�ó��: " + tv.caption());
		
		Tv2 tv2 = tv; //tv2 ������ CapTvŸ���� �ּҰ��� �Ҵ�
		//Tv2Ÿ���� Captv�� �θ�Ÿ��
		//�ڹ�: ��Ӱ��迡�� �θ�Ÿ���� �ڽ�Ÿ���� �ּҸ� ���� �� �ִ�!!!!!!!!
		//��, �θ�� �ڽ�Ÿ���� ��ü�� ���� ���ϰ� �θ�Ÿ���� ��ü�� �� �� �ִ�.
		//Tv2 tv3 = new Tv2(); (x)
		
		//Tv2 tv2 = new ...
		System.out.println("�ּҰ�: " + tv.toString());
		System.out.println("�ּҰ�: " + tv.toString());
		
	}

}