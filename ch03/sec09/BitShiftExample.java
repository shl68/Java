package ch03.sec09;

public class BitShiftExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int result1 = num1 << 3;
		int result2 = num1 * (int) Math.pow(2, 3); // 2^3을 연산하고 더블 값을 산출함 int로 캐스팅함
		
		System.out.println(result1);
		System.out.println(result2);
		
		int num2 = -8;
		int result3 = num2 >> 3;
		int result4 = num2 / (int) Math.pow(2, 3);
		System.out.println(result3);
		System.out.println(result4);


		
		
	}

}
