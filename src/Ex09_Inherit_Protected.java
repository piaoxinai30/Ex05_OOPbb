import kr.or.bit.Birds;

//protected �����ڴ� ��Ӱ��迡�� ����մϴ�
//��������? ��Ӱ��迡�� �������� ������ ����
//'����� �����Ǹ� ���־����� ���ھ��' ��� �ǵ��� ����

//���� �������?
class Ostrich extends Birds {
	void run() {
		System.out.println("�޸���!");
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
//��üȭ Ư��ȭ ǥ��
	public static void main(String[] args) {
		Ostrich o = new Ostrich();
		o.moveFast();
		
		bi b = new bi();
		b.moveFast();

	}

}
