
package ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 10;
		int num2 = 10;
		
		boolean result = (num1 == num2);
		boolean result1 = (num1 != num2);
		boolean result2 = (num1 <= num2);
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		if(result == false)
			
		{		System.out.println("7시 12분입니다");}
		
		else {
			System.out.println("15시 12분입니다");

		}
		
		char char1 = 'A'; //A와B가 int 타입으로 변환돼 비교
		char char2 = 'B';
		boolean result3 = (char1 <= char2);
		System.out.println(result3);

		int num3 = 1; // 1이 double 타입으로 변환돼 비교
		double num4 = 1.0;
		boolean result4 = (num3 == num4);
		System.out.println(result4);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result5 = (num5 == num6);
		boolean result6 = (num5 == (float)num6); //float 로 형변환
		
		System.out.println(result5);
		System.out.println(result6);
		
		//문자열 비교
		
		String str1 = "java";
		String str2 = "Java";
		
		boolean result7 = str1.equals(str2); //문자열이 같다
		boolean result8 = !str1.equals(str2); //문자열이 같지 않다
		
		System.out.println(result7);
		System.out.println(result8);


		


		
	
	}

}
