package javatasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringFrequency {
	static int len = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the input string :");
		String str = r.readLine();

		char[] string = str.toCharArray();
		len = string.length;
		int[] count = new int[len];
		int i = 0, j = 0, k = 0, l = 0, m = 0;
		
		for (i = 0; i < len; i++) {
			count[i] = 1;
			for (j = i + 1; j < len; j++) {

				if (string[i] > string[j]) {
					char temp = string[j];
					string[j] = string[i];
					string[i] = temp;
				}
			}
		}
		
		

		for (k = 0; k < len; k++) {
			for (l = k + 1; l < len; l++) {
				if (string[k] == string[l]) {
					len--;count[k]++;
					for (m = l; m < len; m++) {
						string[m] = string[m + 1];
					}

				}

			}

		}
		
		System.out.println("*************************************");
		for (i = 0; i < len; i++) {
			System.out.println("Alphabet " + string[i] + " is present in : "
					+ count[i] + " times");
		}
		System.out.println("*************************************");
	}

}
