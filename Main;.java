package code11_quizans;

public class Main {

	public static void main(String[] args) {
		//コンストラクト生成
		TangibleAsset ta2 = new Computer("パソコン", 45000,"白", "パナソニック");//コンピュータクラスからインスタンスを生成し、ta2に入れる
		System.out.println(ta2.name);
		System.out.println(ta2.price);
		System.out.println(ta2.color);

		Asset ta3 = new Book("パソコン2", 42000, "黒", "赤");
		System.out.println(ta3.name);
		System.out.println(ta3.price);
		
		System.out.println(ta2.getWeight());
	}

}