package Library;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		System.out.println("Добро пожаловать в библиотеку!");

		System.out.println("Выберите номер категории: ");
		String[] categ = { "1) Наука", "2) Военное дело", "3) Детская литература", "4) Романы" };
		for (int i = 0; i < 4; i++) {
			System.out.println(categ[i]);
		}

		Scanner in = new Scanner(System.in);
		int stroka = in.nextInt();
		System.out.print("Вы выбрали ");
		switch (stroka) {
		case 1:
			System.out.printf("Наука ");
			break;
		case 2:
			System.out.printf("Военное дело ");
			break;
		case 3:
			System.out.printf("Детская литература ");
			break;
		case 4:
			System.out.printf("Романы ");
		}

		in.close();

	}

}
