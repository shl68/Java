package ch03.sec09;

public class BitShiftExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 772; //[00000000] [00000000] [00000011] [00000100] 

		//우측 3바이트(24bit) 이동., 끝 1바이트만 읽음
		byte byte1 = (byte) (value >>> 24);
		int int1 = byte1 & 255;
		System.out.println(int1);
		
		byte byte2 = (byte) (value >>> 16);
		int int2 = Byte.toUnsignedInt(byte2);
		System.out.println(int2);

;
		byte byte3 = (byte) (value >>> 8);
		int int3 = byte3 & 255;
		System.out.println(int3);
		
		byte byte4 = (byte) (value); // 이동 x
		
		int int4 = Byte.toUnsignedInt(byte4);
		System.out.println(int4);


		
		
		
	}

}
