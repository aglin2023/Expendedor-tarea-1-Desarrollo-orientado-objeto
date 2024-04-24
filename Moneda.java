package clases;
public abstract class Moneda implements Comparable<Moneda>{
    public Moneda(){
    }

    public abstract int getValor();

    public int compareTo(Moneda v){
	return this.getValor()-v.getValor();
    }
}
