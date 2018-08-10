/*
    Unidad Educativa Fiscomisional "Padre Jorge A. Quevedo"
    Nombre:Danny Martínez
    Fecha:07-06-2018
    Curso:2° Tecnico
    CALCULAR EL PROMEDIO DE 3 NUMEROS. SI ES >=7
    MOSTAR "APROBADO".SI NO MOSTAR "REPROBADO"
*/

package aprobadooreprobado;
import java.util.Scanner;
public class AprobadoOReprobado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1;
        float nota2;
        float nota3;
        float suma;
        float promedio;
        float var;
        
        System.out.print("Escriba la nota 1: "); 
        nota1=entrada.nextFloat();
        System.out.print("Escriba la nota 2: ");
        nota2=entrada.nextFloat();
        System.out.print("Escriba la nota 3: ");
        nota3=entrada.nextFloat();
        suma=nota1+nota2+nota3;
        promedio=suma/3;
        
        System.out.println("El promedio es "+promedio);
        
        if(promedio>=7) {
            System.out.println("Aprobado");
        }
        if(promedio<=5) {
            System.out.println("Reprobado");
        }
        if(promedio==6) {
            System.out.println("Recuperacion");
        }
    }
} 
