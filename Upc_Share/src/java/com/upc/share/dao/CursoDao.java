package com.upc.share.dao;

import com.upc.share.modelo.Ciclo;
import com.upc.share.modelo.Curso;
import java.util.ArrayList;
import java.util.List;

public class CursoDao extends Conexion implements BaseDao<Curso, Integer>{

    @Override
    public void insertar(Curso e) throws Exception {
            
        try {
            cn = obtenerConexion();
            cn.setAutoCommit(false);
            cl = cn.prepareCall("{CALL usp_insertar_curso(?,?,?,?,?)}");
            cl.setString(1, e.getCodCurso());
            cl.setString(2, e.getNombre());
            cl.setInt(3, e.getnCreditos());
            cl.setString(4, e.getSeccion());
            cl.setInt(5, e.getCiclo().getIdCiclo());
            
            cl.executeQuery();
            
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
            cl = cn.prepareCall("{CALL usp_actualizar_curso(?,?,?,?,?,?)}");

            cl.setInt(1, e.getIdCurso());
            cl.setString(2, e.getCodCurso());
            cl.setString(3, e.getNombre());
            cl.setInt(4, e.getnCreditos());
            cl.setString(5, e.getSeccion());
            cl.setInt(6, e.getCiclo().getIdCiclo());
            
            cl.executeQuery();
            
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
             
             cl = cn.prepareCall("{CALL usp_eliminar_curso(?)}");
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
            cl = cn.prepareCall("{CALL usp_dame_curso(?)}");
            cl.setInt(1, id);
            rs = cl.executeQuery();
            if( rs.next() )
            {
                c = new Curso();
                c.setIdCurso(rs.getInt(1));
                c.setCodCurso(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setnCreditos(rs.getInt(4));
                c.setSeccion(rs.getString(5));
                
                Ciclo ciclo = new Ciclo();
                ciclo.setIdCiclo(rs.getInt(6));
                ciclo.setDCiclo(rs.getString(7));
                
                c.setCiclo(ciclo);
            }
            return c;       
                    
        } catch (Exception ex) {
            throw new Exception(ex);
            
        }finally{
            cerrar(cl);
            cerrar(cn);
            cerrar(rs);
        }
    }

    @Override
    public List<Curso> listar() throws Exception {
        List<Curso> lista = new ArrayList<Curso>();
        try {
            cn = obtenerConexion();
            cn.setAutoCommit(false);
            cl = cn.prepareCall("{CALL usp_listar_cursos}");
            rs = cl.executeQuery();
            while (rs.next()) {                
                Curso c = new Curso();
                c.setIdCurso(rs.getInt(1));
                c.setCodCurso(rs.getString(2));
                c.setNombre(rs.getString(3));
                c.setnCreditos(rs.getInt(4));
                c.setSeccion(rs.getString(5));
                
                Ciclo ci = new Ciclo();
                ci.setIdCiclo(rs.getInt(6));
                ci.setDCiclo(rs.getString(7));
                
                c.setCiclo(ci);
                
                lista.add(c);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cerrar(cl);
            cerrar(cn);
            cerrar(rs);
        }
        return lista;
    }
    
    
}

