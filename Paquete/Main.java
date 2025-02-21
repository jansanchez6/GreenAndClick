package Paquete;
import java.util.Scanner;

public class Main {
    public static String[] hierba = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde" };
    public static String[] origen = { "Mexico", "Andorra", "Marrueco", "Palestina" };
    public static double[] precio = { 1.70, 4.20, 2.47, 1.33 };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrito carrito = new Carrito();
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("Menú Principal:");
            System.out.println("1. Buscar producto por nombre");
            System.out.println("2. Buscar producto por origen");
            System.out.println("3. Ordenar productos por precio");
            System.out.println("4. Agregar producto al carrito");
            System.out.println("5. Eliminar producto del carrito");
            System.out.println("6. Ver carrito");
            System.out.println("7. Finalizar compra");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            if (opcion == 1) {
                System.out.print("Introduce parte del nombre a buscar: ");
                String nombreBuscar = scanner.nextLine();
                buscarPorNombre(nombreBuscar);
            } else if (opcion == 2) {
                System.out.print("Introduce el origen a buscar: ");
                String origenBuscar = scanner.nextLine();
                buscarPorOrigen(origenBuscar);
            } else if (opcion == 3) {
                System.out.println("1. Ordenar de menor a mayor\n2. Ordenar de mayor a menor");
                int orden = scanner.nextInt();
                ordenarPorPrecio(orden == 1);
            } else if (opcion == 4) {
                System.out.print("Introduce el nombre del producto: ");
                String nombreAgregar = scanner.nextLine();
                System.out.print("Introduce la cantidad: ");
                double cantidad = scanner.nextDouble();
                agregarProductoAlCarrito(carrito, nombreAgregar, cantidad);
            } else if (opcion == 5) {
                System.out.print("Introduce el nombre del producto a eliminar: ");
                String nombreEliminar = scanner.nextLine();
                carrito.eliminarProducto(nombreEliminar);
            } else if (opcion == 6) {
                carrito.mostrarCarrito();
            } else if (opcion == 7) {
                System.out.println("Total a pagar: " + carrito.calcularTotal() + "€");
                System.out.println("¡Gracias por tu compra!");
                opcion = 0; // Salir después de la compra
            } else if (opcion == 0) {
                System.out.println("Saliendo de la tienda...");
            } else {
                System.out.println("Opción no válida, intenta de nuevo.");
            }
        }
        scanner.close();
    }

    public static void buscarPorNombre(String nombre) {
        System.out.println("Resultados de búsqueda:");
        for (int i = 0; i < hierba.length; i++) {
            if (hierba[i].toLowerCase().contains(nombre.toLowerCase())) {
                System.out.println(hierba[i] + " | Origen: " + origen[i] + " | Precio: " + precio[i] + "€");
            }
        }
    }

    public static void buscarPorOrigen(String lugar) {
        System.out.println("Productos de origen " + lugar + ":");
        for (int i = 0; i < hierba.length; i++) {
            if (origen[i].equalsIgnoreCase(lugar)) {
                System.out.println(hierba[i] + " | Precio: " + precio[i] + "€");
            }
        }
    }

    public static void ordenarPorPrecio(boolean menorAMayor) {
        for (int i = 0; i < precio.length - 1; i++) {
            for (int j = 0; j < precio.length - 1 - i; j++) {
                if ((menorAMayor && precio[j] > precio[j + 1]) || (!menorAMayor && precio[j] < precio[j + 1])) {
                    double tempPrecio = precio[j];
                    precio[j] = precio[j + 1];
                    precio[j + 1] = tempPrecio;

                    String tempNombre = hierba[j];
                    hierba[j] = hierba[j + 1];
                    hierba[j + 1] = tempNombre;

                    String tempOrigen = origen[j];
                    origen[j] = origen[j + 1];
                    origen[j + 1] = tempOrigen;
                }
            }
        }
        System.out.println("Productos ordenados:");
        for (int i = 0; i < hierba.length; i++) {
            System.out.println(hierba[i] + " | Precio: " + precio[i] + "€");
        }
    }

    public static void agregarProductoAlCarrito(Carrito carrito, String nombre, double cantidad) {
        for (int i = 0; i < hierba.length; i++) {
            if (hierba[i].equalsIgnoreCase(nombre)) {
                carrito.agregarProducto(hierba[i], precio[i], cantidad);
                return;
            }
        }
        System.out.println("ºProducto no encontrado.");
    }
}
