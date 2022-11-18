package OperationPostAndPre;

public class OwnArrayList {
	private int[] data;
	private static int DEFAULT_SIZE = 10;  // with initial size of 10 
	private int size = 0;
	
	
	//constructor without any parameter
	public OwnArrayList() {
		this.data = new int[DEFAULT_SIZE];
	}
	

	public void add(int num) {
		if(isFull()) { 
			resize();
		}
		data[size++] = num;  // see the Post and Pre increment example
	}

	private void resize() {
		int[] temp = new int[data.length*2]; 
		for (int i = 0; i < temp.length; i++) {
			temp[i] = data[i]; 
		}
		data = temp; 
	}

	private boolean isFull() {
		return size == data.length;
	}
	
	
	// methods we use in the custom arraylist, should be public hence 
	
	public int remove() {
		if(data.length!= 0) {
			int removed = data[--size];
			return removed;
		}
		return -1; 
	}
	
	public int get(int index) {
		return data[index];
	}
	
	public void set(int index, int value) {
		data[index] = value;
	}
	
	public int size() {
		return size; 
	}
	
	
	
	//driver method 
	public static void main(String[] args) {
		OwnArrayList list = new OwnArrayList();
		list.add(34);
		list.size();
		list.remove();
		
		
	}

}
