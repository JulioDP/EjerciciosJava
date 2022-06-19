package inteface;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {

    List<Coche> coches = new ArrayList<Coche>();
    @Override
    public void save(Coche coche) {
        coches.add(coche);
    }

    @Override
    public List<Coche> finAll() {
        return coches;
    }

    @Override
    public void delete(String modelo) {

    }
}
