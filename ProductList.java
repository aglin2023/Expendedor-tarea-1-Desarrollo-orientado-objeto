

public enum ProductList{
    COCA(1000),SPRITE(300),FANTA(1200),SNICKERS(100),SUPER8(100);

    private ProductList(final int price){
	m = new Moneda(){
	    public int getValor(){
		return price;
	    }
	};
    }

    private Moneda m;

    public Moneda getPrice(){
	return m;
    }
}
