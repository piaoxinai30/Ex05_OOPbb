//�ΰ��� ���赵
class Tv{
	boolean power; //default: false
	int ch;
	
	void power() {
		this.power = !this.power; //switch function
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}
class Vcr{ //���� �÷��̾�
	boolean power;
	
	void power() {
	this.power = !this.power;
	}
	void play() {
		System.out.println("play");
			}
	void stop() {
		System.out.println("stop");
	}
	void rew() {}
	void ff() {}
}
//Tv���赵, Vcr���赵�� Ȱ���ؼ�
//TvVcr��� ���赵�� ���弼��
//������ �ִ� Tv, Vcr ����(Ȱ��)�ϰڴ�
//Ȱ��: ���, ����

//class TvVcr extends Tv, Vcr {}  ���߻�� �Ұ���
//class Tv extends Vcr
//class TvVcr extends Tv

//����: ���߿� �ϳ��� ���, ������ �ϳ��� ��������
//TvVcr �ֱ��, ���α��, ����>> ������ ���� Ŭ������ �����
//�������� ��������

//�� �� ���԰���
//class TcVcr {Tv t; Vcr v;}

class TvVcr extends Tv{
	Vcr vcr;
	TvVcr() {
		vcr = new Vcr();
	}
}
public class Ex03_Inherit_Single {
	public static void main(String[] args) {
		TvVcr t = new TvVcr();
		t.power();
		System.out.println("Tv ��������:" + t.power);
		t.chUp();
		System.out.println("Tv ä������:" + t.ch);
		
		//����
		t.vcr.power();
		System.out.println("vcr ��������:" + t.vcr.power);
		t.vcr.play();
		t.vcr.stop();
		t.vcr.power();
		t.power();
		System.out.println("Tv ��������:" + t.power);
		System.out.println("vcr ��������:" + t.vcr.power);
	}

}
