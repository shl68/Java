package ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) { //v1 범위
		// TODO Auto-generated method stub

		int v1 = 15;
		
		if(v1>10) {//v2
			int v2 = v1 - 10;
		} //여기까지가 v2 유효
		
		
		int v3 = v1 + /*v2*/ +5; // 여기에서는 v1은 사용 가능 , v2는 불가능
		
		System.out.println(v3);

		} //v1 범위
}

