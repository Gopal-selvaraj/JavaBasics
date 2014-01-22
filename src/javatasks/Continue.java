package javatasks;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// task one .........{

		int j = 0;
		while (j < 3) {
			++j;
			if (j == 1) {
				// System.out.println(i);
				continue;
			}
			System.out.println(j);

		}

		// }output was 2 3

		// task two.........{

		int i = 0;
		while (i < 3) {
			if (i == 1) {
				// System.out.println(i);
				continue;
			}
			System.out.println(i);
			++i;
		}

		// }output was 0 and goes to........infinity

	}

}
