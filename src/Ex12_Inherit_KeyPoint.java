/*
�ó�����(�䱸����)
����� ������ǰ ���� �ַ���� �����ϴ� ������Դϴ�
A��� ������ǰ ������ ���µǸ� 
[Ŭ���̾�Ʈ �䱸����]
������ǰ��  ��ǰ�� [����] , ��ǰ�� [����Ʈ] ������ "������"���� ������ �ֽ��ϴ�
������ ������ǰ�� ��ǰ�� ������ �̸��� ������ �ִ�
ex)
������ ������ǰ�� �̸��� ������ �ִ�(ex: Tv , Audio , Computer)  => ��ǰ ������ Ŭ������ => �� 4���� Ŭ���� (+������ǰ)
������ ������ǰ�� �ٸ� ������ ������ �ִ�(Tv:5000, Audio:6000 ....) => Ŭ���� �ȿ� ���� (������ǰ�̶�� �θ��ʿ�)
��ǰ�� ����Ʈ�� ������ 10% �����Ѵ�
 
�ùķ��̼� �ó�����
������ : ��ǰ�� �����ϱ� ���� �ݾ����� , ����Ʈ ������ ������ �ִ� 
���� ��� : 10����  , ����Ʈ 0
�����ڴ� ��ǰ�� ������ �� �ִ� , ���������� �ϰԵǸ� ������ �ִ� ����  �����ϰ� ����Ʈ�� �ö󰣴�
�����ڴ� ó�� �ʱ� �ݾ��� ���� �� �ִ�
*/
class Buyer{
	int money=1000;
	int bonuspoint;
	
	//��������
	//�������� (�ܾ� - ��ǰ�� ���� , ����Ʈ ���� ����)
	//�����ڴ� ���忡 �ִ� ��� ��ǰ�� ������ �� �ִ�
	//�����Լ� (���� >> KtTv , Audio , NoteBook)
	
	
	/* 1�� �ڵ� ����
    void kttvBuy(KtTv n) {  //�Լ��� ��ǰ��ü�� parameter �޾ƾ�  POINT
    	if(this.money < n.price) {
    		System.out.println("���� �ܾ��� �����մϴ�^^! " + this.money);
    		return; //�Լ� ���� (�������� ���� ����)
    	}
    	//�� ���� ����
    	this.money -= n.price; //�ܾ�
    	this.bonuspoint += n.bonuspoint; //����  +=
    	System.out.println("������ ������ : " + n.toString());
    }
    
	void audioBuy(Audio n) { //�Լ��� ��ǰ��ü�� parameter �޾ƾ�  POINT
    	if(this.money < n.price) {
    		System.out.println("���� �ܾ��� �����մϴ�^^! " + this.money);
    		return; //�Լ� ���� (�������� ���� ����)
    	}
    	//�� ���� ����
    	this.money -= n.price; //�ܾ�
    	this.bonuspoint += n.bonuspoint; //����  +=
    	System.out.println("������ ������ : " + n.toString());
		
	}
    
	void notebookBuy(NoteBook n) { //�Լ��� ��ǰ��ü�� parameter �޾ƾ�  POINT
    	if(this.money < n.price) {
    		System.out.println("���� �ܾ��� �����մϴ�^^! " + this.money);
    		return; //�Լ� ���� (�������� ���� ����)
    	}
    	//�� ���� ����
    	this.money -= n.price; //�ܾ�
    	this.bonuspoint += n.bonuspoint; //����  +=
    	System.out.println("������ ������ : " + n.toString());
		
	}
}
*/ 
	//2�� ���� �ڵ�(�����丵)
	//�ϳ��� �̸����� �������� ���(parameter type�� ������ �޸��ؼ� ���� ��)
	//method overloading�� ������ ���� �Ѵٸ�? =�ϳ��� �̸����� �������� ����� �� �� �ִ�. �׷��� �Լ� �̸��� buy�� �����Ŵ
	//�׷����� �ڵ差�� �ִ°� �ƴ�
	
	
	

