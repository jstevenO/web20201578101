package controlador;

import java.util.List;
import modelo.dto.ProductoDTO;
import modelo.dao.productoDAO;

/**
 *
 * @author steven
 */
public class Facade {

    public List<ProductoDTO> listarProductos() {

        List<ProductoDTO> lista = null;
        productoDAO dao = new productoDAO();
        lista = dao.readAll();
        return lista;
    }

    public boolean borrar(ProductoDTO elim) {
        productoDAO dao = new productoDAO();
        return dao.delete(elim);
    }
}
