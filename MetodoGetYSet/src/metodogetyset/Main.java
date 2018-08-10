package metodogetyset;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    double totalpagar;        
    Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de productos: ");
        double cantidad=entrada.nextDouble();
        System.out.print("Ingrese el precio de los productos: ");
        double precio=entrada.nextDouble();
    Producto tupan = new Producto(cantidad, precio);
        totalpagar=tupan.getCalcularVenta();
        System.out.println("El valor total a pagar es " + totalpagar);
    }
}
