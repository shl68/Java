package ch04.sec05;

import java.util.Scanner; //  scanner 사용하기 위해 

public class KyeControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 1;
		
		while (run)
		{
			
			System.out.println("eeeeeeeeeeeeeeeeeeeeeee");
			System.out.println("1.증속/2.감속/3.정지");
			System.out.println("선택");
			
			String strNum = scanner.nextLine(); // 키보드에 입력한 내용을 읽음
			
			if(speed != 0) {
				
			
			if(strNum.equals("1"))
			{
				speed++;
				System.out.println("현재 속도 = " + speed);
				

			} else if (strNum.equals("2"))
			{
				speed--;
				System.out.println("현재 속도 = " + speed);
				

			} else if (strNum.equals("3") || (speed <= 0)) //여기에 0일때 정지 작성시 1이나 2 입력해도 여기까지 넘어오지 않음
			{
		
				
				run = false;
			}
			
			}
			
			else {
				run =false;
			}


		}
		
		

	}

}
