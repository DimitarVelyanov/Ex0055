import java.util.Scanner;

public class Main {
	private static Scanner in = new Scanner(System.in);

	public static void f1(String name) {
		System.out.println("Greetings, " + name + "!");
	}

	public static int f2(int a, int b, int c) {
		return a * b * c;
	}

	public static void f3(int number) {
		if (number % 2 == 0) {
			System.out.println("четно");
		} else {
			System.out.println("нечетно");
		}
	}

	public static int MaxNumber(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {

		f1("Ivan");

		for (int i = 0; i < 10; i++) {
			System.out.println(f2((int) (Math.random() * 10), (int) (Math.random() * 15), (int) (Math.random() * 20)));
		}

		for (int i = 0; i < 10; i++) {
			f3((int) (Math.random() * 10));
		}

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = MaxNumber(a, b);
		System.out.println(MaxNumber(c, d));
	}
}