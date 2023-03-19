package ch03.sec03;

public class OverflowUnderflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte var1 = 125; // byte 범위 -128 ~ +127
		for(int i =0; i<5; i++) {
			var1++;
			System.out.println(var1);
			
			
		}
		
		short var2 =32760; // short 범위 -32768 ~ 32767
		for(int i=0; i<10; i++)
		{
			var2++;
			System.out.println(var2);

		}
	}

}
