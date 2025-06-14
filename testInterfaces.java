
public class testInterfaces {

	public static void main(String[] args) {

		//interface a template can be applied to a class 
		// similar to inheritance, but specifies what a class has/must do 
		// classes can appply more than one interface 
		System.out.println("Esta es una prueba ");
		Rabbit rabbit = new Rabbit();
		rabbit.flee();
		
		Hawk hawk = new Hawk();
		
		hawk.hunt();
//		hawk.flee();
		
		Fish fish = new Fish();
		fish.hunt();
		fish.flee();
		
		
	}

}
