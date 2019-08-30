package kr.or.bit;

//DTO, VO, DOMAIN
public class Emp { //extends Object(생략되어있음)
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
	//개발자 toString() 재정의하는거 좋아함
	//Object가 가지고 있는 toStrng() 주소갑을 출력
	//[주소값 출력]보다는 재정의를 통해 member field의 데이터 값 출력하는 것으로 사용된다

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
	
	
	
	
	
}
