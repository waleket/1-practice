package Library;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		System.out.println("����� ���������� � ����������!");

		System.out.println("�������� ����� ���������: ");
		String[] categ = { "1) �����", "2) ������� ����", "3) ������� ����������", "4) ������" };
		for (int i = 0; i < 4; i++) {
			System.out.println(categ[i]);
		}

		Scanner in = new Scanner(System.in);
		int stroka = in.nextInt();
		System.out.print("�� ������� ");
		switch (stroka) {
		case 1:
			System.out.printf("����� ");
			break;
		case 2:
			System.out.printf("������� ���� ");
			break;
		case 3:
			System.out.printf("������� ���������� ");
			break;
		case 4:
			System.out.printf("������ ");
		}

		in.close();

	}

}
