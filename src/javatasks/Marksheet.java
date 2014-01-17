package javatasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
@SuppressWarnings("resource")
//"Student Mark Sheet"
class Marksheet // create a class as marksheet
{
	public static void main(String ar[]) throws IOException {
		Scanner s = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nos = 0, st = 0, i = 0, j = 0;
		System.out
				.println("Enter the number of students and   number of subjects");
		st = s.nextInt();
		nos = s.nextInt();
		String studentname[] = new String[st];
		String registerno[] = new String[st];
		String subcode[] = new String[nos];
		String subname[] = new String[nos];
		String result[][] = new String[st][nos];
		int[][] marks = new int[st][nos];
		int[] total = new int[nos];
		float[] average = new float[st];
		// Getting the input of studentname, registerno,
		// subjectcode,subjectname,marks to calculate whether he/she is pass or
		// fail in each subjects
		System.out
				.println("Enter the StudentName and Regno should be yearofjoiningdegreerollno e.g 13EEE05");
		while (i < st) {
			studentname[i] = s.next();// "Student Name "
			registerno[i] = s.next();// "Student Register no"
			i++;
		}
		System.out.println("Enter the SubjectCode and SubjectName");
		i = 0;
		while (i < nos) {
			System.out.println("SubjectCode[" + (i) + "] =");
			subcode[i] = br.readLine();// "Subject code "
			System.out.println("SubjectName[" + (i) + "] =");
			subname[i] = br.readLine();// "Subject name "
			i++;
		}
		for (i = 0; i < st; i++) {
			System.out.println("Enter the " + studentname[i] + " Marks ");
			for (j = 0; j < nos; j++) {
				System.out.print(subname[j] + ":");
				marks[i][j] = s.nextInt();// "Marks"
				total[i] = total[i] + marks[i][j];
				if (marks[i][j] >= 50) {
					result[i][j] = "Pass";
				} else {
					result[i][j] = "Fail";
				}
			}
		}
		for (i = 0; i < st; i++) {
			average[i] = (float) total[i] / nos;
			System.out.println("SNO  STUDENTNAME   REGISTERNO");
			System.out.println((i + 1) + " \t " + studentname[i] + " \t "
					+ registerno[i]);
			System.out.println("SUBJECTCODE SUBJECTNAME MARK RESULT");
			for (j = 0; j < nos; j++) {
				System.out.println(subcode[j] + " \t " + subname[j] + " \t "
						+ marks[i][j] + " \t " + result[i][j]);
			}
			System.out.println("TOTAL  AVERAGE");
			System.out.println(total[i] + " \t " + average[i]);
		}
	}
}
