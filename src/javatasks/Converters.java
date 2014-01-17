package javatasks;

import java.util.Scanner;

class miletokm extends Converters {
	Scanner s = new Scanner(System.in);
	int sm, em;

	miletokm() {
		System.out
				.println("Enter the StartingMile and EndingMile to convert into kilometer");
		sm = s.nextInt();
		em = s.nextInt();
		while (sm <= em) {
			System.out.println(sm + "Mile =" + sm * 1.690935 + " KiloMeter");
			sm++;
		}
	}
}

class cmtom extends Converters {
	Scanner s = new Scanner(System.in);
	int scm, ecm;

	cmtom() {
		System.out
				.println("Enter the StartingCentimeter and EndingCentimeter to convert into meter ");
		scm = s.nextInt();
		ecm = s.nextInt();
		while (scm <= ecm) {
			System.out.println(scm + "Centimeter = " + scm * 0.01 + " Meter");
			scm++;
		}
	}
}

public class Converters {
	public static void main(String[] args) {
		new miletokm();
		new cmtom();
	}
}
