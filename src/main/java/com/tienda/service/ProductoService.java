
package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    //Se define la firma del metodo para obtener los registros de producto, en forma de lista
    public List<Producto> getProductos(boolean activo);
    
    //Se recupera un registro tomando el idProducto como clave de busqueda
    public Producto getProducto(Producto producto);
    
    //Si idProducto tiene un valor, se modifica ese registro,
    //Si idProducto no tiene un valor, se inserta un nuevo registro
    
    public void save (Producto producto);
    
    //Se elimina el registro que tenga el valor del idProducto pasado
    public void delete (Producto producto);
}
