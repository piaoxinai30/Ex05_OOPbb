/*
 ���� <-> ���
 ���: �ѹ� ���� �ʱ�ȭ�Ǹ� ���� �Ұ�
 ����ڿ�: ������(�ֹι�ȣ), �ý��� ������ȣ, �������� ��PI=3.14...
 ����� ����������  [�빮��]�� ǥ���Ѵ�
 
 java : final int NUM = 10;
 C# : const int NUM = 10;
 
 final Ű����
 Ŭ���� �տ� ������ final class Car {}.. >> final Math >> ��ӺҰ�
 �Լ��տ�: public final void print(){} >> ��Ӱ���ּ� ������ ������
        public static final void print(){}
 */
class Vcard{
	final String KIND ="heart";
	final int NUM = 10;
	void method() {
		//java�� API �ý��� ���
		System.out.println(Math.PI);
	}
}
//VcardŸ������ ���� ��� ��ü�� KIND��� �Լ� ���� �����Ǿ��ֳ�?
//ī��10�� >> KIND >> heart
//10���� ī�尡 �ٸ� ������� ������ �ȵǳ�?
//�ѹ� �����Ǹ� ���� ���ٲ�����, �� ������ �ٲٸ� ��: new �Ҷ�, ������ �����ε�

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
		//vcard.KIND = "AAA"; => �Ұ���
		vcard.method();

		//��ü���� �ٸ� ������� ����..
		
		Vcard2 c2 = new Vcard2("spade", 1); //��ü ������ ������� ����
		System.out.println(c2.toString());
		Vcard2 c3 = new Vcard2("heart", 2);
		System.out.println(c3.toString());
		
	}

}
