package clases;

import clases.Moneda;
import clases.expendedor;
import enums.ProductList;

public class Comprador {
    private String sonido;
    private int vueltoTotal;

    public Comprador(Moneda m, ProductList c, expendedor e){
        clases.Producto productoComprado= e.comprar(m,c);
        Moneda aux= e.getVuelto();
        vueltoTotal += aux.getValor();
        aux = e.getVuelto();
        if (productoComprado != null){
            clases.Producto = clases.Producto.consumido();
        }
    }
    public int cuantoVuelto() {

        return vueltoTotal;
    }
    public String QueConsumiste(){

        return clases.Producto;



    }
}
