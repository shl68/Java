package ch03.sec01;

public class IncreaseDecreaseOperatiorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 10;
		int z;
		
		x++; //x를 대입하고 1을 증가
		
		++x; //x에 1을 증가하고 대입
		
		System.out.println("x=" + x);
		System.out.println("====================");
		
		y--;
		--y;
		
		System.out.println("y=" + y);
		
		System.out.println("====================");

		
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("====================");

		
		z = ++x + y++;
		
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);



		
	}

}
