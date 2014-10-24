package com.upc.share.dao;

import com.upc.share.modelo.Usuario;
import java.util.ArrayList;
import org.apache.catalina.startup.SetNextNamingRule;
import java.util.List;

public class UsuarioDao extends Conexion implements BaseDao<Usuario, Integer>{

    @Override
    public void insertar(Usuario u) throws Exception {
    
        try {
            
            cn = obtenerConexion();
            cn.setAutoCommit(false);

            cl = cn.prepareCall("{CALL usp_insertar_usuario(?,?,?,?,?,?,?,?)}");
            cl.registerOutParameter(1, java.sql.Types.INTEGER);
            cl.setString("_DUsuario", u.getApodo());
            cl.setString("_DClave", u.getClave());
            cl.setString("_DApellidoPat", u.getApellidoPat());
            cl.setString("_DApellidoMat", u.getApellidoMat());
            cl.setString("_DNombre", u.getNombre());
            cl.setString("_DCorreo", u.getCorreo());
            cl.setInt("_TipoUsuario", u.getTipoUsuario());
            cl.executeUpdate();
            
            u.setIdUsuario(cl.getInt(1));
            
            cn.commit();
        } catch (Exception ex) {
            rollback(cn);
            throw new Exception(ex);
            
        } finally{
             cerrar(cl);
             cerrar(cn);
             
        }
        
        
    }

    @Override
    public void actualizar(Usuario e) throws Exception {
                   try {
            
            cn = obtenerConexion();
            cn.setAutoCommit(false);

            cl = cn.prepareCall("{ CALL usp_actualizar_usuario(?,?,?,?,?,?)}");
            cl.setInt(1, e.getIdUsuario());
            cl.setString(2, e.getClave());
            cl.setString(3, e.getNombre());
            cl.setString(4, e.getApellidoPat());
            cl.setString(5, e.getApellidoMat());
            cl.setString(6, e.getCorreo());
            cl.executeUpdate();
            cn.commit();
             
        } catch (Exception ex) {
            rollback(cn);
            throw new Exception(ex);
            
        } finally{
             cerrar(cl);
             cerrar(cn);
             
        }
     
    
    }

    @Override
    public void eliminar(Integer idUsuario) throws Exception {
            
              try {
            
            cn = obtenerConexion();
            cn.setAutoCommit(false);

            cl = cn.prepareCall("{ CALL usp_eliminar_usuario(?)}");
            cl.setInt(1, idUsuario);
            cl.executeUpdate();
            
             cn.commit();
        } catch (Exception ex) {
            rollback(cn);
            throw new Exception(ex);
            
        } finally{
             cerrar(cl);
             cerrar(cn);
             
        }   
    }

    @Override
    public Usuario obtener(Integer idUsuario) throws Exception {
              Usuario u = null;
               
            try {
                   cn = obtenerConexion();
                   cl = cn.prepareCall(" {CALL spGet_Alumno(?)}");
                   cl.setInt(1, idUsuario);
                   rs = cl.executeQuery();
                 
                   
                            if( rs.next())
                            {
                                    u = new Usuario();
                                    u.setIdUsuario( rs.getInt(1));
                                    u.setApodo(rs.getString(2));
                                    u.setClave(rs.getString(3));
                                    u.setNombre(rs.getString(4));
                                    u.setApellidoPat(rs.getString(5));
                                    u.setApellidoMat(rs.getString(6));
                                    u.setCorreo(rs.getString(7));                          
                                   
                            }
                   
                } catch (Exception ex) {
                        throw new Exception(ex);
                }finally{
                        cerrar(rs);
                        cerrar(cl);
                        cerrar(cn);
            }
            return u;
        
    
    }

    @Override
    public List<Usuario> listar() throws Exception {
    
            List<Usuario> lista = new ArrayList<Usuario>();
            
            try {
                   cn = obtenerConexion();
                   cl = cn.prepareCall(" {CALL usp_obtener_usuarios_todos()}");
                   rs = cl.executeQuery();
                    
                            while( rs.next())
                            {
                                    Usuario u = new Usuario();
                                    u.setIdUsuario( rs.getInt(1));
                                    u.setApodo(rs.getString(2));
                                    u.setClave(rs.getString(3));
                                    u.setNombre(rs.getString(4));
                                    u.setApellidoPat(rs.getString(5));
                                    u.setApellidoMat(rs.getString(6));
                                    u.setCorreo(rs.getString(7));
                                    u.setTipoUsuario(rs.getInt(8));
                                    lista.add(u);
                            }
                   
                } catch (Exception ex) {
                        throw new Exception(ex);
                }finally{
                        cerrar(rs);
                        cerrar(cl);
                        cerrar(cn);
            }
    
                
       return lista;
    }
   
    
}