	/*
	void Buy(KtTv n) {  //�Լ��� ��ǰ��ü�� parameter �޾ƾ�  POINT
    	if(this.money < n.price) {
    		System.out.println("���� �ܾ��� �����մϴ�^^! " + this.money);
    		return; //�Լ� ���� (�������� ���� ����)
    	}
    	//�� ���� ����
    	this.money -= n.price; //�ܾ�
    	this.bonuspoint += n.bonuspoint; //����  +=
    	System.out.println("������ ������ : " + n.toString());
    }
    
	void Buy(Audio n) { //�Լ��� ��ǰ��ü�� parameter �޾ƾ�  POINT
    	if(this.money < n.price) {
    		System.out.println("���� �ܾ��� �����մϴ�^^! " + this.money);
    		return; //�Լ� ���� (�������� ���� ����)
    	}
    	//�� ���� ����
    	this.money -= n.price; //�ܾ�
    	this.bonuspoint += n.bonuspoint; //����  +=
    	System.out.println("������ ������ : " + n.toString());
		
	}
    
	void Buy(NoteBook n) { //�Լ��� ��ǰ��ü�� parameter �޾ƾ�  POINT
    	if(this.money < n.price) {
    		System.out.println("���� �ܾ��� �����մϴ�^^! " + this.money);
    		return; //�Լ� ���� (�������� ���� ����)
    	}
    	//�� ���� ����
    	this.money -= n.price; //�ܾ�
    	this.bonuspoint += n.bonuspoint; //����  +=
    	System.out.println("������ ������ : " + n.toString());
		
	}
} */
	//3�� ���� (�ߺ� �ڵ� ����) >> ����(�����ڵ�)
		//��ǰ�� ��������� �߰��Ǵ��� �������� ����� �߰������� ������ �ʴ´�
		//Why: ��ſ� �ް��� ������ �Ǵϱ�
		//�ϳ��� �̸����� , �ݺ��ڵ带 ���� ...
		//KEY POINT : ��� ��ǰ�� Product ����ϰ� �ִ� 
		//��� ��ǰ�� �θ��  Product
		//Product p;
		//Audio audio = new Audio();
		//p =audio; [�� �θ�� �ڽ��� �͸� ����] ����
		
		void Buy(Product n) { //�Լ��� ��ǰ��ü�� parameter �޾ƾ�  POINT
	    	if(this.money < n.price) {
	    		System.out.println("���� �ܾ��� �����մϴ�^^! " + this.money);
	    		return; //�Լ� ���� (�������� ���� ����)
	    	}
	    	//�� ���� ����
	    	this.money -= n.price; //�ܾ�
	    	this.bonuspoint += n.bonuspoint; //����  +=
	    	System.out.println("������ ������ : " + n.toString());
	    	System.out.println("�ܾ� : " + this.money);
	    	System.out.println("����Ʈ : " + this.bonuspoint);
			
		}
	}
class Product{
	int price;
	int bonuspoint;
	
	//Product() {	}
	Product(int price) {
		this.price = price;
		this.bonuspoint = (int)(this.price /10.0);
	}
}
class KtTv extends Product{  //KtTv tv = new KtTv();  tv.toString();
	KtTv() {
		super(500);
	}
	//KtTv(int price){ super(price);}
	//�̸� ���� �ϴ� ���
	@Override
	public String toString() {
		return "KtTv";
	}
	
}
class Audio extends Product{  //KtTv tv = new KtTv();  tv.toString();
	Audio() {
		super(100);
	}
	//KtTv(int price){ super(price);}
	//�̸� ���� �ϴ� ���
	@Override
	public String toString() {
		return "Audio";
	}
	
}

class NoteBook extends Product{  //KtTv tv = new KtTv();  tv.toString();
	NoteBook() {
		super(150);
	}
	//KtTv(int price){ super(price);}
	//�̸� ���� �ϴ� ���
	@Override
	public String toString() {
		return "NoteBook";
	}
	
}
public class Ex12_Inherit_KeyPoint {
	public static void main(String[] args) {
		KtTv kttv = new KtTv();
		System.out.println(kttv.toString());
		
		Audio audio = new Audio();
		System.out.println(audio.toString());
		
		NoteBook notebook = new NoteBook();
		System.out.println(notebook.toString());

		Buyer buyer = new Buyer();
		
		//1�� ���� �׽�Ʈ
		//��������
		/*
		buyer.audioBuy(audio);
		buyer.notebookBuy(notebook);
		buyer.kttvBuy(kttv);
		buyer.kttvBuy(kttv);
		*/
		
		//2�� ���� �ڵ� �׽�Ʈ
		//��������
		//3�� ���� �ڵ� �׽�Ʈ
		buyer.Buy(audio);
		buyer.Buy(notebook);
		buyer.Buy(kttv);
		buyer.Buy(kttv);
	}

}

