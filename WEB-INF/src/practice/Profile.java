package practice;

public class Profile {

	//人数のカウント用フィールド
	static private int person = 0;
	public String family = null;
	public String first = null;
	public int age = 0;
	public String food = null;

	public Profile(){
		person ++;
	}

	//プロフィール設定用
	public Profile(String family,String first,int age,String food){
		this.family = family;
		this.first = first;
		this.age = age;
		this.food = food;
		person ++;
	}



	public Profile name(){
		System.out.println("私の名前は" + family + " " + first + "です。");
		return this;
	}

	public Profile age(){
		System.out.println("年齢は" + age + "です。");
		return this;
	}

	public Profile like_food(){
		System.out.println("好きな食べ物は" + food + "です。");
		return this;
	}

	static public void person(){
		System.out.println("人数は" + person + "人");
	}

}
