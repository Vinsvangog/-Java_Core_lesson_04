package ua.lviv.lgs.hw2;

public class Application {
	public static void main(String[] args) {

		Animal animal = new Animal("�������", 20, 7);

		System.out.println("����� ������� = " + animal.getName() + ", �������� ������� = " + animal.getSpeed()
				+ " ��/���, ³� ������� = " + animal.getAge() + " ����");

		animal.setName("���");
		animal.setSpeed(2);
		animal.setAge(14);

		System.out.println("����� ������� = " + animal.getName() + ", �������� ������� = " + animal.getSpeed()
				+ " ��/���, ³� ������� = " + animal.getAge() + " ����");
	}

}
