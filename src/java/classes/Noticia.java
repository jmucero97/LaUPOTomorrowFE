package classes;
// Generated 07-jun-2018 11:59:51 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Noticia generated by hbm2java
 */
public class Noticia  implements java.io.Serializable {


     private Integer idNoticia;
     private Categoria categoria;
     private Historia historia;
     private Usuario usuario;
     private String tituloNoticia;
     private String subtituloNoticia;
     private String cuerpoNoticia;
     private Date fechaNoticia;
     private String localizacion;
     private String imagen;
     private Set comentarios = new HashSet(0);
     private Set tags = new HashSet(0);

    public Noticia() {
    }

	
    public Noticia(String tituloNoticia, String subtituloNoticia, String cuerpoNoticia, Date fechaNoticia, String localizacion, String imagen) {
        this.tituloNoticia = tituloNoticia;
        this.subtituloNoticia = subtituloNoticia;
        this.cuerpoNoticia = cuerpoNoticia;
        this.fechaNoticia = fechaNoticia;
        this.localizacion = localizacion;
        this.imagen = imagen;
    }
    public Noticia(Categoria categoria, Historia historia, Usuario usuario, String tituloNoticia, String subtituloNoticia, String cuerpoNoticia, Date fechaNoticia, String localizacion, String imagen, Set comentarios, Set tags) {
       this.categoria = categoria;
       this.historia = historia;
       this.usuario = usuario;
       this.tituloNoticia = tituloNoticia;
       this.subtituloNoticia = subtituloNoticia;
       this.cuerpoNoticia = cuerpoNoticia;
       this.fechaNoticia = fechaNoticia;
       this.localizacion = localizacion;
       this.imagen = imagen;
       this.comentarios = comentarios;
       this.tags = tags;
    }
   
    public Integer getIdNoticia() {
        return this.idNoticia;
    }
    
    public void setIdNoticia(Integer idNoticia) {
        this.idNoticia = idNoticia;
    }
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Historia getHistoria() {
        return this.historia;
    }
    
    public void setHistoria(Historia historia) {
        this.historia = historia;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getTituloNoticia() {
        return this.tituloNoticia;
    }
    
    public void setTituloNoticia(String tituloNoticia) {
        this.tituloNoticia = tituloNoticia;
    }
    public String getSubtituloNoticia() {
        return this.subtituloNoticia;
    }
    
    public void setSubtituloNoticia(String subtituloNoticia) {
        this.subtituloNoticia = subtituloNoticia;
    }
    public String getCuerpoNoticia() {
        return this.cuerpoNoticia;
    }
    
    public void setCuerpoNoticia(String cuerpoNoticia) {
        this.cuerpoNoticia = cuerpoNoticia;
    }
    public Date getFechaNoticia() {
        return this.fechaNoticia;
    }
    
    public void setFechaNoticia(Date fechaNoticia) {
        this.fechaNoticia = fechaNoticia;
    }
    public String getLocalizacion() {
        return this.localizacion;
    }
    
    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
    public String getImagen() {
        return this.imagen;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public Set getComentarios() {
        return this.comentarios;
    }
    
    public void setComentarios(Set comentarios) {
        this.comentarios = comentarios;
    }
    public Set getTags() {
        return this.tags;
    }
    
    public void setTags(Set tags) {
        this.tags = tags;
    }




}

