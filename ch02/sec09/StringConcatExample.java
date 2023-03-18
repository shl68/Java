package ch02.sec09;

public class StringConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result1 = 1 + 2 + 3; 
		String result2 = 1 + 2 + "3"; // 문자 3 + 3
		String result3 = 1 + "2" + 3; // 문자 1 + 2 + 3 
		String result4 = "1" + (2 + 3); // 문자 1 + 우선 연산 정수  5 - 문자열 1 5
		

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		

	}

}
