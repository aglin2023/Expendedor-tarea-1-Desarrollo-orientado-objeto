<<<<<<< HEAD
package clases; 
=======
package clases;
>>>>>>> 3db3822d794068c10096b3980a4f5fedf9f5c593
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
}