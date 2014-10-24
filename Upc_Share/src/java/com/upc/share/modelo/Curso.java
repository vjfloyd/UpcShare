package com.upc.share.modelo;

public class Curso {
    private Integer codCurso;
    private String nombre;
    private Integer cicloCarrera;
    private Integer nCreditos;

    public Curso() {
    }
    
    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCicloCarrera() {
        return cicloCarrera;
    }

    public void setCicloCarrera(Integer cicloCarrera) {
        this.cicloCarrera = cicloCarrera;
    }

    public Integer getnCreditos() {
        return nCreditos;
    }

    public void setnCreditos(Integer nCreditos) {
        this.nCreditos = nCreditos;
    }
             
}
