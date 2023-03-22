package ch04.sec05;

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<10; i++)
		{
			if(i%2 != 0)
			{
				continue; //홀수일 경우 for문으로 돌아감
			}
			System.out.println(i);
		}
		

	}

}
