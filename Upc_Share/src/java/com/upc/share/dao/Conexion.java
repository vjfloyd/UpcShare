package com.upc.share.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

class Conexion {
   
    protected Connection cn = null;
     protected CallableStatement cl = null;
     protected ResultSet rs = null;
     
     protected Connection obtenerConexion() throws Exception{
         Class.forName("com.mysql.jdbc.Driver");
         String url = "jdbc:mysql://localhost:3333/UpcShare";
         String usuario = "root";
         String clave = "";
         return DriverManager.getConnection(url,usuario,clave);
                 
     }
     
     
     protected void cerrar(Connection var){
         try{
             var.close();
         }catch (Exception e){
             
         }
     }
     
     
     protected void cerrar(CallableStatement var){
         try{
             var.close();
         }catch (Exception e){
             
         }
     }
     
     
     protected void cerrar(ResultSet var){
         try{
             var.close();
         }catch (Exception e){
             
         }
     }
     
     
     protected void rollback(Connection var){
         try{
             var.rollback();
         }catch(Exception e){
             
         }
     }
    
    
}
