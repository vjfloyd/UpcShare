
package com.upc.share.dao;
import com.upc.share.modelo.Comentario;
import java.util.List;


public class ComentarioDao extends Conexion implements BaseDao<Comentario, Integer>{

    @Override
    public void insertar(Comentario e) throws Exception {
        
    }

    @Override
    public void actualizar(Comentario e) throws Exception {
    
        
    }

    @Override
    public void eliminar(Integer id) throws Exception {
    
    }

    @Override
    public Comentario obtener(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Comentario> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
