package ua.lviv.lgs.task22_1;

public class Main {

	public static void main(String[] args) {
		Pet cow = () -> "Мууу... Я - корова";
		Pet cat = () -> "Мяууу... Я - кошка";
		Pet dog = () -> "Гав-гав... Я - пес";

		voice(cow.voice(), "Марта");
		voice(cat.voice(), "Мурка");
		voice(dog.voice(), "Джэк");
	}

	public static void voice(String voice, String name) {
		System.out.println(voice + " " + name + "!");
	}

}
