package Stringexample;

public class EnhancedForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = {"Raj","Arun","Mohan"};
		
		/*for (int i=0; i<=str.length-1;i++)
		{
			System.out.println(str[i]);
		}*/
		
		for (String name : str)
		{
			System.out.println(name);
		}

	}

}
