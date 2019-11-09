package lesson4;

public class No49 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Integer count = 0;
		for(Integer hour = 1; hour <= 24; hour++) {
			for(Integer minute = 1; minute <= 60; minute++) {
				for(Integer second = 1; second <= 60; second++) {
					count = count + 1;
					System.out.println("minuteの値は" + minute + "countの値は" + count + "です");
				}
			}
		}


	}

}
