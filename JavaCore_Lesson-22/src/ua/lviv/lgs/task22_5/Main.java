package ua.lviv.lgs.task22_5;

public class Main {
	
	public static void main(String[] args) {
		Printable eat = () -> System.out.println("Хочу есть!");
		Printable sleep = () -> System.out.println("Хочу спать!");
		Printable swim = () -> System.out.println("Хочу плавать!");
		Printable walk = () -> System.out.println("Хочу гулять!");

		eat.print();
		sleep.print();
		swim.print();
		walk.print();
	}
}
