package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 123;
		
		char grade = (score > 90) ?  'A' : ((score > 85) ? 'B' : 'C'); // 삼항 연산자가 이중임
		System.out.println(grade);

	}

}
