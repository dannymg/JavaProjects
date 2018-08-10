/*
    Unidad Educativa Fiscomisional "Padre Jorge A. Quevedo"
    Nombre:Danny Martínez
    Curso:2° Tecnico
    CALCULAR EL AREA DE UN TRIANGULO
*/

package areatriangulo;
import java.util.Scanner;
public class AreaTriangulo {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        float base;
        float altura;
        float area;
        
        System.out.println("Ingrese la medida de la base: ");
        base=entrada.nextFloat();
        System.out.println("Ingrese la medida de la altura: ");
        altura=entrada.nextFloat();
        
        area=base*altura/2;
        System.out.println("el area del triangulo es "+area);
        
        
    }
    
}
