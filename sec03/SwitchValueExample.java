package ch04.sec03;

public class SwitchValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String grade = "A";
		
		
		int score1 = 0;
		
		switch(grade)	{
		
		case "A" :
			score1 = 100;
			break;
		
		case "B" :
			int result = 100 - 20;
			score1 = result; //result =  score1로 작성시 오류 result 값을 score에 저장해야 하기 때문
			break;
		
		default :
			score1 = 0;
		}
		
		System.out.println("점수는 : " + score1);

		
		//Java 12 지원
		
		int score2 = switch(grade)	{
		
		case "A" -> 100; //grade에 100 저장
		case "B" -> { //연산 시작
			int result = 100 - 20;
			yield result;
		}
		default -> 0;
		
				
		
	};
	System.out.println("점수2는 : " + score2 );


}
}
