/*
���赵 1���� ����� ����....
������ �ܼ����� �ʱ� ....
>>�� �� �̻���  ���赵�� ���� ...
** ������ ** (�������� ���赵�� [����]�� �ξ��ִ� ��)
��Ӱ���(is ~ a : ���) �� ~ �̴� (�θ� �ڿ�) 

���԰���(has ~ a :����) �� ~ ������ �ִ�

��Ŭ���� , ����Ŭ���� 
>>�� extends ����  (��Ӱ���)

��Ŭ���� , ��Ŭ���� 
>>���� ���̴� (x)
>>���� ���� ������ �ִ� (has ~ a)(���԰���)
>>class �� { �� ������; } >>��ü�� ����ʵ� 

����    ��
������ ���̴� (x)
������ ������ ������ �ִ�(0) ���԰���
class ���� { ���� ����; }
------------------------------------
 ���� ���
 �� , �ﰢ�� , �簢���� ����� ���赵�� �ۼ�
 
 ���������̴� 
 �ﰢ���� �����̴�
 �簢���� �����̴�
 
 ���� : �߻�ȭ , �Ϲ�ȭ (���� , �׸��� ) >> �����ڿ�
 �� : ��üȭ ,Ư��ȭ -> ������ , ��   >> ���θ��� ������ �ִ� �� 

�� : ��ǥ�� (x,y)
���� ���� ������ �ִ�
�ﰢ���� ���� ������ �ִ�
�簢���� ���� ������ �ִ�

 �Ϲ�ȭ(���� , �߻�) : shape(�׸��� , ����) ,  point(��)
class Shape{} // ���
class Point{} // ����

��üȭ Ư��ȭ : circle , triangle
*/

//�߻�ȭ,�Ϲ�ȭ (����)
class Shape{
	  String color="gold"; //����Ӽ�
	 
	  void draw() { //������
		  System.out.println("�׸���");
	 }
}
//�߻�ȭ,�Ϲ�ȭ (����)
class Point{
	int x;
	int y;
	//Point(){
		//this.x = 1;
		//this.y = 1;
		//this(1,1); //point
	//}
	Point(int x , int y){
		this.x = x;
		this.y = y;
	}
}
//���� ���弼�� (���� : ������ �������� ������ �ִ�)
//���� �����̴�(is ~ a) : ���� (shape)  =��Ӱ���
//���� ���� ������ �ִ�(has ~ a) : ��(point) =���԰���
//���� Ư���� ������(r)
//���� �������� default ������ 10�� ������,
//����  x,y ��ǥ�� default �� (10,15)
//�⺻���� ������ ������ ������ �������� ���� ���� �Է��� �� �ִ�(���� ����� ����)
class Circle extends Shape{ //��Ӱ���
	int r; //������
	Point center; // ���԰���(member field)
	
	Circle() {
		//this.r = 10;
		//this.center = new Point(10, 15);
		this(10,new Point(10,15));
	}
	Circle(int r , Point center){ //Point ��ü�� �ּҰ��� �ްڴ�
		this.r = r;
		this.center = center;
	}
}
	//Circle c = new Circle();
	//Circle c2 = new Circle(4,new Point(5,6));


//���� 1)
//[�ﰢ��] Ŭ������ ���弼��
//�ﰢ���� �����̴� = ��Ӱ���
//�ﰢ���� 3���� ��(�����Ӽ�) /��(����Ӽ�)/�׸���(������)��� �Ӽ��� ���´� = ���԰��� ==>�̹� ���� Shape��� class���뿡 �������
//����) �ﰢ���� 3���� ���� ���� �׸��� �׸��ٶ�� ����� ������ �ִ�
//Shape, point ���� �޾ƿ�
//hint) (x,y)  (x,y)  (x,y) 3���� ��ǥ�� 
//default �� �׸� �� �ְ� , 3���� ��ǥ���� �޾Ƽ� �׸� �� �ִ�
class Triangle extends Shape {
	Point x;
	Point y;
	Point z;
	Triangle(){
		//x = new Point(10,20); //�ּҰ�
		//y = new Point(30,40);
		//z = new Point(40,50);
		this(new Point(10,20), new Point(30,40) , new Point(40, 50));
	}
	Triangle(Point x, Point y , Point z){
		this.x = x; //�ּҰ�
		this.y = y;
		this.z = z;
	}
	//�߰������� ���
	void trianglePoint() {
		System.out.printf("x :(%d,%d)\t",x.x , x.y);
		System.out.printf("y :(%d,%d)\t",y.x , y.y);
		System.out.printf("z :(%d,%d)\t",z.x , z.y);
	}
	
}

//���̵� ���� (��) Array �� ó���ϱ�
class Triangle2 extends Shape {
	Point[] pointarray;
	
	Triangle2() {
		//Car[] c = {new Car() , new Car() , new Car()}
		//pointarray = new Point[3]; //�游 ...
		                           //������ �濡 ��ü�� �ּҸ� �־��ش� (new ..)
		//pointarray[0] = new Point(1,2);
		//pointarray[1] = new Point(3,4);
		//pointarray[2] = new Point(5,6);
		
		//Car[] c;
		//c = new Point[] {new .. , new .. ,new }
		//[0] Point , [1] Point , [2] Point 
		this(new Point[] {new Point(1,2),new Point(3,4), new Point(5,6)});

	}
	Triangle2(Point[] pointarray){
		this.pointarray = pointarray;
	}
	
	void trianglePoint() {
		for(Point point : pointarray) {
			System.out.println("��ǥ: " + point.x  +","+ point.y);
		}
	}
	
}


public class Ex02_Inherit_composition {

	public static void main(String[] args) {
		/*
		Circle circle = new Circle();
		circle.r = 5;
		circle.center = new Point();
		circle.draw();
		*/
		Circle c = new Circle(); //�⺻��
		c.draw();
		System.out.println(c.color);
		System.out.println(c.r);
		System.out.println(c.center.x); //POINT �ּҰ�.�ּҰ�.��
		System.out.println(c.center.y);
		
		Circle c2 = new Circle(3, new Point(12, 24)); //��ǥ�� ���� �� ��
		
		
		
		/////////////////////////////////////////////////
		Triangle  tri = new Triangle();
		tri.trianglePoint();
		System.out.println();
		System.out.println("�ﰢ���� ����:"+tri.color);
		tri.draw();
		
		Triangle2 tri2 = new Triangle2();
		tri2.trianglePoint();
		
		Triangle2 tri3 = new Triangle2(new Point[] {new Point(11,22),new Point(33,44), new Point(5,6)});
		tri3.trianglePoint();
	}

}



