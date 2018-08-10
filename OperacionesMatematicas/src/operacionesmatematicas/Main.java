package operacionesmatematicas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            int n1,n2;
    Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese n1: ");
        n1=entrada.nextInt();
        System.out.println("Ingrese n2: "); 
        n2=entrada.nextInt();
        
        Operaciones a=new Operaciones();
        a.sumar();
        a.restar();
        a.multiplicar();
        a.dividir();
    }
}
