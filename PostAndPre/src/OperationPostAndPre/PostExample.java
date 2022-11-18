package OperationPostAndPre;

public class PostExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 2, 3, 4, 5}; 
		int start = 0; 
		System.out.println(arr[start]); //here it is arr[0]; start is => 0 
		System.out.println(arr[start++]); // here it prints arr[0] and increases the start to 1
		System.out.println();
		System.out.println(arr[start--]); // here since start is now at 1, prints arr[1] and start to 0 
//		System.out.println(arr[--start]);
		
	}
}
