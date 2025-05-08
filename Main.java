
public class Main {

	public static void main(String[] args) {
		Triangulo t1 = new Triangulo("Bermudas", 20, 10, 15);
		Triangulo t = new Triangulo("Triángulo T", 200, 100, 150);
		
		Main.imprimirCalculos(t1);
		Main.imprimirCalculos(t);
	}//main
// Crear las clases de todas las figuras 
	// interface FiguraGeometria
// Implementar la interface en todas las figuras
	
	public static void imprimirCalculos(FiguraGeometria t) {
		System.out.println(t);
		System.out.println("+-----------------------------------+");
		System.out.println("| El área de [" + t.getNombre()
				+ "]");
		System.out.println("| es " + t.calcularArea());
		System.out.println("| El perímetro de [" + t.getNombre()
				+ "]");
		System.out.println("| es " + t.calcularPerimetro());
		System.out.println("+-----------------------------------+");
	}//imprimirCalculos
	
	
}//class Main
