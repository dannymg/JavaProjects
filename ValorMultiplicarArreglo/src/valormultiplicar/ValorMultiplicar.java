/*
    Unidad Educativa Fiscomisional "Padre Jorge A. Quevedo"
    Nombre:Danny Martínez
    Fecha:03-07-2018
    Curso:2° Tecnico
    MOSTRAR LA TABLA DEL DOS EN LA COLUMNA VALOR
*/
package valormultiplicar;
public class ValorMultiplicar {
    public static void main(String[] args) {
       int A[];
       A = new int [10];
        System.out.printf("%s%8s\n","Indice","Valor");            
        for(int i=0; i<=A.length; i++) {
            A[i]=2+2*i;
            System.out.printf("%3d%8d\n",i,A[i]); 
        }
    } 
}
