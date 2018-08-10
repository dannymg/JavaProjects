/*
    Unidad Educativa Fiscomisional "Padre Jorge A. Quevedo"
    Nombre:Danny Martínez
    Fecha:21-06-2018
    Curso:2° Tecnico
    REALIZAR UNA CALCULADORA BASICA CON SWITCH
*/
package calculadora;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float x1;
        float x2;
        int v;
        float suma,resta,multip,division;
        System.out.print("Ingrese numero 1: ");
        x1=entrada.nextFloat();
        System.out.print("Ingrese numero 2: ");
        x2=entrada.nextFloat();
        
        System.out.println("Seleccione una opcion:");
        System.out.println("1:Sumar     3:Multiplicar");
        System.out.println("2:Restar    4:Dividir");
        v=entrada.nextInt();
        switch(v){
            case 1: suma=x1+x2;
                    System.out.println("La suma es "+suma);
            break;
            case 2: resta=x1-x2;
                    System.out.println("La resta es "+resta);
            break;
            case 3: multip=x1*x2;
                    System.out.println("El producto es "+multip);                
            break;
            case 4: division=x1/x2;
                    System.out.println("El cociente es "+division);            
            break;
            default:System.out.println("Opcion incorecta");    
        }
    }
    
}