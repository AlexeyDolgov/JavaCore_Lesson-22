package ua.lviv.lgs.task22_2;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		// бросаем монету 10 раз
		for (int i = 0; i < 10; i++) {
			throwCoin();
		}
	}

	public static void throwCoin() {
		int throwResult = (int) (Math.random() * 2);
		checkSide(throwResult, n -> n == 1);
	}

	public static void checkSide(int throwResult, Predicate<Integer> predicate) {
		if (predicate.test(throwResult)) {
			System.out.println("Орел");
		} else
			System.out.println("Решка");
	}
}
