//�ڹٿ����� �������� ��Ӱ���

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
		//������: �θ�Ÿ���� ���������� �ڽ�Ÿ���� �ּҰ��� ���� �� �ִ�.(��Ӱ��迡��)
		//�� ������ ��� ��ü�� �����ϴ� �Ž� �ƴ϶�, �ڽ�Ÿ���� ��ü�� ���� ����
		
		Pbase p = c; //������
		System.out.println("p �θ�Ÿ���� ����: " + p);
		System.out.println("c ����: " + c);
		
		System.out.println(c.c + "/" + c.p);
		System.out.println("�ڽ��� ��(�θ�)�� ����:" + p.p);
		
		Dbase d = new Dbase();
		p = d;//����
		//�ϳ��� �������� P�� c���ּ� ���� d�� �ּҰ��� ������.
		
		Dbase dd = (Dbase)p;// �θ��� �ּҸ� �ڽĿ���..
					 //  �θ� [���� Ÿ��]... casting
		
	}

}
