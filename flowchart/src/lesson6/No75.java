package lesson6;

public class No75 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Integer a;
		System.out.println("処理１を通過");
		a = keisan(0);
		System.out.println("処理2を通過");
		System.out.println("aの値は" + a + "です");
		System.out.println("処理を終了しました");


	}

	public static Integer keisan(Integer a) {
		System.out.println("処理3を通過");
		return a + 1;
	}

}
