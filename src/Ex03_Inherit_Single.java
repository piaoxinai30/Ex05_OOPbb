//두개의 설계도
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
class Vcr{ //비디오 플레이어
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
//Tv설계도, Vcr설계도를 활용해서
//TvVcr라는 설계도를 만드세요
//기존에 있는 Tv, Vcr 재사용(활용)하겠다
//활용: 상속, 포함

//class TvVcr extends Tv, Vcr {}  다중상속 불가능
//class Tv extends Vcr
//class TvVcr extends Tv

//선택: 둘중에 하나는 상속, 나머지 하나는 포함으로
//TvVcr 주기능, 메인기능, 보조>> 비중이 높은 클래스를 상속함
//나머지는 포함으로

//둘 다 포함관계
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
		System.out.println("Tv 전원상태:" + t.power);
		t.chUp();
		System.out.println("Tv 채널정보:" + t.ch);
		
		//비디오
		t.vcr.power();
		System.out.println("vcr 전원상태:" + t.vcr.power);
		t.vcr.play();
		t.vcr.stop();
		t.vcr.power();
		t.power();
		System.out.println("Tv 전원상태:" + t.power);
		System.out.println("vcr 전원상태:" + t.vcr.power);
	}

}
