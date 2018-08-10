package metodogetyset;
public class Producto {
double precio=0; double cantidad=0;
double subtotal; double iva; double total; 
//CONSTRUCTOR SIN PARÁMETROS   
    public Producto(){
        cantidad=0; precio=0;
    }
/*CONSTRUCTOR AL QUE SEW LE DEBEN PASAR 2 PARÁMETROS QUE
    SIRVEN PARA INICIALIZAR LOS ATRIBUTOS DE LA CLASE*/
    public Producto(double cantidad, double precio){
        this.cantidad=cantidad;
        this.precio=precio;
    }
//SETTERS SIRVEN PARA ASIGNAR UN VALOR A LOS ATRIBUTOS    
    public void setPrecio(double precio){
        this.precio=precio;
    }
    public void setCantidad(double cantidad){
        this.cantidad=cantidad;
    }    
//GETTERS SIRVEN PARA OBTENER EL VALOR DE LOS ATRIBUTOS    
    public double getPrecio(){
        return this.precio;
    }
    public double getCantidad(){
        return this.cantidad;
    }      
    public double getCalcularVenta() {
        subtotal=cantidad*precio;
        iva=subtotal*0.12;
        total=subtotal+iva;
        return total;
    }
}
