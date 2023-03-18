package ch02.sec07;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte byteValue = 10; // byte = 1byte int = 4byte
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가'; //char = 2byte int = 4byte
		intValue = charValue;
		System.out.println(intValue); // char -> int( 가의 유니코드)
		
		intValue = 50; // int = 4byte long = 8byte
		long longValue = intValue;
		System.out.println(longValue);
		
		longValue = 1000; // long = 8byte, float = 4byte  단 , 크기는 적지면 표현 범위 float가 더 커 가능
		float floatValue = longValue;
		System.out.println(floatValue); // 정수 - > 실수
		
		floatValue = 10.5f; // float = 4byte double = 8 byte\
		double doubleValue = floatValue;
		System.out.println(doubleValue);
		
		intValue = 33;
		//char charValue = intValue; intValue는 음수 범위를 포함하지만 charValue는 양수 0~65535까지임.
		// 음수 값을 양수로 변환 불가능하기때문에 
		// char-> int는 가능하지만 int -> char 변환 불가능
		System.out.println(charValue);
		
	}

}
