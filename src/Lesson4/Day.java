package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of the day: ");
		int n = Integer.parseInt(br.readLine());
		
		switch (n) {
		case 1: System.out.println("�������� -���, Monday -en, Montag -ger"); break;
		case 2: System.out.println("³������ -���, Tuesday -en, Dienstag -ger"); break;
		case 3: System.out.println("������ -���, Wednesday -en, Mittwoch -ger"); break;
		case 4: System.out.println("������� -���, Thursday -en, Donnerstag -ger"); break;
		case 5: System.out.println("������� -���, Friday -en, Freitag -ger"); break;
		case 6: System.out.println("������ -���, Saturday -en, Samstag -ger"); break;
		case 7: System.out.println("����� -���, Sunday -en, Sonntag -ger"); break;
		default:
			System.out.println("You must enter the day of the week (from 1 to 7)!");
			System.exit(0);
		}


	}

}
