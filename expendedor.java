package clases;
import clases.*;
import enums.*;

public class expendedor {
    private Deposito<Moneda> monVu;

    private Deposito<Producto> coca;
    private Deposito<Producto> sprite;
    private Deposito<Producto> fanta;
    private Deposito<Producto> snickers;
    private Deposito<Producto> super8;

    public expendedor(int llenaDeposito){

	// Instanciando los depositos
	monVu = new Deposito<Moneda>();
	
	coca = new Deposito<Producto>();
	sprite = new Deposito<Producto>();
	fanta = new Deposito<Producto>();
	snickers = new Deposito<Producto>();
	super8 = new Deposito<Producto>();

	// Agregando items
	for(int i = 0; i < llenaDeposito; i++){
	    coca.addObject(new CocaCola());
	    sprite.addObject(new Sprite());
	    fanta.addObject(new Fanta());
	    snickers.addObject(new Snickers());
	    super8.addObject(new Super8());
	}
    }

    public Producto comprar(Moneda m, ProductList l) throws PagoInsuficienteException,PagoIncorrectoException,NoHayProductoException{
	if(m == null){
	    throw new PagoIncorrectoException("No ingresaste moneda");
	}
	int vuelto = m.compareTo(l.getPrice());

	if(vuelto < 0){
	    monVu.addObject(m);
	    throw new PagoInsuficienteException("Le faltan: " + -1* vuelto + " monedas");
	}

	Producto p = null;

	if(l.equals(ProductList.COCA)){
	    p = coca.getObject();
	}
	if(l.equals(ProductList.SPRITE)){
	    p = sprite.getObject();
	}
	if(l.equals(ProductList.FANTA)){
	    p = fanta.getObject();
	}
	if(l.equals(ProductList.SNICKERS)){
	    p = snickers.getObject();
	}
	if(l.equals(ProductList.SUPER8)){
	    p = super8.getObject();
	}
	
	if(p == null){
	    monVu.addObject(m);
	    throw new NoHayProductoException("No hay "+ l);
	}
	
	// VUELTO
	int cant_monedas100 = vuelto / 100;
	for(int i = 0; i < cant_monedas100; i++){
	    monVu.addObject(new Moneda100());
	}

	return p;
    }

    // Devuelve solo una moneda de Monvu
    public Moneda getVuelto(){
	return monVu.getObject();
    }
}
