package lesson6;

public class No72 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Integer a;
		a = keisan(0);
		a = keisan(a);
		a = keisan(a);
	}

	public static Integer keisan(Integer a) {
		System.out.println("aの値は" + a + "です");
		return a + 1;
	}
}
