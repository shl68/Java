package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자 - 숫자 - 문자도 해보기
		
		String a = "1";
		String pi = "3.141592";
		String bool = "true";
		
		int value1 = Integer.parseInt(a); //문자 - 숫자
		double value2 = Double.parseDouble(pi); // value 값에도 형식을 맞춰놓아야 함
		boolean value3 = Boolean.parseBoolean(bool); //문자 - 불리언
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		String value4 = String.valueOf(value3);
		System.out.println(value4); //불리언 - 문자
		
		String str1 = String.valueOf(value1);
		String str2 = String.valueOf(value2);
		
		System.out.println(value1); // 숫자 - 문자
		System.out.println(value2); // 실수 - 문자


		
		

	}

}
