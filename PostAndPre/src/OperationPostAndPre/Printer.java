package OperationPostAndPre;

public class Printer<T extends Animal> { //this is called as bounded generic, will be the same even if there is an interface in place of a Class
	T thingToPrint;
	
	public Printer(T thingsToPrint) {
		this.thingToPrint = thingsToPrint;
		
	}

	public void print() {
		thingToPrint.eat();
		System.out.println(thingToPrint);
		
	}

}
