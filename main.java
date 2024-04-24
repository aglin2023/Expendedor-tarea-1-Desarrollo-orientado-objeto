import clases.*;
import enums.*;

public class main {
    public static void main (String[] args) {
	Moneda m = new Moneda100();
	Moneda m2 = new Moneda500();
	Moneda m3 = new Moneda1000();

	expendedor e = new expendedor(3);
	Comprador c = new Comprador(m3,ProductList.COCA,e);
    }
}
