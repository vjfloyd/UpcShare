package com.upc.share.dao;

import com.upc.share.modelo.Curso;
import java.util.List;

public class CursoDao extends Conexion implements BaseDao<Curso, Integer>{

    @Override
    public void insertar(Curso e) throws Exception {
            
        try {
                cn = obtenerConexion();
                cn.setAutoCommit(false);
                cl = cn.prepareCall("{CALL spInsert_Curso(?,?,?,?,?)}");
                
                cl.registerOutParameter(1, java.sql.Types.INTEGER);
                cl.setString(2, e.getNombre());
                cl.setInt(3, e.getCicloCarrera());
                cl.setInt(4, e.getnCreditos());
                
                cl.executeUpdate();
                
                e.setCodCurso(cl.getInt(1));
                
                cn.commit();
                
          }catch (Exception ex){
               rollback(cn);
            throw new Exception(ex);
            
        }finally{
             cerrar(cl);
             cerrar(cn);
        }
    }

    @Override
    public void actualizar(Curso e) throws Exception {
            
        try {
                cn = obtenerConexion();
                cn.setAutoCommit(false);
                cl = cn.prepareCall("{CALL spUpdate_Curso(?,?,?,?,?)}");
                
                cl.registerOutParameter(1, java.sql.Types.INTEGER);
                cl.setString(2, e.getNombre());
                cl.setInt(3, e.getCicloCarrera());
                cl.setInt(4, e.getnCreditos());
                
                cl.executeUpdate();
                cn.commit();
                
          }catch (Exception ex){
               rollback(cn);
            throw new Exception(ex);
            
        }finally{
             cerrar(cl);
             cerrar(cn);
        }
    
    }

    @Override
    public void eliminar(Integer id) throws Exception {
        
        try {
             cn = obtenerConexion();
             cn.setAutoCommit(false);
             
             cl = cn.prepareCall("{CALL spDelete_Curso(?)}");
             cl.setInt(1, id);
             cl.executeUpdate();
             
             cn.commit();
                     
        } catch (Exception ex) {
            rollback(cn);
            throw  new Exception(ex);
           
            
        }finally{
                cerrar(cn);
                cerrar(cl);
        }
    
    
    }

    @Override
    public Curso obtener(Integer id) throws Exception {
            
        Curso c = null;
            
        try {
            cn = obtenerConexion();
            cn.setAutoCommit(false);
            cl = cn.prepareCall("{CALL spObtener_Curso(?)}");
            cl.getInt(id);
            rs = cl.executeQuery();
            
               if( rs.next())
               {
                   c = new Curso();
                   c.setCodCurso( rs.getInt(1));
                   c.setNombre(rs.getString(2));
                   c.setCicloCarrera(rs.getInt(3));
                   c.setnCreditos(rs.getInt(4));
                   
                   
               }
                   
                    
        } catch (Exception ex) {
            throw new Exception(ex);
            
        }finally{
            cerrar(cl);
            cerrar(cn);
            cerrar(rs);
        }
           
        return c;
    }

    @Override
    public List<Curso> listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

