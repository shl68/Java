package ch04.sec02;

public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = (int)(Math.random()*20) + 75;
		
		System.out.println("점수 : " + score);
		
		String grade;
		
		if (score>90) {
			if(score >= 95)
			{		System.out.println("A+");
			
			}
			else {
				System.out.println("A");

			}
		}
			
		else if (score>80) {
			if (score>85)
			{
				System.out.println("B+");

			} else 
			{
				System.out.println("B");

			}
		}
			
		else {
				System.out.println("C");

			}
		}

}
	


