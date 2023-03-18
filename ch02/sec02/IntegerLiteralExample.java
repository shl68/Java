package ch02.sec02;

public class IntegerLiteralExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 0b100;
		int var2 = 020612;
		char var3 = 65;
		int var4 = 0x314f;
		
		System.out.println("var1" + "은 이진수, " + var1 );
		System.out.println("var2" + "은 팔진수, " + var2 );
		System.out.println("var3" + "은 십진수" + var3);
		System.out.println("var4 는 16진수" + var4);
	}

}
