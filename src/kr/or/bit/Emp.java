package kr.or.bit;

//DTO, VO, DOMAIN
public class Emp { //extends Object(�����Ǿ�����)
	private int empno;
	private String ename;
	
	public Emp(int empno, String ename) {
		
		this.empno = empno;
		this.ename = ename;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	//������ toString() �������ϴ°� ������
	//Object�� ������ �ִ� toStrng() �ּҰ��� ���
	//[�ּҰ� ���]���ٴ� �����Ǹ� ���� member field�� ������ �� ����ϴ� ������ ���ȴ�

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
	
	
	
	
	
}
