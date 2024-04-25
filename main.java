import clases.*;
import enums.*;

public class main {
    public static void main (String[] args) {
	Moneda m = new Moneda100();
	Moneda m2 = new Moneda500();
	Moneda m3 = new Moneda1000();

	expendedor e = new expendedor(3);
	try{
	    System.out.println(e.comprar(m3,ProductList.COCA).consumido());
	    System.out.println(e.comprar(m3,ProductList.COCA).consumido());
	    System.out.println(e.comprar(m3,ProductList.COCA).consumido());
	    System.out.println(e.comprar(m3,ProductList.COCA).consumido());
	}
	catch(PagoInsuficienteException i){
	    System.out.println(i);
	}
	catch(PagoIncorrectoException i){
	    System.out.println(i);
	}
	catch(NoHayProductoException i){
	    System.out.println(i);
	}
    }
}
