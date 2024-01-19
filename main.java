package tecnologia;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class main {
    // variables globales
    private static Scanner scanner = new Scanner(System.in);
    private static Map<Integer, String> categories = new HashMap<>();
    private static Map<Integer, List<Producto>> inventory = new HashMap<>();
    private static boolean condition = true;
    //
    public static void main(String[] args) {
        while (condition) {
            System.out.println("*************************");
            System.out.println("       MENU");
            System.out.println("1. Agregar producto");
            System.out.println("2. Quitar un producto");
            System.out.println("3. Modificar producto");
            System.out.println("4. Mostrar el inventario por categoria");
            System.out.println("5. Mostrar las categorias");
            System.out.println("7. Salir");
            System.out.println("");
            System.out.println("Digite el numero de la opcion que desea realizar: ");
            System.out.println("*************************");
            int opcion;
            opcion = scanner.nextInt();
            try{
                switch (opcion) {
                    case 1:
                        AgregarProducto();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 7:
                        System.out.println("Gracias por usar el programa");
                        condition = false;
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }
            catch(Exception e){
                System.out.println("Opcion no valida");
                scanner.nextLine();
                condition = true;
            }

        }
    }
    public static void AgregarProducto() {
        // Crear un nuevo producto
        Producto producto = new Producto("hola", 1, 1, 1, 1);
        Categoria categoria = new Categoria("hola");
        // Agregar el producto a la lista
        List<Producto> productos = inventory.getOrDefault(producto.getName(), new ArrayList<>());
        productos.add(producto);
        inventory.put(producto.getCategoria(), productos);
    }
    
}
