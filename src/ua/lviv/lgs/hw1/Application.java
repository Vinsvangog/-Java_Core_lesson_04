package ua.lviv.lgs.hw1;

public class Application {
	public static void main(String[] args) {

		Robot r1 = new Robot("Robot", "� ������ ������");
		CoffeRobot r2 = new CoffeRobot("CoffeRobot", "� ���� ����");
		RobotDancer r3 = new RobotDancer("RobotDancer", "� ������ ������");
		RobotCoocker r4 = new RobotCoocker("RobotCoocker", "� ������ �����");
		r1.work();
		r2.work();
		r3.work();
		r4.work();

		System.out.println();

		Robot robots[] = new Robot[4];
		robots[0] = r1;
		robots[1] = r2;
		robots[2] = r3;
		robots[3] = r4;

		for (int i = 0; i < 4; i++) {
			robots[i].work();
		}
	}
}
