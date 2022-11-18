package OperationPostAndPre;

public class LL {
	
	private Node head;
	private Node tail;
	
	
	private int size; 
	
	public LL() {
		this.size = 0;
	}

	
	// add a node at the beginning of the list
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail = head;
		}
		
		size++;
	}
	
	// display all the elements in the list, we would not do the same with 
	// head because, after the function the head will be pointing to null
	public void display() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	
	//constant time complexity as tail node is maintained
	public void insertLast(int val) {
		if(tail==null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail = node;
		size++;
	}
	
	public void insert(int value, int index) {
		if(index == 0) {
			insertFirst(value);
			return;
		}
		if(index == size) {
			insertLast(value);
			return;
		}
		
		Node temp = head;
		for(int i=1; i<index; i++) {
			temp = temp.next;
		}
		
		Node node = new Node(value, temp.next);
		temp.next = node;
		size++;
	 }
	
	 public int deleteFirst() {
		 int val = head.value;
		 head = head.next;
		 if(head == null) {
			 tail = null;
		 }
		 size--;
		 return val;
	 }
	 
	 
	 //returns the previous node 
	 public Node get(int index) {
		 Node node = head;
		 for(int i=0; i<index; i++) {
			 node = node.next;
		 }
		 return node;
	 }
	
	
	public int deleteLast() {
		if(size<=1) {
			return deleteFirst();
		}
		
		Node secondLast = get(size-2);
		int val = secondLast.value;
		tail = secondLast;
		tail.next = null;
		size--;
		return val;
	}
	
	
	public int getSize() {
		return size;
	}


//	public void setSize(int size) {
//		this.size = size;
//	}


	public int delete(int index) {
		if(index == 0) {
			return deleteFirst();
		}
		if(index == size-1) {
			return deleteLast();
		}
		
		Node prev = get(index -1);
		int val = prev.next.value;
		prev.next = prev.next.next;
		size--;
		return val;
		
	}
	
	public Node find(int value) {
		Node node = head;
		while(node!= null) {
			if(node.value == value) {
				return node;
			}
			node = node.next;
		}
		return null;
	}
	
	
	//insert using recursion:
	public void insertRec(int val, int index) {
		head = insertRec(val, index, head);
	}
	private Node insertRec(int val, int index, Node node) {
		Node newNode;
		if(index == 0) {
			Node temp = new Node(val, node);
			size++;
			return temp;
		}
		
		newNode = insertRec(val, index-1,node.next);
		if (newNode != null) {
			System.out.println(node);
		}
		node.next = newNode;
		return node;
	}
	
	// A Node class that can only be accessed in the LL class 
	 private class Node{
		private int value;
		private Node next;


		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.value+"";
		}
		
		

		
	}
}
