/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acciones;

import classes.Comentario;
import classes.Noticia;
import classes.Notificacion;
import classes.Usuario;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;
import persistencia.ComentarioREST;
import persistencia.NoticiaREST;
import persistencia.NotificacionREST;
import persistencia.UsuarioREST;

/**
 *
 * @author Juanma
 */
public class Comentar extends ActionSupport {
    
    Integer idComentario;
    String nombreUsuario;
    String idNoticia;
    Date fechaComentario;
    String mensaje;
    
    public Comentar() {
    }
    
    public String execute() throws Exception {
        fechaComentario = new Date();
        
        NoticiaREST nr = new NoticiaREST();
        GenericType<Noticia> gt2 = new GenericType<Noticia>(){};
        Noticia n = nr.find_XML(gt2, idNoticia);
        
        Comentario c = new Comentario();
        c.setIdComentario(null);
        c.setIdPadre(null);
        c.setIdNoticia(n);
        c.setFechaComentario(fechaComentario);
        c.setMensaje(mensaje);
        c.setNombreUsuario(nombreUsuario);

        ComentarioREST cr = new ComentarioREST();
        GenericType<Comentario> gt3 = new GenericType<Comentario>(){};
        cr.create_XML(c);
        NotificacionREST notifir = new NotificacionREST(); 
        Notificacion notifi = new Notificacion();
        notifi.setFechaNotifiacion(fechaComentario);
        notifi.setMensaje("Nuevo Comentario en la Noticia: " + n.getTituloNoticia());
        notifi.setNombreUsuario(n.getNombreUsuario());
        notifir.create_XML(notifi);
        return SUCCESS;
        
    }

    public Integer getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(Integer idComentario) {
        this.idComentario = idComentario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getIdNoticia() {
        return idNoticia;
    }

    public void setIdNoticia(String idNoticia) {
        this.idNoticia = idNoticia;
    }

    public Date getFechaComentario() {
        return fechaComentario;
    }

    public void setFechaComentario(Date fechaComentario) {
        this.fechaComentario = fechaComentario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
}