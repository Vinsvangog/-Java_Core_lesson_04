package ua.lviv.lgs.hw1;

public class Robot {
	private String name;
	private String workPerformed;

	Robot(String name, String workPerformed) {
		this.name = name;
		this.workPerformed = workPerformed;
	}

	public void work() {
		System.out.println("ß " + name + " - " + workPerformed);

	}
}
