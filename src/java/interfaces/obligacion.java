package interfaces;

import java.util.List;

/**
 *
 * @author steven
 */
public interface obligacion<Cualquiercosa> {

    public boolean create(Cualquiercosa nuevo);

    public List<Cualquiercosa> readAll();

    public Cualquiercosa read(Cualquiercosa filter);

    public boolean update(Cualquiercosa item);

    public boolean delete(Cualquiercosa item);

}
