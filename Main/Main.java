public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int localVal = 50;
		// Pass by value
		changeVal(localVal);
		System.out.println(localVal);
	}

	static void changeVal(int s) {
		s = 10;
//		System.out.println(s);
	}

}
