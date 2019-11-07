package lesson3;

public class No31 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Integer count = 0;
		for(Integer hour = 0; hour <= 24; hour++) {
			for(Integer minute = 1; minute <= 60; minute++) {
				for(Integer second = 1; second <= 60; second++) {
					count++;
				}
			}
		}
	}

}
