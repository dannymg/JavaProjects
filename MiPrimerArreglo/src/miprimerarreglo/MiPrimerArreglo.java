/*
    Unidad Educativa Fiscomisional "Padre Jorge A. Quevedo"
    Nombre:Danny Martínez
    Fecha:03-07-2018
    Curso:2° Tecnico
    CREAR UN ARREGLO INDICE-VALOR
*/
package miprimerarreglo;
public class MiPrimerArreglo {
    public static void main(String[] args) {
        int X[];
        X = new int [10];
        System.out.printf("%s%8s\n","Indice","Valor");            
        for(int i=0; i<=X.length; i++) {
            System.out.printf("%3d%8d\n",i,X[i]); 
        }
    }   
}
