import java.util.*;

public class Dog extends Animal implements Comparable<Dog>{
	
	public Dog(String n, int l) {
		super(n, l);
	}
	
	public String toString() {
		return super.name + " " +super.legs;
	}
	
	public int compareTo(Dog d1) {
		int n = 0;
		if(this.legs == d1.legs) {
			n = this.name.compareTo(d1.name);
		}
		else {
			n = this.legs - d1.legs;
		}
		return n;
	}

	/*
	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<>();
		Dog d1 = new Dog("Fido", 3);
		Dog d2 = new Dog("Fido", 5);
		Dog d3 = new Dog("Abby", 4);
		
		dogs.add(d1);
		dogs.add(d2);
		dogs.add(d3);
		
		System.out.println(dogs);
		
		//Comparator
		Collections.sort(dogs, new AnimalCompare());
		System.out.println(dogs);
		
		//Comparable
		Collections.sort(dogs);
		System.out.print(dogs);
	}
	*/

}
