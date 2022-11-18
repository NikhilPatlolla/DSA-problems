package OperationPostAndPre;

import java.util.ArrayList;
import java.util.List;

// used for type safe in java 
// the generic in java do not support primitive data types 
public class GenericsExample {
	public static void main(String[] args) {
		Printer<Animal> printer = new Printer<>(new Cat()); // the new Cat() here is the type of the Printer object 
		printer.print();
		Animal variable = printer.thingToPrint;
        System.out.println(variable.hashCode());
		
		
		ArrayList<Object> cats = new ArrayList<>(); // the ArrayList is of type Object, that can store any kind of object in java 
		cats.add(new Cat()); // the ArrayList is storing the Cat obj, which is a child class of Object
		
		
//		Cat myCat = cats.get(0);  results in a compile-time error, as the objects in the ArrayList may not necessarily be of the type cat, 
//		to make it work we need to cast it to type Cat
		Cat mycat = (Cat) cats.get(0); // after casting it to type Cat, we are able to access the object. 
		System.out.println(mycat.hashCode());
	
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("*****************************************");
		
		
		shout("John", 45);
		shout(57, "dfdf");
		Cat variable1 = shoutingAt(new Cat(), "yes");
		System.out.println(variable1);
		
		System.out.println("*****************************************");
		
		List<Cat> inList = new ArrayList<>();
		inList.add(new Cat());
		
		printList(inList); // the Object is the parent of all the classes but the List of Object is not the parent of the List of other classes
		
		
		List<Dog> innerList = new ArrayList<>();
		printAnimalSubClass(innerList);
		
		
	}
	
	private static <T, V> void shout(T thingToShout, V otherThingsToShout) {
		System.out.println(thingToShout + "!!!!");
	}
	
	private static <T, V> T shoutingAt(T thingsToShout, V otherThingsToShout) {
//		System.out.println(thingsToShout + " "+ otherThingsToShout);
		return thingsToShout;
	}
	
	private static void printList(List<? > myList) { // the ? is the wild class type parameter for lists, we can also use extends as below 
		System.out.println(myList);
	}
	
	private static void printAnimalSubClass(List<? extends Animal> myList) {
		System.out.println(myList);
	}

}
