
/*
 OOP����� 3�� Ư¡
 1. ���    2. ĸ��ȭ(����ȭ)  3.���⼺
 
  ���, �θ�Ÿ���� ��ü�� �����޾Ƽ�, ���߻���� �ȵ�(�����ؼ�)=>
 java������ ����� child extends Base
 C#������ �����  child :Base
 
 ����� Ư¡:
 1. ���߻���� �Ұ����ϴ�
 2. ���ϻ�� ����(�������� Ŭ������ ��� ��������:������ ���)
 3. ���߻���� �����ϴ� �� : interface (only way)
 
 4. ����� �ǹ�??? >> ���뼺!! >>>����� ���(�ð�, �����ڿ�(�и�/�߻�ȭ))�� ����
    ������ �ʱ���(����)�� ���� ���.
 5. ��� ���迡�� �޸𸮿� ���� ����: GrandFather >> Father >> Child ������ ���޸𸮿� �ö󰣴�
 
 ����ڰ� ����� ��� Ŭ������ ����Ʈ�� Object�� ����Ѵ�
 class Child extends Object , Father (x) => ���� �Ұ���
 
  */

class GrandFather extends Object { //�ֻ��� Ŭ�������� extend�� Object�� ����������
	public GrandFather() {
		System.out.println("�Ҿƹ��� ������");
	}
	public int gmoney = 5000;
	private int pmoney = 10000; //private ��Ӱ��迡���� ���� �Ұ�
}
class Father extends GrandFather{
	public Father() {
		System.out.println("�ƹ��� ������");
	}
	public int fmoney = 1000;
}
class Child extends Father{
	public Child() {
		System.out.println("�ڽ� ������");
	}
	public int cmoney = 100;
}

public class Ex01_Inherit {

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.gmoney); //�Ҿƹ��� �� ����
		System.out.println(child.fmoney); //�ƹ��� �� ����
		System.out.println(child.cmoney); //������ ����
		//System.out.println(child.pmoney);
		
		
		
		
		
		
		
		
		

	}

}
