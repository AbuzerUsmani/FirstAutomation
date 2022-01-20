package InterviewDemo;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int num = {1,2,3,6,12};
		int a = 0;
		int b = 1;
		System.out.print(a+""+b);
		int c ;
	
		
		
		for(int i=0;i<=5;i++)
		{
			c = a+b;
			System.out.print(" "+c);
			a = b;
			b = c;
		}	
		}
}
