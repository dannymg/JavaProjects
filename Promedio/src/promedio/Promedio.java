/*
    Unidad Educativa Fiscomisional "Padre Jorge A. Quevedo"
    Nombre:Danny Martínez
    Curso:2° Tecnico
    CALCULAR EL PROMEDIO DE UN ESTUDIANTE CON 3 NOTAS
*/

package promedio;
import java.util.Scanner;
public class Promedio {
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;
        float suma;
        float promedio;
        
        System.out.println("Ingrese la nota 1: ");
        nota1=entrada.nextFloat();
        System.out.println("Ingrese la nota 2: ");
        nota2=entrada.nextFloat();
        System.out.println("Ingrese la nota 3: ");
        nota3=entrada.nextFloat();   
        
        suma=nota1+nota2+nota3;
        System.out.println("La suma de las notas es "+suma);
        
        promedio=suma/3;
        System.out.println("El promedio es "+promedio);
    }
    
}
