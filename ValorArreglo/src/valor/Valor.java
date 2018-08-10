/*
    Unidad Educativa Fiscomisional "Padre Jorge A. Quevedo"
    Nombre:Danny Martínez
    Fecha:03-07-2018
    Curso:2° Tecnico
    COLOCAR VALORES AL ARREGLO Y MOSTRARLAS COMO VALOR
*/
package valor;
public class Valor {
    public static void main(String[] args) {
        int A[]={20,10,45,2,13};
        System.out.printf("%s%8s\n","Indice","Valor");            
        for(int i=0; i<=A.length; i++) {
            System.out.printf("%3d%8d\n",i,A[i]); 
        }
    }
}
