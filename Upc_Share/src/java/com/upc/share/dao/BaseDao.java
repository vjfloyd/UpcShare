package com.upc.share.dao;

import java.util.List;

public interface BaseDao<E,J> {
    
    void insertar(E e) throws Exception; 
    void actualizar(E e) throws Exception;
    void eliminar(J id) throws Exception;
    E obtener(J id) throws Exception;
    List<E> listar() throws Exception;  
   
}
