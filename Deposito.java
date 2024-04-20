import java.util.ArrayList;
public class Deposito<T>{

    private ArrayList<T> arrayList;

    public Deposito(int Capacidad){
        arrayList = new ArrayList<T>(Capacidad);
    }

    public void addObject(T bebida) {
        arrayList.add(bebida);
    }

    public T getObject() {
        if (arrayList.size() != 0)
            return arrayList.remove(0);

        return null;
    }
}
