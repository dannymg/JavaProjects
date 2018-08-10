/*
    Unidad Educativa Fiscomisional "Padre Jorge A. Quevedo"
    Nombre:Danny Martínez
    Fecha:14-06-2018
    Curso:2° Tecnico
    SUMAR LOS ENTEROS PARES DEL 2 AL 20 Y PRESENTAR 
    EL RESULTADO
*/
package sumadeparesfor;
public class SumaDeParesFor {
    public static void main(String[] args) {
        int i;
        int x=0;
        int suma=0;
        for (i=1; i<=10; i++) {
            x=x+2;
            suma=suma+x;
            System.out.println(x);
        }
        System.out.println("La suma es "+suma);
    }
    
}
