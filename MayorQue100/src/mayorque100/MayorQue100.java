/*
    Unidad Educativa Fiscomisional "Padre Jorge A. Quevedo"
    Nombre:Danny Martínez
    Fecha:07-06-2018
    Curso:2° Tecnico
    CALCULAR LA PRIMERA POTENCIA DE 3 MAYOR QUE 100
*/
package mayorque100;
public class MayorQue100 {
    public static void main(String[] args) {
        int x=3;
        while(x<=100) {
            x=x*3;
        }
        System.out.print("La primera potencia de 3 mayor que 100 es ");
        System.out.println(x);
    }
    
}
