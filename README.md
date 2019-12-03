# cisc275-fall2019-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?

	1.) Three Dog objects are created and added to an ArrayList of Dog objects.
	2.) The ArrayList of Dog objects (dogs) is another object.
	3.) A new Comparator object is created in call to Collections.sort()

3. Can you spot the Comparator constructor call? Where is the class definition for the Comparator?

Comparator is an Interface, and interfaces do not have constructors. When new Comparator<Animal>() is called, an instance of an anonymous class that implements Comparator is created but not seen. The class definition for that class would be in a separate class from MyCompare3 that is not seen.
