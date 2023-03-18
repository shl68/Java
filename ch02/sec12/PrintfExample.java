package ch02.sec12;

public class PrintfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int value =123;
		
		// % 순번[$] flag[ , -, 0] width [ 자릿수 ] , precision [ 소수자릿수] ☆ 변환문자 [ d, s, f]
		
		System.out.printf("%d원\n", value);
		System.out.printf("%6d원\n", value);
		System.out.printf("%-6d원\n",value);
		System.out.printf("%06d원\n",value);  //06과 6은 구분됨
		
		double area =3.14159 * 10 * 10;
		System.out.printf("반지름이 10인 원의 넓이: %-6.2f \n", area); //소숫점 자리도 생각

		String name = "이학현";
		String job = "학생";
		System.out.printf("1 : %-10s : %10s" , name, job);


	}

}
