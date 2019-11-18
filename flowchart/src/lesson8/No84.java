package lesson8;

public class No84 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Integer a = 2;
		Integer b = 4;
		if( a > b) {
			for(Integer i =1; i <= 3; i++) {
				a = a + 1;
				System.out.println("a=" + a + "、b=" + b + "、i =" + i);
			}
		}else{
			for(Integer j = 1; j <= 3; j++) {
				b = b + 1;
				System.out.println("a=" + a + "、b=" + b + "、j =" + j);
				}
			}
	}

}
