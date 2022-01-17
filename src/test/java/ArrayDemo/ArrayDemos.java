package ArrayDemo;

public class ArrayDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		arr[0] =10;
		arr[1]=13;
		arr[2]= 72;
		arr[3]=44;
		arr[4]=22;
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}

	}

}
