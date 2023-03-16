package 퍼시스그룹;

public class 퍼시스계열사 implements 팀스{
	public static void main(String[] args) {
		퍼시스계열사 p = new 퍼시스계열사();
		p.showStatus();
	}

	@Override
	public void showStatus() {
		// TODO Auto-generated method stub
		System.out.println("나는 퍼시스 계열사다");
	}
}
