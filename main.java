public class main {
	public static String[] hierba = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde" };
	public static String[] origen = { "Mexico", "Andorra", "Marrueco", "Palestina" };
	public static double[] precio = { 1.70, 4.20, 2.47, 1.33 };

	// Variables publicas extra que considereis

	public static void main(String[] args) {
		String nombre, lugar;
		double cantidad;

		System.out.println("Buenos dias! Que quieres hacer hoy?");

		System.out.println("Usuario selecciona buscar por nombre");
		nombre = "Juana";
		// Codigo para buscar por nombre

		System.out.println("Usuario selecciona buscar por origen");
		lugar = "Andorra";
		// Codigo para buscar por origen

		System.out.println("Usuario selecciona ordenar por precio de menor a mayor");
		// Codigo para ordenar de mayor a menor precio

		System.out.println("Usuario selecciona ordenar por precio de menor a mayor");
		// Codigo para ordenar de mayor a menor precio

		System.out.println("Usuario selecciona varios productos para comprar");
		// Codigo para seleccionar primer producto
		nombre = "Hierba de los bosques";
		cantidad = 3;

		// Codigo para seleccionar segundo producto
		nombre = "El oro verde";
		cantidad = 1;

		// Codigo para seleccionar tercer producto
		nombre = "La seta feliz";
		cantidad = 2.5;
		
		System.out.println("Usuario elimina el segundo elemento de su carrito");
		// Codigo para eliminar elemento del carrito

		System.out.println("Usuario finaliza la compra");
		// Codigo para finalizar la compra y que salga el total de la compra
	}
	
	//Funciones extra que considereis necesarias
}