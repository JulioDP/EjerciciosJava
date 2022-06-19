package inteface;
import java.util.List;

public interface CocheCRUD {

    public void save(Coche coche);

    public List<Coche> finAll();

    public void delete(String modelo);
}
