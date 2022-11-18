package OperationPostAndPre;

public class MethodExample {
	int i = 10;

	public static void main(String[] args) {
		System.out.println();
		new CalculatorC1().add();;

	}

	public void methodOne() {
		// inside instance method instance values can be accessed directly
		System.out.println(i);

	}

}

class CalculatorC1 {
	int a, b, c;

	void add() {
		a = 10;
		b = 20;
		c = a + b;
		int res;
		System.out.println(res=5);
		System.out.println(res);
	}
}
