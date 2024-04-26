import clases.*;
import enums.*;

public class main {
    public static void main (String[] args) {
	Moneda m = new Moneda100();
	Moneda m2 = new Moneda500();
	Moneda m3 = new Moneda1000();

	expendedor e = new expendedor(2);

	try{
	    Comprador c = new Comprador(m3,ProductList.SNICKERS,e);
	    System.out.println(c.cuantoVuelto());

	    Comprador c2 = new Comprador(m3,ProductList.COCA,e);
	    System.out.println(c2.QueConsumiste());

	    Comprador c3 = new Comprador(m3,ProductList.COCA,e);
	    System.out.println(c3.QueConsumiste());
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
