import java.util.Scanner;

public class Powers {

	/**
	 * @param args
	 */
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (in.hasNext()) {
			runAlg(in.nextInt());
		}
	}

	static void runAlg(int x) {
		if(x == 0){
			return;
		}
		boolean run = true;
		int power = (int) Math.sqrt(x);
		while (run) {
			//System.out.println(power);
			if (Math.pow(x, 1d / power) % 1 == 0) {
				System.out.println(power);
				run = false;
			}
			power--;
		}
	}

}
