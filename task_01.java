import java.util.Scanner;

public class task_01 {
	public static void main(String[] args) {
		Scanner iScanner = new Scanner(System.in);
		System.out.print("Введите первое число: ");
		double num1 = iScanner.nextDouble();
		System.out.print("Введите действие (+, -, * или /): ");
		String act = iScanner.next();
		System.out.print("Введите второе число: ");
		double num2 = iScanner.nextDouble();
		iScanner.close();
		double res = 0;
		switch (act) {
			case ("+"):
				res = num1 + num2;
				break;
			case ("-"):
				res = num1 - num2;
				break;
			case ("*"):
				res = num1 * num2;
				break;
			case ("/"):
				res = num1 / num2;
				break;
			default:
				System.out.print("Неправильное действие!");
				break;
		}
		System.out.println("Результат операции: " + res);
		// System.out.print("Хотите произвести ещё расчёт? (Введите 'Да' или 'Нет'): ");
		// String answer = iScanner.next().toLowerCase();
	}
}
