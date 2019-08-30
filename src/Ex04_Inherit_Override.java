/*
 Today Point :[��Ӱ���]���� override : ��Ӱ��迡�� method [������]
 -[��Ӱ���]���� [�ڽ�]Ŭ������ [�θ�]Ŭ������ [method]�� ������(������ �ٲ�)
 ������ �ǹ�: Ʋ�Ǻ�ȯ(�Լ��� �̸�, ���� Ÿ��)�� ��ȭ�� �ƴ϶�{������ ��ȭ}
 ����)
 1. �θ��Լ� �̸� ����
 2. �θ��Լ� parameter ����
 3. �θ��Լ� return type ����
 4. �ᱹ���� {��ȣ�ȿ� �ִ� ���븸 �����ض�}
 
 �����ε��� : �ϳ��� �̸����� �������� ����� �ϴ� �� 
 �������̵� : ��Ӱ��迡�� �θ��� �Լ��� [������]�ϴ� ��/ �������̵带 �������ϴ� ������̼���? �����ε�!
 */

class Point2{
	int x = 4;
	int y = 5;
	String getPosition() {
		return "x:" + this.x +"y:" + this.y;
	}
}
class Point3D extends Point2{
	//int x;
	//int y; ��Ӱ��� �θ� ������ x, y ���
	int z = 6;

	//Annotation�� Java code������ ������ �� ���� [�ΰ����� ����]�� [�����Ϸ�]�� [������]�� ������ �� �ִ�.
	@Override //�����Ǹ� �˻��ϴ� ���
	String getPosition() {
		return "x:" + this.x +"y:" + this.y + "z:" + this.z;
	}
	
	//String xyzPosition() { } �θ� ����ϴ� �Լ� ������ �ְ� �̸��� ����
	
	//�θ��� �Լ��� Ʋ�� ������ >> ���븸 �ٸ�
	//������
	//String getPosition() {
		//return "x:" + this.x +"y:" + this.y + "z:" + this.z;
	//}

}

public class Ex04_Inherit_Override {
	public static void main(String[] args) {
		Point3D p3 = new Point3D();
		System.out.println(p3.getPosition());

	}

}
