package sici.modelo;
// Generated 18/10/2017 21:00:20 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Unidad generated by hbm2java
 */
public class Unidad  implements java.io.Serializable {


     private Integer idUnidad;
     private String descripcion;
     private Integer estado;
     private Set articulos = new HashSet(0);

    public Unidad() {
    }

    public Unidad(String descripcion, Integer estado, Set articulos) {
       this.descripcion = descripcion;
       this.estado = estado;
       this.articulos = articulos;
    }
   
    public Integer getIdUnidad() {
        return this.idUnidad;
    }
    
    public void setIdUnidad(Integer idUnidad) {
        this.idUnidad = idUnidad;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getEstado() {
        return this.estado;
    }
    
    public void setEstado(Integer estado) {
        this.estado = estado;
    }
    public Set getArticulos() {
        return this.articulos;
    }
    
    public void setArticulos(Set articulos) {
        this.articulos = articulos;
    }




}


