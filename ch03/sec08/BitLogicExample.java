package ch03.sec08;

public class BitLogicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("45 & 25 - " + (45 &25));
		System.out.println("45 | 25 - " + (45 | 25));
		System.out.println("45 ^ 25 - " + (45 ^25));
		System.out.println("!45 = " + (~45));
		
		byte receiveData = -120; //c로부터 받아온 데이터  0~256
		
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		
		int unsignedInt2 = Byte.toUnsignedInt(receiveData) ;
		System.out.println(unsignedInt2);



		
	}

}
