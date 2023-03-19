package ch03.sec01;

public class SignOperatiorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = - 100;
		x = -x;
		System.out.println(x);
		
		byte b = 100;
		int y = -b;
		System.out.println(y); 	//정수타입 결과 연산은 int, 부호 변환도 연산이기 때문에 int 사용해야 함

	}

}
