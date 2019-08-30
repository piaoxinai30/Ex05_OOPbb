/*
 this: ��ü �ڽ��� ����Ű�� this (this.empno, this.age..)
 this: �����ڸ� ȣ���ϴ� this (this(100, "ȫ�浿""))
 
 ���
 �θ�: �ڽ�
 super(�ڽ����忡�� ���� [�θ��� �ּ�]): ��Ӱ��迡�� �θ��ڿ��� ������ �� �ִ� keyword
 this�� ������ ������
 -> ��Ӱ��迡�� �θ��ڿ� ����
 ->��Ӱ��迡�� �θ��ڿ��� ������ ��������� ȣ��
 
 cf, C#������ super�� ���� ������ �ϴ°� [base()]
 */

class Base{
	String basename;
	Base(){
		System.out.println("Base �⺻������ ȣ��");
	}
	void baseMethod() {
		// TODO Auto-generated method stub
		
	}
	Base(String basename){
		this.basename = basename;
		System.out.println("basename: " + this.basename);
	}
	void basemethod() {
		System.out.println("baseMethod()");
	}
	}

class Derived extends Base{
	String dname;
	Derived(){
		System.out.println("Derived �⺻ ������ ȣ��");
	}
	Derived(String dname){
		//super
		super(dname);
		this.dname = dname;
		System.out.println("dname: " + this.dname);
	}
	void derivedMethod() {
		System.out.println("derivedMethod()");
		
	}
	//�θ� ������ baseMethod()�� ������(override)
	@Override
	void baseMethod() {
		//������ ���������
		System.out.println("�θ��Լ��� ������ �Ͽ����ϴ�.");
		}
	//����� �θ���� �ڿ��� �׸����?  �������� ����� ����
	//������ ����� super�� ���! (�ڽ� Ŭ���� ���ο���)
	void p_method() {
		//super �θ� ��ü�� �ּ�
		//�θ� ���� �ڿ��� ����
		super.basemethod(); //�θ��Լ� ȣ��
	}
}
public class Ex06_Inherit_Super {
	public static void main(String[] args) {
		
		//Derived d = new Derived();
		//d.derivedMethod();
		//d.basemethod();
		
		Derived d2 = new Derived("ȫ�浿");
		//�θ��ʿ��� ���� ó���ϴ� ȫ�浿�̶�� �����͸� �Ѱܼ� �����ε��� ������ ȣ��??
		d2.baseMethod(); //������ �� �Լ��� ȣ��
		
		//����� �θ���� �ڿ��� �׸����?  �������� ����� ����
		//������ ����� super�� ���! (�ڽ� Ŭ���� ���ο���)
		d2.p_method();
	}

}
