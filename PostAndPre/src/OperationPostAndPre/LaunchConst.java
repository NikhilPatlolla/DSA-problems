package OperationPostAndPre;

class Parent {
	int a, b;

	Parent() {
		a = 100;
		b = 200;
		System.out.println("Parent class constructor");
	}
	
	Parent(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("Parent constructor");
	}
}

class ChildOfParent extends Parent {
	int x, y;

	ChildOfParent() {
		// super() is called whether you call or not
		this(111,222);
		x = 300;
		y = 400;
		System.out.println("Child class constructor");
	}

	public ChildOfParent(int i, int j) {
		super(i,j);
		this.x = i;
		this.y = j;
	}

	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(y);
		System.out.println(x);
	}
}

public class LaunchConst {
	public static void main(String[] args) {
		ChildOfParent child = new ChildOfParent();
		child.display();
	}
}
