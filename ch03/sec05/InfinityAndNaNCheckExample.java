package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x =5;
		double y = 0.0;
	
		
		double z = x / y ; 
		System.out.println(z);
				
		
		if(Double.isInfinite(z) || Double.isNaN(z))	{
			System.out.println("계산 불가능합니다");
			
			} 	
		else 
		{
			System.out.println(z + 2);
		}
	
			
		

		
	}

}
