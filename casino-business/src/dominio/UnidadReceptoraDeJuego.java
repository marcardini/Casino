package dominio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class UnidadReceptoraDeJuego {
    
    private int id;
    private String usuarioCreador;
    private String fechaCreacion;
    private boolean eliminada;
    
    public UnidadReceptoraDeJuego(Jugador usuarioCreador){
        this.usuarioCreador = usuarioCreador.getNombre();
        this.fechaCreacion = this.ObtenerFechaHoraActual();
        usuarioCreador.setUnidadReceptoraDeJuegoActual(this);
    }
    
    public int getId() {
        return id;
    }
    
    public String getUsuarioCreador() {
        return usuarioCreador;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public boolean isEliminada() {
        return eliminada;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setUsuarioCreador(String usuarioCreador) {
        this.usuarioCreador = usuarioCreador;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public void setEliminada(boolean eliminada) {
        this.eliminada = eliminada;
    }
    
    private String ObtenerFechaHoraActual()
    {
        String retorno = "";
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        Date fecha = new Date();
        retorno = dateFormat.format(fecha);
        return retorno;
    }
}
