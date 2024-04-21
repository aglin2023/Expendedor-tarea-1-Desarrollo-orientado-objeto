package clases;
public abstract class Moneda implements Comparable{
    public Moneda(){
    }
    public abstract int getValor();

    public int compareTo(int v){
	return this.getValor()-v;
    }
}
