
public class MyDogProgram {

	public static void main(String[] args) {
		System.out.println("Hej");
		Dog d = new Dog ();
		Dog d2 = new Dog ();
		
		d.age = 35;
		d.name = "Lassie";
		d.breed = "Border-Collie";
		
		d2.age = 1;
		d2.name = "Emil";
		d2.breed = "Border-Collie";
		d2.mother = d;
		d2.father = d;
		
		System.out.println(d.name);
		System.out.println(d2.name);

	}

}
