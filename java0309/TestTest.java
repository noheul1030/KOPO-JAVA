package java0309;

public class TestTest extends Doing{
	public TestTest(String name, double version) {
		super(name, version);
	}

	public static void main(String[] args) {
		TestTest test = new TestTest("아빠", 1.2);
		test.getName();
		test.getVersion();
	}

	public static void test() {
		Test0309 aa = new Test0309();
		aa.test();
		
//		NewMember nm = new NewMember();
//		nm.inputNumber2();    // public
//		nm.inputNumber3();    // protected
//		nm.inputNumber5();	  // X (public)
	}

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		super.getName();
	}

	@Override
	public void getVersion() {
		// TODO Auto-generated method stub
		super.getVersion();
	}

}


// override   - implements 껍데기 채우기
//            - extends    추가
// overload   - 같은 함수명 다수
// 자식-------> 부모 super