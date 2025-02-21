package Paquete;
public class Carrito {
    public String[] nombres;
    public double[] cantidades;
    public double[] precios;
    public int cantidadProductos;

    public Carrito() {
        nombres = new String[10]; // Máximo 10 productos
        cantidades = new double[10];
        precios = new double[10];
        cantidadProductos = 0;
    }

    public void agregarProducto(String nombre, double precio, double cantidad) {
        if (cantidadProductos < 10) {
            nombres[cantidadProductos] = nombre;
            precios[cantidadProductos] = precio;
            cantidades[cantidadProductos] = cantidad;
            cantidadProductos++;
            System.out.println(nombre + " agregado al carrito.");
        } else {
            System.out.println("El carrito está lleno.");
        }
    }

    public void eliminarProducto(String nombreProducto) {
        for (int i = 0; i < cantidadProductos; i++) {
            if (nombres[i].equalsIgnoreCase(nombreProducto)) {
                for (int j = i; j < cantidadProductos - 1; j++) {
                    nombres[j] = nombres[j + 1];
                    precios[j] = precios[j + 1];
                    cantidades[j] = cantidades[j + 1];
                }
                cantidadProductos--;
                System.out.println("Producto eliminado del carrito.");
                return;
            }
        }
        System.out.println("Producto no encontrado en el carrito.");
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            total += precios[i] * cantidades[i];
        }
        return total;
    }

    public void mostrarCarrito() {
        if (cantidadProductos == 0) {
            System.out.println("El carrito está vacío.");
            return;
        }

        System.out.println("\nCarrito de compras:");
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println(nombres[i] + " x" + cantidades[i] + " = " + (precios[i] * cantidades[i]) + "€");
        }
        System.out.println("Total: " + calcularTotal() + "€");
    }
}
