package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int var1 = 10;
		byte var2 =(byte)var1;
		System.out.println(var2); // 10은 바이트 범위 내에 들어가서 값 유지
		
		long var3 = 300;
		int var4 = (int)var3;
		System.out.println(var4);
		
		int var5 = 970612;
		char var6  = (char)var5; //정수 -> 유니코드 문자
		System.out.println(var6);
		
		char var7 = '가';
		int var8 = (int)var7; // 문자 -> 유니코드 정수
		System.out.println(var8);
		
		double var9 = 3.1415923;
		int var10 = (int)var9; // 실수 -> 정수 변환시 . 이하 값 버림
		System.out.println(var10);
	}

}
