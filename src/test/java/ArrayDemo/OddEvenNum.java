package ArrayDemo;

public class OddEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,6,9,13,14,17,20,25,30};
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" Even");
			}
			else
			{
				System.out.println(arr[i]+ " Odd");
			}
		}

	}

}
