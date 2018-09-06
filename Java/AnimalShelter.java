import java.util.LinkedList;
import java.util.Queue;

public class AnimalShelter{
	
	private Queue<Dog> dogs;
	private Queue<Cat> cats;
	private int size;
	
	public AnimalShelter() {
		dogs = new LinkedList<Dog>();
		cats = new LinkedList<Cat>();
		size=0;
	}
	
	public int size() {return size;}
	public boolean isEmpty() {return size==0;}
	

	public void enqueue(Animal a) throws Exception {
		if(a instanceof Dog)dogs.add((Dog)a);
		if(a instanceof Cat)cats.add((Cat)a);
		else throw new Exception("Not a valid animal");
	}
	
	public Animal dequeueAny(String a)throws Exception {
		String ans = a.toLowerCase();
		if(a.equals("dog"))return dogs.remove();
		if(a.equals("cat"))return cats.remove();
		else throw new Exception("Not a valid Animal");
	}
	
	public Dog dequeueDog() {
		return dogs.remove();
	}
	
	public Cat dequeueCat() {
		return cats.remove();
	}
	
}
abstract class Animal {
	private String name,breed;
	private int age;
	
	public Animal() {
		name=null;
		breed=null;
		age=0;
	}
	
	public Animal(String n,String b, int a) {
		name=n;
		breed=b;
		age=a;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public int age() {
		return age;
	}
	
	public void setName(String n) {name=n;}
	public void setBreed(String b) {breed=b;}
	public void setAge(int a) {age=a;}
	
	public abstract String speak();
	
}

class Dog extends Animal{
	
	/*
	 * Default Constructor
	 */
	public Dog() {
		super();
	}
	
	/*
	 * Three param constructor
	 * @param n the name of the dog
	 * @param b the breed of the dog
	 * @param a the age of the dog
	 */
	public Dog(String n, String b, int a) {
		super(n,b,a);
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return "bark";
	}

}

class Cat extends Animal {
	/*
	 * Default Constructor
	 */
	public Cat() {
		super();
	}
	
	/*
	 * Three param constructor
	 * @param n the name of the cat
	 * @param b the breed of the cat
	 * @param a the age of the cat
	 */
	public Cat(String n, String b, int a) {
		super(n,b,a);
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return "meow";
	}
	

}