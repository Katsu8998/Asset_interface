package code11_quizans;

public abstract class TangibleAsset extends Asset implements Thing{
	String color;
	
	//コンストラクタ
	public TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.name = name;
		this.price = price;
		this.color = color;
	}
	//メゾット
	public String getColor() {
		return this.color;}
	
	double gWeight() {
		return this.getWeight();}
	
	double sWeight() {
		return this.setWeight();}
}

