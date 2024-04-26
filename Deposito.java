
import java.util.ArrayList;
public class Deposito<T>{

    private ArrayList<T> arrayList;

    public Deposito(){
        arrayList = new ArrayList<T>();
    }

    public void addObject(T producto) {
        arrayList.add(producto);
    }

    public T getObject() {
        if (arrayList.size() != 0)
            return arrayList.remove(0);
        return null;
    }
}
