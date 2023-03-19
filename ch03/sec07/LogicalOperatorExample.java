package ch03.sec07;

class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int charCode = '0';
		//int charCode = 'a';
		 int charCode ='C';
		
		if ((65<=charCode) && (charCode<=90))
		{
			System.out.println("대문자");

		}
		
		if((97<=charCode) && (charCode<=122))
		{
			
			System.out.println("소문자");

		}
		
		if((48<=charCode) && (charCode<=57))
		{
			System.out.println("0~9숫자");


			
		}
		
		//int value = 6;
		//int value = 10;
		int value = 15;
		
		if ((value%5==0) | (value%3==0))
		{
			
			System.out.println("5또는 3의 배수이군요");

		}
		
		boolean result = (value%5==0) || (value%3==0);
		if(result == false)
		{
			System.out.println("5또는 3의 배수가 아니군요");

		}
		

	}

}
