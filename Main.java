
public class Main {

	public static void main(String[] args) {
		// Define un triangulo
 		Triangulo t1 = new Triangulo("Bermudas", 20, 10, 15);
		Triangulo t = new Triangulo("Triángulo T", 200, 100, 150);
		
		//Manda a llamar la funcion
		Main.imprimirCalculos(t1);
		Main.imprimirCalculos(t);
		
	}//main
// Crear las clases de todas las figuras 
	// interface FiguraGeometria
// Implementar la interface en todas las figuras
	
	public static void imprimirCalculos(Triangulo t) {
		System.out.println(t);
		System.out.println("+-----------------------------------+");
		System.out.println("| El área de [" + t.getNombre()
				+ "]");
		System.out.println("| es " + t.calcularArea());
		System.out.println("| El perímetro de [" + t.getNombre()
				+ "]");
		System.out.println("| es " + t.calcularPerimetro());
		System.out.println("| TOSTRING " + t.toString());
		System.out.println("+-----------------------------------+");
	}//imprimirCalculos
	
	
}//class Main
