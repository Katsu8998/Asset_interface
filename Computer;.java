package code11_quizans;

public class Computer extends TangibleAsset {
	String makerName;

	public Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}

	public String getMakerName() {
		return this.makerName;
	}

	public double getWeight() {
		return 0;
	}

	public double setWeight() {
		return 0;
	}
}
