
public class Comprador {
    private String sonido;
    private int vueltoTotal;

    public Comprador(Moneda m, ProductList c, expendedor e) throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException{
        Producto productoComprado= e.comprar(m,c);
        Moneda aux= e.getVuelto();
        while(aux != null) {
            vueltoTotal += aux.getValor();
            aux = e.getVuelto();
        }
        if (productoComprado != null){
            sonido = productoComprado.consumido();
        }
    }
    public int cuantoVuelto() {

        return vueltoTotal;
    }
    public String QueConsumiste(){

        return sonido;

    }
}
