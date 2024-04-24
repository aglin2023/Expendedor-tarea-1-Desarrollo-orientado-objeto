package clases;

import clases.Moneda;
import clases.expendedor;
import enums.ProductList;

public class Comprador {
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, ProductList c, expendedor e){
	vuelto = 0;	
    }
}
