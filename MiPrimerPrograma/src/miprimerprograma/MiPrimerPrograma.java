/*
    Unidad Educativa Fiscomisional "Padre Jorge A. Quevedo"
    Nombre:Danny Martínez
    Curso:2° Tecnico
    CALCULAR LA SUMA DE 2 NUMEROS 
*/

package miprimerprograma;
import java.util.Scanner;
public class MiPrimerPrograma {

    public static void main(String[] args) {
    //Crear un objeto escaner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int suma;
        
        System.out.print("Escriba el numero 1: ");
    //Ingresar un dato 
        numero1=entrada.nextInt();
        System.out.print("Escriba el numero 2: ");
    //Ingresar el otro dato
        numero2=entrada.nextInt();
    //Suma
        suma=numero1+numero2;
        System.out.println("La suma de los números es "+suma); 
    }
    
}
