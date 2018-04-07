package myPackage.S7;

public class Test {

	private String tester;
	
	public String getTester() {
		return tester;
	}
	public void setTester(tester) {
		this.tester = tester;
	}
	public static int fisrtTester (int test) {
		return 0;
	}
	public static int secondTester () {
		return 1;
	}
	public static void thirdTester () {
		secondTester();
	}
	
	
	//main function
	public static void main(String []args) {
			thirdTerster();
	}
}
